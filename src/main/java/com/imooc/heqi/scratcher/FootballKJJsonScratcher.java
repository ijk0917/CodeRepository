package com.imooc.heqi.scratcher;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.heqi.scratcherModel.JCFootballKaiJiangModel;
import com.imooc.heqi.util.HttpUtils;
import freemarker.template.utility.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FootballKJJsonScratcher {
    private static final Logger logger = LoggerFactory.getLogger(FootballKJJsonScratcher.class);

    private String url;

    public FootballKJJsonScratcher() {
        super();
        // TODO Auto-generated constructor stub
    }

    public FootballKJJsonScratcher(String url) {
        super();
        this.url = url;
    }
    public static Integer total = 0;

    public String scratch() {
        if (null == url || "".equals(url)) return null;
        if (logger.isInfoEnabled()) {
            logger.info("开始抓取竞彩网竞足开奖json数据");
        }
        total++;
        String retVal = null;
        try {
            String json = new String();
            json = HttpUtils.doGet(url);
            json = StringUtils.substringBetween(json, "pool_prcess(", ");");
            logger.info("json: " + json);

            if (!StringUtils.isEmpty(json)) {
                //开奖信息注入
                Gson gson = new Gson();
//                Map<String ,Object> map = gson.fromJson(json,new TypeToken<Map<String, Object>>() {}.getType());
//
//                for(Map.Entry entry:map.entrySet()){
//                    logger.info("entry.key: " + entry.getKey());
//                    logger.info("entry.value: " + entry.getValue());
//                }

                logger.info("开始转换！");
                JCFootballKaiJiangModel jcFootballKaiJiangModel = gson.fromJson(json,JCFootballKaiJiangModel.class);
                logger.info("-------------------------------jcFootballKaiJiangModel: " + jcFootballKaiJiangModel.getResult().getPool_rs().getHad().getPrs_name());
                //TODO
            }


            retVal = json;

            if (logger.isInfoEnabled()) {
                logger.info("结束抓取竞彩网竞足开奖json数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("在获取json时发生严重的错误！！！");
        }
        return retVal;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public static void main(String[] args) {
        try {
            String url = "http://i.sporttery.cn/api/fb_match_info/get_pool_rs/?f_callback=pool_prcess&mid=112538";
            FootballKJJsonScratcher scratcher = new FootballKJJsonScratcher(url);
            scratcher.scratch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
