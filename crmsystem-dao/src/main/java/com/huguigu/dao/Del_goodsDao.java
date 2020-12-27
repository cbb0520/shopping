package com.huguigu.dao;

import com.huguigu.vo.Del_goods;

import java.util.List;

public interface Del_goodsDao {
    List<Del_goods> queryAllDel_goods(int did);
    List<Del_goods> querydindanBYdid(int did);
}
