package com.huguigu.dao;

import com.huguigu.vo.Classify;

import java.util.List;

public interface ClassifyDao {
    //根据id查询商品类型
    Classify queryClassById(int id);

    //查询所有类别
    List<Classify> queryAllClassify(Classify classify);

    //查询类别数量
    int queryCountClassify(Classify classify);

    //删除类别
    int delClassifyById(int id);

    //根据id查询类型
    Classify queryClassifyById(int id);

    //修改类型
    int uptClassify(Classify classify);

    //添加类型
    int addCLassify(Classify classify);
}
