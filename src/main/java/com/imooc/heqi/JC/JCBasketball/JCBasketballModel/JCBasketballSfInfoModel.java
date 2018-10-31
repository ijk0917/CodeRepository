package com.imooc.heqi.JC.JCBasketball.JCBasketballModel;

import java.util.Map;

public class JCBasketballSfInfoModel extends JCBasketballCommonInfoModel {

    private Map<String,String> mnl;

    public String getS(){
        return mnl.get("h");
    }
    public String getF(){
        return mnl.get("a");
    }

    @Override
    public String getP_code() {
        return mnl.get("p_code");
    }

    @Override
    public String getO_type() {
        return mnl.get("o_type");
    }

    @Override
    public String getP_id() {
        return mnl.get("p_id");
    }

    @Override
    public String getP_status() {
        return mnl.get("p_status");
    }

    @Override
    public String getSingle() {
        return mnl.get("single");
    }

    @Override
    public String getAllup() {
        return mnl.get("allup");
    }

    @Override
    public String getGoalline() {
        return mnl.get("goalline");
    }

    @Override
    public String getFixedodds() {
        return mnl.get("fixedodds");
    }

    @Override
    public String getCbt() {
        return mnl.get("cbt");
    }

    @Override
    public String getInt() {
        return mnl.get("int");
    }

    @Override
    public String getVbt() {
        return mnl.get("vbt");
    }

    @Override
    public String getH_trend() {
        return mnl.get("h_trend");
    }

    @Override
    public String getA_trend() {
        return mnl.get("a_trend");
    }

    @Override
    public String getD_trend() {
        return mnl.get("d_trend");
    }

    @Override
    public String getL_trend() {
        return mnl.get("l_trend");
    }



}
