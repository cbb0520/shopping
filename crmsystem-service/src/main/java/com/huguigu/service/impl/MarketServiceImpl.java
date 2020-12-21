package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.MarketDao;
import com.huguigu.service.MarketService;
import com.huguigu.vo.Ber;
import com.huguigu.vo.Market;
import com.huguigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService {
    @Autowired
    MarketDao marketDao;
    @Override
    public PageVo<Market> queryMarketbyCond(String gname, String fname, int page, int rows) {
        PageVo<Market> pageVo = new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(marketDao.quryMarket(gname,fname));
        pageVo.setTotal(marketDao.quryMarketCount(gname,fname));
        return pageVo;
    }

    @Override
    public List<Ber> quryMarketFen() {
        return marketDao.quryMarketFen();
    }


}
