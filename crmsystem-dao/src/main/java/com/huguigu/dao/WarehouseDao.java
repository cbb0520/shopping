package com.huguigu.dao;

import com.huguigu.vo.Warehouse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehouseDao {
    //查询所有仓库信息
    List<Warehouse> queryAllWarehouse(Warehouse warehouse);

    //查询所有仓库数量
    int queryCountWarehouse(Warehouse warehouse);

    //根据id删除仓库
    int delWarehouseByWid(int wid);

    //添加仓库
    int addWarehouse(Warehouse warehouse);

    //根据id查询仓库
    Warehouse queryWarehouseById(int id);

    //修改仓库
    int uptWarehouse(Warehouse warehouse);

    //获取仓库存储是否超标
    Integer isWarehouseLian(Warehouse warehouse);

    //查询该仓库的商品数量
    Integer getWarehouseAllCount(Warehouse warehouse);

    //判断仓库名是否重复
    int isWnameRepetition(@Param("oldwname") String oldwname, @Param("newwname") String newwname);
}
