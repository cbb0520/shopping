package com.huguigu.service;

import com.huguigu.vo.Revnue;

import java.util.List;

public interface RevnueService {

    //每个月收入条件收入
    public List<Revnue> queryshouru(int month,String year);
    //条件前三
    public List<Revnue> queryqinwu(int mothen, String year);
}
