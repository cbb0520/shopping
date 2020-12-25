package com.huguigu.service;

import com.huguigu.vo.PageVo;
import com.huguigu.vo.Purchase;


public interface PurchaseService {
    PageVo<Purchase> purchaseService(String pname,int fid, int page, int rows);
    //采购添加商品和商品仓库
    int  addGoods_war(Purchase purchase);

    //转移商品
    int  zhuanGoods(int gid,int lodwid,int noewid,int count);
}
