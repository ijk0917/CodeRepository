package com.imooc.heqi.JC.JCBasketball.JCBasketballModel;

import java.util.Map;

public class JCBasketballSfcInfoModel extends JCBasketballCommonInfoModel {
    private Map<String,String> wnm;

    public String getW1(){
        return wnm.get("w1");
    }

    public String getW2(){
        return wnm.get("w2");
    }

    public String getW3(){
        return wnm.get("w3");
    }

    public String getW4(){
        return wnm.get("w4");
    }

    public String getW5(){
        return wnm.get("w5");
    }

    public String getW6(){
        return wnm.get("w6");
    }

    public String getL1(){
        return  wnm.get("l1");
    }

    public String getL2(){
        return  wnm.get("l2");
    }

    public String getL3(){
        return  wnm.get("l3");
    }

    public String getL4(){
        return  wnm.get("l4");
    }
    public String getL5(){
        return  wnm.get("l5");
    }
    public String getL6(){
        return  wnm.get("l6");
    }

    @Override
    public String getP_code() {
        return wnm.get("p_code");
    }

    @Override
    public String getO_type() {
        return wnm.get("o_type");
    }

    @Override
    public String getP_id() {
        return wnm.get("p_id");
    }

    @Override
    public String getP_status() {
        return wnm.get("p_status");
    }

    @Override
    public String getSingle() {
        return wnm.get("single");
    }

    @Override
    public String getAllup() {
        return wnm.get("allup");
    }

    @Override
    public String getGoalline() {
        return wnm.get("goalline");
    }

    @Override
    public String getFixedodds() {
        return wnm.get("fixedodds");
    }

    @Override
    public String getCbt() {
        return wnm.get("cbt");
    }

    @Override
    public String getInt() {
        return wnm.get("int");
    }

    @Override
    public String getVbt() {
        return wnm.get("vbt");
    }

    @Override
    public String getH_trend() {
        return wnm.get("h_trend");
    }

    @Override
    public String getA_trend() {
        return wnm.get("a_trend");
    }

    @Override
    public String getD_trend() {
        return wnm.get("d_trend");
    }

    @Override
    public String getL_trend() {
        return wnm.get("l_trend");
    }

}
