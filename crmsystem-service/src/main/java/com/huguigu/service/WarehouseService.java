package com.huguigu.service;

import com.huguigu.vo.PageVo;
import com.huguigu.vo.Warehouse;

public interface WarehouseService {
    //查询所有仓库信息
    PageVo<Warehouse> queryAllWarehouse(Warehouse warehouse, int page, int rows);

    //根据id删除仓库
    int delWarehouseByWid(int wid);

    //添加仓库
    int addWarehouse(Warehouse warehouse,String oldwname);

    //根据id查询仓库
    Warehouse queryWarehouseById(int id);

    //修改仓库
    int uptWarehouse(Warehouse warehouse, String oldwname, int oldfid);
}
