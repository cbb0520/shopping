package com.huguigu.service.impl;

import com.huguigu.dao.Warehouse_goodsDao;
import com.huguigu.service.Warehouse_goodsService;
import com.huguigu.vo.Warehouse_goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Warehouse_goodsServiceImpl implements Warehouse_goodsService {
    @Autowired
    Warehouse_goodsDao warehouse_goodsDao;
    @Override
    public List<Warehouse_goods> queryWarehouse_goodsGname(String gname) {

        return warehouse_goodsDao.queryWarehouse_goodsGname(gname);
    }

    @Override
    public int updateWarehouse_goodsCount(Warehouse_goods warehouse_goods) {
        return warehouse_goodsDao.updateWarehouse_goodsCount(warehouse_goods);
    }
}
