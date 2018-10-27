package com.imooc.heqi.controller;

import com.imooc.heqi.dao.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestImpl implements Test {
    @Override
    public void ttt() {

    }
    public static void main(String[] args){
//        List<String> totalList = new ArrayList<>();
//        List<String> list = new ArrayList<>();
//        totalList.addAll(list);
        List<String> totalList = null;
        if( null != totalList &&  !totalList.isEmpty() ){
            System.out.println("12346");
        }else System.out.println("456");

    }
}
