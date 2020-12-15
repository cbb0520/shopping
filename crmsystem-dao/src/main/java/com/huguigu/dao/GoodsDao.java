package com.huguigu.dao;

import com.huguigu.vo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {
    //查询所有商品
    List<Goods> queryAllGoods(Goods goods);

    //查询商品数量
    int queryCountGoods(Goods goods);

    //删除商品
    int delGoods(int gid);

    //根据id查询商品
    Goods queryGoodsById(int gid);

    //修改商品
    int uptGoods(Goods goods);

    //判断是否有相同的商品名
    int isEqual(@Param("oldgname") String oldgname, @Param("newgname") String newgname);
}
