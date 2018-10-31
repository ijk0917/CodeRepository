package com.imooc.heqi.JC.JCFootball.JCFootballModel;

import java.util.Map;

public class JCFootballZjqInfoModel extends JCFootballCommonInfoModel {

    private Map<String,String> ttg;

    public String getS0() { return ttg.get("s0"); }

    public String getS1() {
        return ttg.get("s1");
    }

    public String getS2() {
        return ttg.get("s2");
    }

    public String getS3() {
        return ttg.get("s3");
    }

    public String getS4() {
        return ttg.get("s4");
    }

    public String getS5() {
        return ttg.get("s5");
    }

    public String getS6() {
        return ttg.get("s6");
    }

    public String getS7() {
        return ttg.get("s7");
    }

    @Override
    public String getP_code() {
        return ttg.get("p_code");
    }

    @Override
    public String getO_type() {
        return ttg.get("o_type");
    }

    @Override
    public String getP_id() {
        return ttg.get("p_id");
    }

    @Override
    public String getP_status() {
        return ttg.get("p_status");
    }

    @Override
    public String getSingle() {
        return ttg.get("single");
    }

    @Override
    public String getAllup() {
        return ttg.get("allup");
    }

    @Override
    public String getGoalline() {
        return ttg.get("goalline");
    }

    @Override
    public String getFixedodds() {
        return ttg.get("fixedodds");
    }

    @Override
    public String getCbt() {
        return ttg.get("cbt");
    }

    @Override
    public String getInt() {
        return ttg.get("int");
    }

    @Override
    public String getVbt() {
        return ttg.get("vbt");
    }

    @Override
    public String getH_trend() {
        return ttg.get("h_trend");
    }

    @Override
    public String getA_trend() {
        return ttg.get("a_trend");
    }

    @Override
    public String getD_trend() {
        return ttg.get("d_trend");
    }

    @Override
    public String getL_trend() {
        return ttg.get("l_trend");
    }
}
