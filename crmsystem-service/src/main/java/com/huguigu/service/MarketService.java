package com.huguigu.service;

import com.huguigu.vo.Ber;
import com.huguigu.vo.Market;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketService {

    public PageVo<Market> queryMarketbyCond(String gname,String fname,int page, int rows) ;
    //查询给类型的销售情况
    public List<Ber>  quryMarketFen();
}
