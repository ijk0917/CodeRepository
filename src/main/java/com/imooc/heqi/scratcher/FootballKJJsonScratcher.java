package com.imooc.heqi.scratcher;

import com.imooc.heqi.util.HttpUtils;
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


    public String scratch(){
        if (null == url || "".equals(url)) return null;
        String retVal = null;
        if (logger.isInfoEnabled()) {
            logger.info("开始抓取竞篮开奖数据");
        }
        try {
            String json = new String();
            try {
                json = HttpUtils.doGet(url);
                json = StringUtils.substringBetween(json,"pool_prcess(",");");
                logger.info("json: " +json);

                retVal = json;

            } catch (Exception e) {
                e.printStackTrace();
            }
            if (logger.isInfoEnabled()) {
                logger.info("结束抓取竞篮开奖数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
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
