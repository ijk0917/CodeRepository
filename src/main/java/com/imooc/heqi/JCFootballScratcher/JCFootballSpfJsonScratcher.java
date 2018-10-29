package com.imooc.heqi.JCFootballScratcher;

import com.google.gson.Gson;
import com.imooc.heqi.JCFootballSpfModel.JCFootballModel;
import com.imooc.heqi.util.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JCFootballSpfJsonScratcher {
    private static final Logger logger = LoggerFactory.getLogger(JCFootballSpfJsonScratcher.class);

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
            String json = new String();
            json = HttpUtils.doGet(url);
            json = StringUtils.substringBetween(json, "getData(", ");");
            logger.info("json: " + json);

            if (!StringUtils.isEmpty(json)) {
                //开奖信息注入
                Gson gson = new Gson();
                logger.info("开始转换！");
                JCFootballModel jcFootballSpfModel = gson.fromJson(json, JCFootballModel.class);
                for(Map.Entry<String,Map<String ,Object>> entry:jcFootballSpfModel.getData().entrySet()){
                    Map<String ,Object> map = entry.getValue();
                    logger.info("h_cn" + map.get("h_cn").toString());
                }

//                logger.info("-------------------------------jcFootballSpfModel: " + jcFootballSpfModel.getData());
//                logger.info("-------------------------------jcFootballSpfModel: " + jcFootballSpfModel.getData().get(0).get("a_cn"));
                //TODO
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
            String url = "http://i.sporttery.cn/odds_calculator/get_odds?i_format=json&i_callback=getData&poolcode[]=had";
            JCFootballSpfJsonScratcher scratcher = new JCFootballSpfJsonScratcher();
            scratcher.setUrl(url);
            scratcher.scratch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
