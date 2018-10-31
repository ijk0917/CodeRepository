package com.imooc.heqi.JC.JCBasketball.JCBasketballModel;

import java.util.Map;

public class JCBasketballDxfInfoModel extends JCBasketballCommonInfoModel {
    private Map<String,String> hilo;

    public String getD(){
        return hilo.get("h");
    }

    public String getX(){
        return hilo.get("l");
    }

    @Override
    public String getP_code() {
        return hilo.get("p_code");
    }

    @Override
    public String getO_type() {
        return hilo.get("o_type");
    }

    @Override
    public String getP_id() {
        return hilo.get("p_id");
    }

    @Override
    public String getP_status() {
        return hilo.get("p_status");
    }

    @Override
    public String getSingle() {
        return hilo.get("single");
    }

    @Override
    public String getAllup() {
        return hilo.get("allup");
    }

    @Override
    public String getGoalline() {
        return hilo.get("goalline");
    }

    @Override
    public String getFixedodds() {
        return hilo.get("fixedodds");
    }

    @Override
    public String getCbt() {
        return hilo.get("cbt");
    }

    @Override
    public String getInt() {
        return hilo.get("int");
    }

    @Override
    public String getVbt() {
        return hilo.get("vbt");
    }

    @Override
    public String getH_trend() {
        return hilo.get("h_trend");
    }

    @Override
    public String getA_trend() {
        return hilo.get("a_trend");
    }

    @Override
    public String getD_trend() {
        return hilo.get("d_trend");
    }

    @Override
    public String getL_trend() {
        return hilo.get("l_trend");
    }
}
