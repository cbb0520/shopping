package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.WarehouseDao;
import com.huguigu.service.WarehouseService;
import com.huguigu.vo.Goods;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    WarehouseDao warehouseDao;


    @Override
    public PageVo<Warehouse> queryAllWarehouse(Warehouse warehouse, int page, int rows) {
        PageVo<Warehouse> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(warehouseDao.queryAllWarehouse(warehouse));
        pageVo.setTotal(warehouseDao.queryCountWarehouse(warehouse));
        return pageVo;
    }

    @Override
    public int delWarehouseByWid(int wid) {
        Warehouse warehouse = new Warehouse();
        warehouse.setWid(wid);
        try {
            if(warehouseDao.getWarehouseAllCount(warehouse) > 0){
                return 2;
            }
        }catch (Exception e){
        }
        return warehouseDao.delWarehouseByWid(wid);
    }

    @Override
    public int addWarehouse(Warehouse warehouse,String oldwname) {
        //判断名字是否重复
        if(warehouseDao.isWnameRepetition(oldwname,warehouse.getWname()) > 0){
            return 2;
        }
        return warehouseDao.addWarehouse(warehouse);
    }

    @Override
    public Warehouse queryWarehouseById(int id) {
        return warehouseDao.queryWarehouseById(id);
    }

    @Override
    public int uptWarehouse(Warehouse warehouse, String oldwname, int oldfid) {
        //判断是否能够修改类型
        try {
            if(warehouse.getClassify().getFid() != oldfid){
                if(warehouseDao.getWarehouseAllCount(warehouse) > 0){
                    return 4;
                }
            }
        }catch (Exception e){
        }

        //判断名字是否重复
        if(warehouseDao.isWnameRepetition(oldwname,warehouse.getWname()) > 0){
            return 3;
        }

        //判断是否能修改库存
        Integer i = warehouseDao.isWarehouseLian(warehouse);
        try {
            if (i < 0) {
                return 2;
            }
        }catch (Exception e){

        }

        //执行修改
        return warehouseDao.uptWarehouse(warehouse);
    }
}
