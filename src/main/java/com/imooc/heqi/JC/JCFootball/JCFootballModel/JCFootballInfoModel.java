package com.imooc.heqi.JC.JCFootball.JCFootballModel;

import java.util.Map;

public class JCFootballInfoModel<T> {
    private Map<String ,T> data;

    private Object status;

    public Map<String, T> getData() {
        return data;
    }

    public void setData(Map<String, T> data) {
        this.data = data;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }
}
