package com.imooc.heqi.JC.JCFootball.JCFootballModel;

import java.util.Map;

public class JCFootballBfInfoModel extends JCFootballCommonInfoModel {

    private Map<String,String> crs;

    public String getFOther(){
        return crs.get("-1-a");
    }

    public String getPOther(){
        return crs.get("-1-d");
    }

    public String getSOther(){
        return crs.get("-1-h");
    }

    public String get0000(){
        return crs.get("0000");
    }

    public  String get0001(){
        return crs.get("0001");
    }

    public String get0002(){
        return crs.get("0002");
    }
    public String get0003(){
        return crs.get("0003");
    }
    public String get0004(){
        return crs.get("0004");
    }
    public String get0005(){
        return crs.get("0005");
    }
    public String get0100(){
        return crs.get("0100");
    }
    public String get0101(){
        return crs.get("0101");
    }
    public String get0102(){
        return crs.get("0102");
    }
    public String get0103(){
        return crs.get("0103");
    }
    public String get0104(){
        return crs.get("0104");
    }
    public String get0105(){
        return crs.get("0105");
    }
    public String get0200(){
        return crs.get("0200");
    }
    public String get0201(){
        return crs.get("0201");
    }
    public String get0202(){
        return crs.get("0202");
    }
    public String get0203(){
        return crs.get("0203");
    }
    public String get0204(){
        return crs.get("0204");
    }
    public String get0205(){
        return crs.get("0205");
    }
    public String get0300(){
        return crs.get("0300");
    }
    public String get0301(){
        return crs.get("0301");
    }
    public String get0302(){
        return crs.get("0302");
    }
    public String get0303(){
        return crs.get("0303");
    }
    public String get0400(){
        return crs.get("0400");
    }
    public String get0401(){
        return crs.get("0401");
    }
    public String get0402(){
        return crs.get("0402");
    }
    public String get0500(){
        return crs.get("0500");
    }
    public String get0501(){
        return crs.get("0501");
    }
    public String get0502(){
        return crs.get("0502");
    }

    @Override
    public String getP_code() {
        return crs.get("p_code");
    }

    @Override
    public String getO_type() {
        return crs.get("o_type");
    }

    @Override
    public String getP_id() {
        return crs.get("p_id");
    }

    @Override
    public String getP_status() {
        return crs.get("p_status");
    }

    @Override
    public String getSingle() {
        return crs.get("single");
    }

    @Override
    public String getAllup() {
        return crs.get("allup");
    }

    @Override
    public String getGoalline() {
        return crs.get("goalline");
    }

    @Override
    public String getFixedodds() {
        return crs.get("fixedodds");
    }

    @Override
    public String getCbt() {
        return crs.get("cbt");
    }

    @Override
    public String getInt() {
        return crs.get("int");
    }

    @Override
    public String getVbt() {
        return crs.get("vbt");
    }

    @Override
    public String getH_trend() {
        return crs.get("h_trend");
    }

    @Override
    public String getA_trend() {
        return crs.get("a_trend");
    }

    @Override
    public String getD_trend() {
        return crs.get("d_trend");
    }

    @Override
    public String getL_trend() {
        return crs.get("l_trend");
    }
}
