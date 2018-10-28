package com.imooc.heqi.JCFootballScratcher;

import com.imooc.heqi.util.JCFootballScratcherConstant;
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

public class JCFootballSpfScratcher {
    private static final Logger logger = LoggerFactory.getLogger(JCFootballSpfScratcher.class);

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //组装比赛数据
    public void getMatchList(Elements matchList){
        for (int i = 0; i < matchList.size(); i++) {
            Element tr = matchList.get(i);
            Elements tds = tr.select("td");
            if(1 == tds.size()) continue;
            for (int j = 0; j < tds.size(); j++) {
                Element td = tds.get(j);
                if(3 == j) logger.info("队名： " + tds.get(j).text());
//                if(j == 3) {
//                    logger.info("td[" + j + "]: " + td.text());
//                }



            }
//            logger.info("----------------------------------------");
        }
    }



    public Map<String, List<String>> scratch() {
        if (null == url || "".equals(url)) return null;
        if (logger.isInfoEnabled()) {
            logger.info("开始抓取竞彩网竞足开奖数据");
        }
        Map<String, List<String>> retVal = new HashMap<String, List<String>>();
        try {
            Document doc = Jsoup.connect(url).userAgent("Mozilla").maxBodySize(1024 * 1024 * 10).timeout(1800000).get();
            Elements matchList = doc.select("#list_112745 > td.vsTd > label:nth-child(1)");
            logger.info("matchList: "+ matchList);
            if(null == matchList)return  null;

            //组装比赛数据
            getMatchList(matchList);


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
            String url = "http://info.sporttery.cn/football/hhad_list.php";
            JCFootballSpfScratcher scratcher = new JCFootballSpfScratcher();
            scratcher.setUrl(url);
            scratcher.scratch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
