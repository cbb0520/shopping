package com.huguigu.controller;

import com.huguigu.service.PurchaseService;
import com.huguigu.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PurchaseController {
    @Autowired
    PurchaseService purchaseService;

    //查询所有商品
    @RequestMapping("queryPurchase.action")
    public PageVo<Purchase> queryPurchase(String qname,
                                          @RequestParam(value = "fid", defaultValue = "0") int fid,
                                          @RequestParam(value = "page", defaultValue = "1") int page,
                                          @RequestParam(value = "rows", defaultValue = "5") int rows) {

        return purchaseService.purchaseService(qname,fid, page, rows);
    }

    @RequestMapping("addpurchase.action")
    public String queryWarehouseById(Purchase purchase) {
        purchaseService.addGoods_war(purchase);
        return "采购成功";
    }
    @RequestMapping("zhuanGoods.action")
    public String zhuanGoods(int gid,int lodwid,int noewid,int count) {
        int i = purchaseService.zhuanGoods(gid, lodwid, noewid, count);
        if(i<0){
            return "转移失败";
        }

        return "转移成功";
    }

}
