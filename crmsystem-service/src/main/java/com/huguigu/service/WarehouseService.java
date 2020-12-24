package com.huguigu.service;

import com.huguigu.vo.PageVo;
import com.huguigu.vo.Warehouse;

import java.util.List;

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

    //查询所有的仓库不含分页的
    List<Warehouse> queryWarehouse(Warehouse warehouse);
    //查询该仓库的商品数量
    Integer getWarehouseAllCount(Warehouse warehouse);
}
