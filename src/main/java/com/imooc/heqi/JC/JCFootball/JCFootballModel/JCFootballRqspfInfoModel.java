package com.imooc.heqi.JC.JCFootball.JCFootballModel;

import java.util.Map;

public class JCFootballRqspfInfoModel extends JCFootballCommonInfoModel{
    private Map<String ,String> hhad;

    /*
     * 负
     * */
    public String getF() {
        return hhad.get("a");
    }
    /*
     * 平
     * */
    public String getP() {
        return hhad.get("d");
    }
    /*
     * 胜
     * */
    public String getS() {
        return hhad.get("h");
    }


    @Override
    public String getP_code() {
        return hhad.get("p_code");
    }

    @Override
    public String getO_type() {
        return hhad.get("o_type");
    }

    @Override
    public String getP_id() {
        return hhad.get("p_id");
    }

    @Override
    public String getP_status() {
        return hhad.get("p_status");
    }

    @Override
    public String getSingle() {
        return hhad.get("single");
    }

    @Override
    public String getAllup() {
        return hhad.get("allup");
    }

    @Override
    public String getGoalline() {
        return hhad.get("goalline");
    }

    @Override
    public String getFixedodds() {
        return hhad.get("fixedodds");
    }

    @Override
    public String getCbt() {
        return hhad.get("cbt");
    }

    @Override
    public String getInt() {
        return hhad.get("int");
    }

    @Override
    public String getVbt() {
        return hhad.get("vbt");
    }

    @Override
    public String getH_trend() {
        return hhad.get("h_trend");
    }

    @Override
    public String getA_trend() {
        return hhad.get("a_trend");
    }

    @Override
    public String getD_trend() {
        return hhad.get("d_trend");
    }

    @Override
    public String getL_trend() {
        return hhad.get("l_trend");
    }
}
