package com.imooc.heqi.JCFootballScratcher;

import com.google.gson.Gson;
import com.imooc.heqi.JCFootballOpenModel.JCFootballOpenModel;
import com.imooc.heqi.util.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JCFootballOpenJsonScratcher {
    private static final Logger logger = LoggerFactory.getLogger(JCFootballOpenJsonScratcher.class);

    private String url;

    public JCFootballOpenJsonScratcher() {
        super();
        // TODO Auto-generated constructor stub
    }

    public JCFootballOpenJsonScratcher(String url) {
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
                JCFootballOpenModel jcFootballKaiJiangModel = gson.fromJson(json, JCFootballOpenModel.class);
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
            JCFootballOpenJsonScratcher scratcher = new JCFootballOpenJsonScratcher(url);
            scratcher.scratch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
