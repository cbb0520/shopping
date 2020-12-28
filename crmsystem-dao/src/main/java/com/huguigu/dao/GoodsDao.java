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

    //修改购物车的数量
    int uptShoppingCarCount(@Param("gid") int gid, @Param("count") int count, @Param("uid") int uid);

    //删除购物车某项商品
    int delShoppingCar(@Param("gid") int gid,@Param("uid") int uid);

    //修改购物车是否选中
    int changeSelect(@Param("gid") int gid,@Param("uid") int uid,@Param("select") boolean select);

    int changeAllSelect(@Param("uid") int uid,@Param("select")boolean select);

    //查询销量前五的商品
    List<Goods> queryHotGoods();
    //添加商品
    int addGoods(Goods goods);
    //判断此商品是否存在
    Goods queryGoodsgnmae(@Param("gname") String gname);

    //查根据用户id查询购物车选择的商品生成订单表
    List<Goods> queryGoodsCarByUid(int uid);

    //根据订单id查询商品集合
    List<Goods> queryGoodsByDid(int did);

    //查根据用户id查询购物车选择的商品生成订单表总价
    int queryGoodsCarByUidBySum(int uid);

    //删除购物车选中的商品
    int removeGoodsCarBySelect(int uid);

    //添加商品的销量
    int addGoodsSoid(@Param("gid") int gid,@Param("count") int count);
    //根据id查询商品2
    Goods queryGoodsById2(int gid);
}
