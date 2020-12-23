package com.huguigu.dao;
import com.huguigu.vo.Merchants;
import java.util.List;
public interface MerchantsDao {
    int addMerchants(Merchants merchants);
    int updatestate(Merchants merchants);
    List<Merchants> queryAllMerchants(Merchants merchants);
    int queryCountMerchants(Merchants merchants);
    int deleteMerchants(int mid);
    Merchants queryMerchantsBYId(int mid);
    int updateMerchants(Merchants merchants);
    Merchants queryMerchantsuid(int uid);
    List<Merchants> shengpiMerchants(Merchants merchants);
    int queryCountshengpiMerchants(Merchants merchants);
    Merchants yanzheng(int uid);
}
