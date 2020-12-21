package com.huguigu.dao;

import com.huguigu.vo.Ber;
import com.huguigu.vo.Market;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketDao {
    //所有商品加查询
    public List<Market>  quryMarket(@Param("gname")String gname, @Param("fname")String fname);
    //查询数据跳数
    public int  quryMarketCount(@Param("gname")String gname, @Param("fname")String fname);
    //查询给类型的销售情况
    public List<Ber>  quryMarketFen();
}
