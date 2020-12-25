package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.DeliverDao;
import com.huguigu.dao.GoodsDao;
import com.huguigu.dao.UserDao;
import com.huguigu.service.DeliverService;
import com.huguigu.vo.Deliver;
import com.huguigu.vo.Goods;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeliverServiceImpl implements DeliverService {
    @Autowired
    DeliverDao deliverDao;

    @Override
    public PageVo<Deliver> queryCountDeliver(Deliver deliver, int page, int rows) {
        PageVo<Deliver> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(deliverDao.queryAllDeliver(deliver));
        pageVo.setTotal(deliverDao.queryCountDeliver(deliver));
        return pageVo;
    }

    @Override
    public int updateDeliverState(int did) {
        return deliverDao.updateDeliverState(did);
    }

    @Override
    public PageVo<Deliver> queryDeliverstate(Deliver deliver, int page, int rows) {
        PageVo<Deliver> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(deliverDao.queryDeliverstate(deliver));
        pageVo.setTotal(deliverDao.queryDeliver(deliver));
        return pageVo;
    }

    @Override
    public PageVo<Deliver> queryCountDeliverdsh(Deliver deliver, int page, int rows) {
        PageVo<Deliver> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(deliverDao.queryAllDeliverdsh(deliver));
        pageVo.setTotal(deliverDao.queryCountDeliverdsh(deliver));
        return pageVo;
    }

    @Override
    public PageVo<Deliver> queryCountDeliverdfh(Deliver deliver, int page, int rows) {
        PageVo<Deliver> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(deliverDao.queryAllDeliverdfh(deliver));
        pageVo.setTotal(deliverDao.queryCountDeliverdfh(deliver));
        return pageVo;
    }

    @Override
    public int updateDeliverStatesh(int did) {
        return deliverDao.updateDeliverStatesh(did);
    }

    @Override
    public PageVo<Deliver> queryCountDeliverdth(Deliver deliver, int page, int rows) {
        PageVo<Deliver> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(deliverDao.queryAllDeliverdth(deliver));
        pageVo.setTotal(deliverDao.queryCountDeliverdth(deliver));
        return pageVo;
    }

    @Override
    public PageVo<Deliver> queryCountDeliveryth(Deliver deliver, int page, int rows) {
        PageVo<Deliver> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(deliverDao.queryAllDeliveryth(deliver));
        pageVo.setTotal(deliverDao.queryCountDeliveryth(deliver));
        return pageVo;
    }

    @Override
    public PageVo<Deliver> queryCountDelivers(Deliver deliver, int page, int rows) {
        PageVo<Deliver> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(deliverDao.queryAllDelivers(deliver));
        pageVo.setTotal(deliverDao.queryCountDelivers(deliver));
        return pageVo;
    }

    @Override
    public List<Deliver> querymonthlyincome(int month, String year, int mid) {
        List<Deliver> incoMes = new ArrayList<>();
        for (int i = 1; i < month + 1; i++) {
            Deliver deliver = new Deliver();
            float querymothen = deliverDao.querymonthlyincome(String.valueOf(i), year, mid);
            deliver.setMothen(i + "月");
            deliver.setTotal(querymothen);
            incoMes.add(deliver);
        }
        return incoMes;
    }

    @Autowired
    UserDao userDao;

    @Autowired
    GoodsDao goodsDao;

    @Override
    public int insertDeliver(String uaccount, float price, String text) {
        //组装数据，生成订单表
        Deliver deliver = new Deliver();
        User user = userDao.queryUserByUaccount(uaccount);
        deliver.setUid(user.getUid());
        deliver.setMid(user.getMerchants().getMid());
        deliver.setPrice(price);
        deliver.setMerchantrevenue(price * 0.1);
        deliver.setText(text);
        deliverDao.insertDeliver(deliver);

        //拿到订单id，生成订单商品详情
        int did = deliver.getDid();

        int flag = 1;
        //获取用户订单的商品集合
        List<Goods> goods = goodsDao.queryGoodsCarByUid(user.getUid());

        for (int i = 0; i < goods.size(); i++) {
            //删除购物车里的数据--添加到订单详情表
            flag *= deliverDao.addDelGoods(did,goods.get(i).getGid(),goods.get(i).getCount());
            //添加商品的销量
            goodsDao.addGoodsSoid(goods.get(i).getGid(),goods.get(i).getCount());
            //减少该商品库存
            //
        }
        flag *= goodsDao.removeGoodsCarBySelect(user.getUid());
        return flag;
    }

}
