package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.GoodsDao;
import com.huguigu.dao.UserDao;
import com.huguigu.service.GoodsService;
import com.huguigu.vo.Goods;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.Staff;
import com.huguigu.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsDao goodsDao;

    @Override
    public PageVo<Goods> queryAllGoods(Goods goods, int page, int rows) {
        PageVo<Goods> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(goodsDao.queryAllGoods(goods));
        pageVo.setTotal(goodsDao.queryCountGoods(goods));
        return pageVo;
    }

    @Override
    public int delGoods(int gid) {
        //判断该商品是否还有库存
        Integer i = goodsDao.queryCountByWarehouse(gid);
        System.out.println(i);
        if (i == null) {
            return goodsDao.delGoods(gid);
        }
        if (i == 0) {
            return goodsDao.delGoods(gid);
        }
        return 2;
    }

    @Override
    public Goods queryGoodsById(int gid) {
        return goodsDao.queryGoodsById(gid);
    }

    @Override
    public int uptGoods(Goods goods, String oldgname) {
        //判断修改后的商品名是否与其他商品名相同
        if (goodsDao.isEqual(oldgname, goods.getGname()) > 0) {
            return 2;
        }
        return goodsDao.uptGoods(goods);
    }

    @Autowired
    UserDao userDao;

    @Override
    public int joinShooping(String uaccount, int gid, int count) {
        User user = userDao.queryUserByUaccount(uaccount);
        int uid = user.getUid();
        try {
            //判断购物车里是否已存在此商品
            if (goodsDao.isShoppingCarExist(uid, gid) == 1) {
                //添加数量
                return goodsDao.addShoppingCarCount(uid, gid, count);
            }
        } catch (Exception e) {

        }
        return goodsDao.joinShooping(uid, gid, count);
    }

    @Override
    public List<Goods> queryGoodsByUid(String uaccount) {
        User user = userDao.queryUserByUaccount(uaccount);
        int uid = user.getUid();
        return goodsDao.queryGoodsByUid(uid);
    }

    @Override
    public int uptShoppingCarCount(int gid, int count, String uaccount) {
        User user = userDao.queryUserByUaccount(uaccount);
        int uid = user.getUid();
        return goodsDao.uptShoppingCarCount(gid, count, uid);
    }

    @Override
    public int delShoppingCar(int gid, String uaccount) {
        User user = userDao.queryUserByUaccount(uaccount);
        int uid = user.getUid();
        return goodsDao.delShoppingCar(gid, uid);
    }

    @Override
    public int changeSelect(int gid, String uaccount, boolean select) {
        User user = userDao.queryUserByUaccount(uaccount);
        int uid = user.getUid();
        return goodsDao.changeSelect(gid, uid, select);
    }

    @Override
    public int changeAllSelect(String uaccount, boolean select) {
        User user = userDao.queryUserByUaccount(uaccount);
        int uid = user.getUid();
        return goodsDao.changeAllSelect(uid, select);
    }

    @Override
    public List<Goods> queryHotGoods() {
        return goodsDao.queryHotGoods();
    }

    @Override
    public List<Goods> queryGoodsCarByUid(String uaccount) {
        return goodsDao.queryGoodsCarByUid(userDao.queryUserByUaccount(uaccount).getUid());
    }

    @Override
    public int queryGoodsCarByUidBySum(String uaccount) {
        return goodsDao.queryGoodsCarByUidBySum(userDao.queryUserByUaccount(uaccount).getUid());
    }
}
