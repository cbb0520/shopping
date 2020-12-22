package com.huguigu.service;

import com.huguigu.vo.Goods;
import com.huguigu.vo.PageVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GoodsService {
    PageVo<Goods> queryAllGoods(Goods goods, int page, int rows);

    //删除商品
    int delGoods(int gid);

    //根据id查询商品
    Goods queryGoodsById(int gid);

    //修改商品
    int uptGoods(Goods goods,String oldgname);

    //加入购物车
    int joinShooping(String uaccount, int gid, int count);

    //查询该用户的购物车
    List<Goods> queryGoodsByUid(String uaccount);
}
