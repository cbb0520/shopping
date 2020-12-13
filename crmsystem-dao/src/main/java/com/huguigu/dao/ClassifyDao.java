package com.huguigu.dao;

import com.huguigu.vo.Classify;

public interface ClassifyDao {
    //根据id查询商品类型
    Classify queryClassById(int id);
}
