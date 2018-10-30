package com.imooc.heqi.JC.JCFootball.JCFootballModel;

import java.util.Map;

public class JCFootballModel<T extends AbstractJCFootballInfoModel> {
    private Map<String ,JCFootballInfoModel<T>> data;

    private Object status;

    public Map<String, JCFootballInfoModel<T>> getData() {
        return data;
    }

    public void setData(Map<String, JCFootballInfoModel<T>> data) {
        this.data = data;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }
}
