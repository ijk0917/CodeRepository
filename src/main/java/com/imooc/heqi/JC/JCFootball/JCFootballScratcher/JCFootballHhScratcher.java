package com.imooc.heqi.JC.JCFootball.JCFootballScratcher;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.heqi.util.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JCFootballHhScratcher {
    private static final Logger logger = LoggerFactory.getLogger(JCFootballHhScratcher.class);

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
            logger.info("开始抓取竞彩网竞足开奖数据");
        }
        Map<String, List<String>> retVal = new HashMap<String, List<String>>();
        try {

            String json = new String();
            json = HttpUtils.doGet(url);
            json = StringUtils.substringBetween(json, "var data=", ";getData();");
            logger.info("json: " + json);

            if(!StringUtils.isEmpty(json)) {
                Gson gson = new Gson();
                List<List<List<String>>> lll = gson.fromJson(json, new TypeToken<List<List<List<String>>>>() {}.getType());

                for(List<List<String>> match :lll) {
                    //比赛信息
                    List<String> info = match.get(0);

                    //让球胜平负
                    List<String> rqspf = match.get(1);

                    //比分 [0-12]胜 [13-17]平 [18-31]负
                    List<String> bf = match.get(2);

                    //总进球
                    List<String> zjq = match.get(3);

                    //半全场
                    List<String> bqc = match.get(4);

                    //胜平负
                    List<String> spf = match.get(5);
                }

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
            String url = "http://info.sporttery.cn/interface/interface_mixed.php?action=fb_list";
            JCFootballHhScratcher scratcher = new JCFootballHhScratcher();
            scratcher.setUrl(url);
            scratcher.scratch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
