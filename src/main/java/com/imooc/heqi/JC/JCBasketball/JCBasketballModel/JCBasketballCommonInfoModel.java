package com.imooc.heqi.JC.JCBasketball.JCBasketballModel;

import java.util.List;

public abstract class JCBasketballCommonInfoModel {

    public abstract String getP_code();
    public abstract String getO_type();
    public abstract String getP_id();
    public abstract String getP_status();
    public abstract String getSingle();
    public abstract String getAllup();
    public abstract String getGoalline();
    public abstract String getFixedodds();
    public abstract String getCbt();
    public abstract String getInt();
    public abstract String getVbt();
    public abstract String getH_trend();
    public abstract String getA_trend();
    public abstract String getD_trend();
    public abstract String getL_trend();

    /*
     *比赛ID
     */
    private String id;

    /*
     *比赛编号
     */
    private String num;

    /*
     *比赛日期
     */
    private String date;

    /*
     * 比赛时间
     * */
    private String time;

    /*
     * 比赛开始时间
     * */
    private String b_date;

    /*
     * 比赛出售状态
     * */
    private String status;

    /*
     * 联赛ID
     * */
    private String l_id;

    /*
     * 联赛名称
     * */
    private String l_cn;

    /*
     *主队ID
     * */
    private String h_id;

    /*
     *主队名称
     */
    private String h_cn;

    /*
     *客队ID
     * */
    private String a_id;

    /*
     * 客队名称
     * */
    private String a_cn;

    /*
     *
     */
    private String index_show;

    /*
     *
     */
    private String show;

    /*
     *联赛缩写
     */
    private String l_cn_abbr;

    /*
     *主队缩写
     */
    private String h_cn_abbr;

    /*
     *客队缩写
     */
    private String a_cn_abbr;

    /*
     *
     */
    private String h_order;

    /*
     *
     */
    private String a_order;

    /*
     *
     */
    private String h_id_dc;

    /*
     *
     */
    private String a_id_dc;

    /*
     *背景颜色
     */
    private String l_background_color;

    /*
     *天气图片
     */
    private String weather_pic;

    /*
     *比赛信息
     */
    List<Object> match_info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getB_date() {
        return b_date;
    }

    public void setB_date(String b_date) {
        this.b_date = b_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getL_id() {
        return l_id;
    }

    public void setL_id(String l_id) {
        this.l_id = l_id;
    }

    public String getL_cn() {
        return l_cn;
    }

    public void setL_cn(String l_cn) {
        this.l_cn = l_cn;
    }

    public String getH_id() {
        return h_id;
    }

    public void setH_id(String h_id) {
        this.h_id = h_id;
    }

    public String getH_cn() {
        return h_cn;
    }

    public void setH_cn(String h_cn) {
        this.h_cn = h_cn;
    }

    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public String getA_cn() {
        return a_cn;
    }

    public void setA_cn(String a_cn) {
        this.a_cn = a_cn;
    }

    public String getIndex_show() {
        return index_show;
    }

    public void setIndex_show(String index_show) {
        this.index_show = index_show;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getL_cn_abbr() {
        return l_cn_abbr;
    }

    public void setL_cn_abbr(String l_cn_abbr) {
        this.l_cn_abbr = l_cn_abbr;
    }

    public String getH_cn_abbr() {
        return h_cn_abbr;
    }

    public void setH_cn_abbr(String h_cn_abbr) {
        this.h_cn_abbr = h_cn_abbr;
    }

    public String getA_cn_abbr() {
        return a_cn_abbr;
    }

    public void setA_cn_abbr(String a_cn_abbr) {
        this.a_cn_abbr = a_cn_abbr;
    }

    public String getH_order() {
        return h_order;
    }

    public void setH_order(String h_order) {
        this.h_order = h_order;
    }

    public String getA_order() {
        return a_order;
    }

    public void setA_order(String a_order) {
        this.a_order = a_order;
    }

    public String getH_id_dc() {
        return h_id_dc;
    }

    public void setH_id_dc(String h_id_dc) {
        this.h_id_dc = h_id_dc;
    }

    public String getA_id_dc() {
        return a_id_dc;
    }

    public void setA_id_dc(String a_id_dc) {
        this.a_id_dc = a_id_dc;
    }

    public String getL_background_color() {
        return l_background_color;
    }

    public void setL_background_color(String l_background_color) {
        this.l_background_color = l_background_color;
    }

    public String getWeather_pic() {
        return weather_pic;
    }

    public void setWeather_pic(String weather_pic) {
        this.weather_pic = weather_pic;
    }

    public List<Object> getMatch_info() {
        return match_info;
    }

    public void setMatch_info(List<Object> match_info) {
        this.match_info = match_info;
    }



}
