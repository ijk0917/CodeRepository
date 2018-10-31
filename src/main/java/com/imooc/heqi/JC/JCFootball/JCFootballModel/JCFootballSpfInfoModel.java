package com.imooc.heqi.JC.JCFootball.JCFootballModel;

import java.util.Map;

public class JCFootballSpfInfoModel extends JCFootballCommonInfoModel {

    private Map<String ,String> had;

    /*
     * 负
     * */
    public String getF() {
        return had.get("a");
    }
    /*
     * 平
     * */
    public String getP() {
        return had.get("d");
    }
    /*
     * 胜
     * */
    public String getS() {
        return had.get("h");
    }


    @Override
    public String getP_code() {
        return had.get("p_code");
    }

    @Override
    public String getO_type() {
        return had.get("o_type");
    }

    @Override
    public String getP_id() {
        return had.get("p_id");
    }

    @Override
    public String getP_status() {
        return had.get("p_status");
    }

    @Override
    public String getSingle() {
        return had.get("single");
    }

    @Override
    public String getAllup() {
        return had.get("allup");
    }

    @Override
    public String getGoalline() {
        return had.get("goalline");
    }

    @Override
    public String getFixedodds() {
        return had.get("fixedodds");
    }

    @Override
    public String getCbt() {
        return had.get("cbt");
    }

    @Override
    public String getInt() {
        return had.get("int");
    }

    @Override
    public String getVbt() {
        return had.get("vbt");
    }

    @Override
    public String getH_trend() {
        return had.get("h_trend");
    }

    @Override
    public String getA_trend() {
        return had.get("a_trend");
    }

    @Override
    public String getD_trend() {
        return had.get("d_trend");
    }

    @Override
    public String getL_trend() {
        return had.get("l_trend");
    }
}
