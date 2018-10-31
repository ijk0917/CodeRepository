package com.imooc.heqi.JC.JCFootball.JCFootballOpenModel;

import java.util.List;
import java.util.Map;

public class JCFootballOpenModelResultOddslistInfo {
    private String single;
    private String goalline;
    private List<Map<String,String>> odds;

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getGoalline() {
        return goalline;
    }

    public void setGoalline(String goalline) {
        this.goalline = goalline;
    }

    public List<Map<String, String>> getOdds() {
        return odds;
    }

    public void setOdds(List<Map<String, String>> odds) {
        this.odds = odds;
    }
}
