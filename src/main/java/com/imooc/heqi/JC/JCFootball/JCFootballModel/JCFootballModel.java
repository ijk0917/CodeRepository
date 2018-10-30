package com.imooc.heqi.JC.JCFootball.JCFootballModel;

import java.util.Map;

public class JCFootballModel {
    private Map<String , JCFootballInfoModel> data;

    private Object status;

    public Map<String, JCFootballInfoModel> getData() {
        return data;
    }

    public void setData(Map<String, JCFootballInfoModel> data) {
        this.data = data;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }
}
