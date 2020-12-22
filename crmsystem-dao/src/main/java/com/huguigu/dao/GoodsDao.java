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

    //根据仓库id查询商品集合
    List<Goods> queryGoodsByWid(int wid);

    //根据id查询商品剩余数量
    Integer queryCountByWarehouse(int id);

    //加入购物车
    int joinShooping(@Param("uid") int uid, @Param("gid") int gid, @Param("count") int count);

    //判断购物车是否已有此商品
    int isShoppingCarExist(@Param("uid") int uid, @Param("gid") int gid);

    //添加购物车里面的商品数量
    int addShoppingCarCount(@Param("uid") int uid, @Param("gid") int gid, @Param("count") int count);

    //查询该用户的购物车
    List<Goods> queryGoodsByUid(int uid);
}
