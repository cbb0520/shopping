package com.huguigu.service;
import com.huguigu.vo.Merchants;
import com.huguigu.vo.PageVo;

public interface MerchantsService {
    int addMerchants(Merchants merchants,String provincecode,String citycode,String areacode);
    int addMerchants2(Merchants merchants);
    int updatestate(Merchants merchants);
    PageVo<Merchants> queryCountMerchants(Merchants merchants, int page, int rows);
    int deleteMerchants(int mid);
    Merchants queryMerchantsBYId(int mid);
    int updateMerchants(Merchants merchants,String provincecode,String citycode, String areacode);
    Merchants queryMerchantsuid(int uid);
    PageVo<Merchants> queryCountshengpiMerchants(Merchants merchants, int page, int rows);
    Merchants yanzheng(String uid);
}
