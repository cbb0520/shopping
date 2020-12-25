package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.GoodsDao;
import com.huguigu.dao.PurchaseDao;
import com.huguigu.dao.WarehouseDao;
import com.huguigu.service.PurchaseService;
import com.huguigu.vo.Classify;
import com.huguigu.vo.Goods;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.Calendar;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    PurchaseDao purchaseDao;
    @Autowired
    WarehouseDao warehouseDao;
    @Autowired
    GoodsDao goodsDao;
    @Override
    public PageVo<Purchase> purchaseService(String pname, int fid, int page, int rows) {
        PageVo<Purchase> pageVo = new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(purchaseDao.queryPurchase(pname,fid));
        pageVo.setTotal(purchaseDao.queryPurchasecontu(pname,fid));
        return pageVo;
    }

    @Override
    public int addGoods_war(Purchase purchase) {
        Calendar cal = Calendar.getInstance();
        String year = String.valueOf(cal.get(Calendar.YEAR));
        Goods goods = goodsDao.queryGoodsgnmae(purchase.getPname());
        Goods good = new Goods();
        Classify ca = new Classify();
        ca.setFid(purchase.getFid());
        good.setClassify(ca);
        good.setCode(year+purchase.getPid());
        good.setGname(purchase.getPname());
        good.setGimgs(purchase.getPimgs());
        good.setGprice((float) (purchase.getPrice()+(purchase.getPrice()*0.2)));
        if(goods==null){
            goodsDao.addGoods(good);
            warehouseDao.addWar_goods(Integer.parseInt(purchase.getUdele()),good.getGid(),purchase.getLiang());
        }else {
            warehouseDao.addWar_goods(Integer.parseInt(purchase.getUdele()),goods.getGid(),purchase.getLiang());
        }
        return 1;
    }
}
