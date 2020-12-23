package com.huguigu.service;

import com.huguigu.vo.Classify;
import com.huguigu.vo.PageVo;

import java.util.List;

public interface ClassifyService {
    //查询所有类别
    PageVo<Classify> queryAllClassify(Classify classify, int page, int rows);

    //删除类别
    int delClassifyById(int id);

    //根据id查询类型
    Classify queryClassifyById(int id);

    //修改类型
    int uptClassify(Classify classify,String oldfname);

    //添加类型
    int addCLassify(Classify classify);

    //查询所有的分类不包含分页
    List<Classify> queryClassify();
}
