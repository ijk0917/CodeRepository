package com.imooc.heqi.JC.JCFootball.JCFootballModel;

import java.util.Map;

public class JCFootballBqcInfoModel extends JCFootballCommonInfoModel {
    private Map<String,String> hafu;

    /*
    *
    * */
    public String getFF(){
        return hafu.get("aa");
    }

    public String getFP() {
        return hafu.get("ad");
    }

    public String getFS() {
        return hafu.get("ah");
    }

    public String getPF(){
        return hafu.get("da");
    }

    public String getPP(){
        return hafu.get("dd");
    }

    public String getPS() {
        return hafu.get("dh");
    }

    public String getSF(){
        return hafu.get("ha");
    }

    public String getSP(){
        return hafu.get("hd");
    }

    public String getSS(){
        return hafu.get("hh");
    }


    @Override
    public String getP_code() {
        return hafu.get("p_code");
    }

    @Override
    public String getO_type() {
        return hafu.get("o_type");
    }

    @Override
    public String getP_id() {
        return hafu.get("p_id");
    }

    @Override
    public String getP_status() {
        return hafu.get("p_status");
    }

    @Override
    public String getSingle() {
        return hafu.get("single");
    }

    @Override
    public String getAllup() {
        return hafu.get("allup");
    }

    @Override
    public String getGoalline() {
        return hafu.get("goalline");
    }

    @Override
    public String getFixedodds() {
        return hafu.get("fixedodds");
    }

    @Override
    public String getCbt() {
        return hafu.get("cbt");
    }

    @Override
    public String getInt() {
        return hafu.get("int");
    }

    @Override
    public String getVbt() {
        return hafu.get("vbt");
    }

    @Override
    public String getH_trend() {
        return hafu.get("h_trend");
    }

    @Override
    public String getA_trend() {
        return hafu.get("a_trend");
    }

    @Override
    public String getD_trend() {
        return hafu.get("d_trend");
    }

    @Override
    public String getL_trend() {
        return hafu.get("l_trend");
    }
}
