package com.imooc.heqi.JC.JCBasketball.JCBasketballScratcher;

import com.imooc.heqi.util.JCScratcherConstant;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JCBasketballOpenDetailScratcher {
    private static final Logger logger = LoggerFactory.getLogger(JCBasketballOpenDetailScratcher.class);

    private String url;
    private Integer page = 1;
    private String start_date;
    private String end_date;

    public static Logger getLogger() {
        return logger;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    //获取最后一页的值
    public Integer fianlPageNumber(Elements pages){
        try {
            if(pages.size() == 1){
                return new Integer(1);
            }
            Element element = pages.get(pages.size() - JCScratcherConstant.JCPageNumber);
            String Page = element.select("a").attr("href");
            Page = StringUtils.substringBetween(Page, "page=", "&");
//            logger.info("Page: " + Page);
            return Integer.valueOf(Page);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Integer(1);
    }

    //设置url
    public String URL(){
        StringBuffer URL = new StringBuffer();
        URL.append(this.url);
        URL.append("?page="+this.page);
        if(!StringUtils.isEmpty(this.start_date)){
            URL.append("&start_date="+this.start_date);
        }
        if(!StringUtils.isEmpty(this.end_date)){
            URL.append("&end_date="+this.end_date);
        }
//        logger.info("URL.toString(): " + URL.toString());
        return URL.toString();
    }



    //组装比赛数据
    public void getMatchList(Elements matchList){
        for (int i = 0; i < matchList.size()- JCScratcherConstant.JCMatchListNumber; i++) {
            Element tr = matchList.get(i);
            Elements tds = tr.select("td");
            for (int j = 0; j < tds.size(); j++) {
                Element td = tds.get(j);
                if(j == 3) {
                    logger.info("td[" + j + "]: " + td.text());
                }

                //详情
                if (12 == j) {
                    String subUrl = td.select("a").attr("href");
                    logger.info("subUrl: " + subUrl);
//                    logger.info("uurl: " + uurl);
                    if (!StringUtils.isEmpty(subUrl)) {
                        //再次抓包
                        try {
                            Document doc = Jsoup.connect(subUrl).userAgent("Mozilla").maxBodySize(1024 * 1024 * 10).timeout(1800000).get();
                            Elements DetailTable = doc.select("body > div[class=all-wrap] > table");
                            logger.info("DetailTable: " + DetailTable.size());
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    } else {
                        //未开奖
                    }
                }

            }
//            logger.info("----------------------------------------");
        }
    }



    public Map<String, List<String>> scratch() {
        if (null == url || "".equals(url)) return null;
        if (logger.isInfoEnabled()) {
            logger.info("开始抓取竞彩网竞篮开奖数据");
        }
        Map<String, List<String>> retVal = new HashMap<String, List<String>>();
        try {
            logger.info("URL: " + URL());
            Document doc = Jsoup.connect(URL()).userAgent("Mozilla").maxBodySize(1024 * 1024 * 10).timeout(1800000).get();
            Elements matchList = doc.select("body > div.all-wrap.m-min > div.match_list > table > tbody > tr");
            if(null == matchList)return  null;
//            logger.info("matchList: " + matchList);
            Elements pages = doc.select("body > div.all-wrap.m-min > div.match_list > table > tbody > tr:last-child > td > table > tbody > tr > td > ul >li");
            if(null == pages)return  null;
            //组装比赛数据
            getMatchList(matchList);

            //翻页
            Integer Page = fianlPageNumber(pages);
            logger.info("Page: "+Page);
            for(int p = 2;p<=Page ;p++) {
                this.page=p;
//                logger.info("this.page: " +this.page);
                //重新抓取下一页的包
                doc = Jsoup.connect(URL()).userAgent("Mozilla").maxBodySize(1024 * 1024 * 10).timeout(1800000).get();
                matchList = doc.select("body > div.all-wrap.m-min > div.match_list > table > tbody >tr");
                if(null == matchList)return  null;
                //组装比赛数据
                getMatchList(matchList);
            }
            if (logger.isInfoEnabled()) {
                logger.info("结束抓取竞彩网竞足开奖数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("竞彩网竞足开奖数据抓包失败");
        }
        return retVal;
    }




    public static void main(String[] args) {
        try {
            String url = "http://info.sporttery.cn/basketball/match_result.php";
            JCBasketballOpenDetailScratcher scratcher = new JCBasketballOpenDetailScratcher();
            scratcher.setUrl(url);
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd" );
            Date date= new Date();
            String time = sdf.format(date);
            scratcher.setStart_date(time);
            scratcher.setEnd_date(time);
            scratcher.scratch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
