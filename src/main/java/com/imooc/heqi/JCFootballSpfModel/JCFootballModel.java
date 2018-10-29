package com.imooc.heqi.JCFootballSpfModel;

import java.util.Map;

public class JCFootballModel {
    private Map<String ,Map<String,Object>> data;

    private Object status;

    public Map<String, Map<String, Object>> getData() {
        return data;
    }

    public void setData(Map<String, Map<String, Object>> data) {
        this.data = data;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }
}
