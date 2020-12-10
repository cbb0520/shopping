package com.huguigu.dao;
import com.huguigu.vo.Merchants;

import java.util.List;
public interface MerchantsDao {
    int addMerchants(Merchants merchants);
    int updatestate(Merchants merchants);
    List<Merchants> queryAllMerchants(Merchants merchants);
}
