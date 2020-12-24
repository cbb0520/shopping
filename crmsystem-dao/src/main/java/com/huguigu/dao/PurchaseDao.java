package com.huguigu.dao;

import com.huguigu.vo.Purchase;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseDao {
    //条件查询所有采购表
    public List<Purchase> queryPurchase(@Param("pname")String pname, @Param("fid")int fid);
    //数据条数
    public int queryPurchasecontu(@Param("pname")String pname, @Param("fid")int fid);
}
