package com.imooc.heqi.JC.JCBasketball.JCBasketballModel;

import java.util.Map;

public class JCBasketballRfsfInfoModel extends JCBasketballCommonInfoModel {
    private Map<String,String> hdc;

    public String getS(){
        return hdc.get("h");
    }
    public String getF(){
        return hdc.get("a");
    }

    @Override
    public String getP_code() {
        return hdc.get("p_code");
    }

    @Override
    public String getO_type() {
        return hdc.get("o_type");
    }

    @Override
    public String getP_id() {
        return hdc.get("p_id");
    }

    @Override
    public String getP_status() {
        return hdc.get("p_status");
    }

    @Override
    public String getSingle() {
        return hdc.get("single");
    }

    @Override
    public String getAllup() {
        return hdc.get("allup");
    }

    @Override
    public String getGoalline() {
        return hdc.get("goalline");
    }

    @Override
    public String getFixedodds() {
        return hdc.get("fixedodds");
    }

    @Override
    public String getCbt() {
        return hdc.get("cbt");
    }

    @Override
    public String getInt() {
        return hdc.get("int");
    }

    @Override
    public String getVbt() {
        return hdc.get("vbt");
    }

    @Override
    public String getH_trend() {
        return hdc.get("h_trend");
    }

    @Override
    public String getA_trend() {
        return hdc.get("a_trend");
    }

    @Override
    public String getD_trend() {
        return hdc.get("d_trend");
    }

    @Override
    public String getL_trend() {
        return hdc.get("l_trend");
    }
}
