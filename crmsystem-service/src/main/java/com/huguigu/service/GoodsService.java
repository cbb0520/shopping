package com.huguigu.service;

import com.huguigu.vo.Goods;
import com.huguigu.vo.PageVo;
import org.springframework.stereotype.Service;

public interface GoodsService {
    PageVo<Goods> queryAllGoods(Goods goods, int page, int rows);

    //删除商品
    int delGoods(int gid);

    //根据id查询商品
    Goods queryGoodsById(int gid);

    //修改商品
    int uptGoods(Goods goods);
}
