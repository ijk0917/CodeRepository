package com.imooc.heqi.JC.JCBasketball.JCBasketballScratcher;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.heqi.JC.JCBasketball.JCBasketballModel.JCBasketballDxfInfoModel;
import com.imooc.heqi.JC.JCBasketball.JCBasketballModel.JCbasketballInfoModel;
import com.imooc.heqi.util.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JCBasketballDxfJsonScratcher {
    private static final Logger logger = LoggerFactory.getLogger(JCBasketballDxfJsonScratcher.class);

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    public Map<String, List<String>> scratch() {
        if (null == url || "".equals(url)) return null;
        if (logger.isInfoEnabled()) {
            logger.info("开始抓取竞彩网竞篮开奖数据");
        }
        Map<String, List<String>> retVal = new HashMap<String, List<String>>();
        try {
            String json = new String();
            json = HttpUtils.doGet(url);
            json = StringUtils.substringBetween(json, "getData(", ");");
            json = json.replaceAll("int","intt");
            logger.info("json: " + json);

            if (!StringUtils.isEmpty(json)) {
                //开奖信息注入
                Gson gson = new Gson();
                logger.info("开始转换！");
                JCbasketballInfoModel<JCBasketballDxfInfoModel> jCbasketballInfoModel = gson.fromJson(json, new TypeToken<JCbasketballInfoModel<JCBasketballDxfInfoModel>>() {}.getType());
                for(Map.Entry<String,JCBasketballDxfInfoModel> entry:jCbasketballInfoModel.getData().entrySet()){
                    JCBasketballDxfInfoModel result = entry.getValue();
                    logger.info("p_code: " + result.getP_code());
                    logger.info("h: " + result.getD());
                }

                //TODO
            }


            if (logger.isInfoEnabled()) {
                logger.info("结束抓取竞彩网竞篮开奖数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("竞彩网竞篮开奖数据抓包失败");
        }
        return retVal;
    }




    public static void main(String[] args) {
        try {
            String url = "http://i.sporttery.cn/odds_calculator/get_odds?i_format=json&i_callback=getData&poolcode[]=hilo";
            JCBasketballDxfJsonScratcher scratcher = new JCBasketballDxfJsonScratcher();
            scratcher.setUrl(url);
            scratcher.scratch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
