package com.huguigu.controller;

import com.huguigu.dao.WarehouseDao;
import com.huguigu.service.WarehouseService;
import com.huguigu.vo.Classify;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.Warehouse;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @RequestMapping("queryCountWarehouse.action")
    public PageVo<Warehouse> queryCountWarehouse(Warehouse warehouse,
                                                 @RequestParam(value = "page", defaultValue = "1") int page,
                                                 @RequestParam(value = "rows", defaultValue = "5") int rows) {
        return warehouseService.queryAllWarehouse(warehouse, page, rows);
    }

    @RequestMapping("delwarehouseById.action")
    public Map delwarehouseById(int wid) {
        Map<String, String> map = new HashMap<String, String>();
        int i = warehouseService.delWarehouseByWid(wid);
        if (i < 1) {
            map.put("msg", "删除失败");
            map.put("type", "error");
        }
        if (i == 1) {
            map.put("msg", "删除成功");
            map.put("type", "success");
        }
        if (i == 2) {
            map.put("msg", "删除失败,该仓库库存不为0，不能删除");
            map.put("type", "info");
        }
        return map;
    }

    @RequestMapping("addWarehouse.action")
    public Map addWarehouse(Warehouse warehouse, int fid) {
        Map<String, String> map = new HashMap<String, String>();
        Classify classify = new Classify();
        classify.setFid(fid);
        warehouse.setClassify(classify);
        int i = warehouseService.addWarehouse(warehouse,null);
        if (i < 1) {
            map.put("msg", "添加失败");
            map.put("type", "error");
        }
        if (i == 1) {
            map.put("msg", "添加成功");
            map.put("type", "success");
        }
        if (i == 2) {
            map.put("msg", "添加失败,仓库名已经使用");
            map.put("type", "info");
        }
        return map;
    }

    @RequestMapping("queryWarehouseById.action")
    public Warehouse queryWarehouseById(int wid) {
        return warehouseService.queryWarehouseById(wid);
    }

    @RequestMapping("uptWarehouse.action")
    public Map uptWarehouse(Warehouse warehouse, int fid, String oldwname, int oldfid) {
        Map<String, String> map = new HashMap<String, String>();
        Classify classify = new Classify();
        classify.setFid(fid);
        warehouse.setClassify(classify);
        int i = warehouseService.uptWarehouse(warehouse,oldwname,oldfid);
        if (i < 1) {
            map.put("msg", "修改失败");
            map.put("type", "error");
        }
        if (i == 1) {
            map.put("msg", "修改成功");
            map.put("type", "success");
        }
        if (i == 2) {
            map.put("msg", "修改失败,仓库容量不能小于商品数量");
            map.put("type", "info");
        }
        if (i == 3) {
            map.put("msg", "修改失败,仓库名与其他仓库重复");
            map.put("type", "info");
        }
        if (i == 4) {
            map.put("msg", "修改失败,此仓库还有库存，不能修改类型");
            map.put("type", "info");
        }
        return map;
    }
}
