package com.huguigu.service;

import com.huguigu.vo.Warehouse_goods;

import java.util.List;

public interface Warehouse_goodsService {
    List<Warehouse_goods> queryWarehouse_goodsGname(String gname);
    int updateWarehouse_goodsCount(Warehouse_goods warehouse_goods);
}
