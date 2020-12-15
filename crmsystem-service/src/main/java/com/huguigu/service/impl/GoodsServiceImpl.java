package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.GoodsDao;
import com.huguigu.service.GoodsService;
import com.huguigu.vo.Goods;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsDao goodsDao;

    @Override
    public PageVo<Goods> queryAllGoods(Goods goods, int page, int rows) {
        PageVo<Goods> pageVo = new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(goodsDao.queryAllGoods(goods));
        pageVo.setTotal(goodsDao.queryCountGoods(goods));
        return pageVo;
    }

    @Override
    public int delGoods(int gid) {
        //判断该商品是否还有库存
        return goodsDao.delGoods(gid);
    }

    @Override
    public Goods queryGoodsById(int gid) {
        return goodsDao.queryGoodsById(gid);
    }

    @Override
    public int uptGoods(Goods goods,String oldgname) {
        //判断修改后的商品名是否与其他商品名相同
        if(goodsDao.isEqual(oldgname,goods.getGname()) > 0){
            return 2;
        }
        return goodsDao.uptGoods(goods);
    }
}
