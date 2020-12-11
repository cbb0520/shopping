package com.huguigu.service.impl;
import com.github.pagehelper.PageHelper;
import com.huguigu.dao.AreaDao;
import com.huguigu.dao.CityDao;
import com.huguigu.dao.MerchantsDao;
import com.huguigu.dao.ProvinceDao;
import com.huguigu.service.MerchantsService;
import com.huguigu.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantsImpl implements MerchantsService {
    @Autowired
    MerchantsDao merchantsDao;
    @Autowired
    ProvinceDao provinceDao;
    @Autowired
    CityDao cityDao;
    @Autowired
    AreaDao areaDao;
    @Override
    public int addMerchants(Merchants merchants,String provincecode,String citycode,String areacode) {
           Province province =provinceDao.queryProvincebyid(provincecode);
           String pname=province.getName();
           City city= cityDao.querycodeCity(citycode);
           String cname=city.getName();
           Area area=areaDao.querycodeArea(areacode);
           String aname=area.getName();
           String mddress=merchants.getMddress();
           String dizhi=pname+cname+aname+mddress;
            merchants.setUid(1);
            merchants.setState("未同意");
            merchants.setMddress(dizhi);
        return merchantsDao.addMerchants(merchants);
    }

    @Override
    public int updatestate(Merchants merchants) {
        return merchantsDao.updatestate(merchants);
    }

    @Override
    public PageVo<Merchants> queryCountMerchants(Merchants merchants, int page, int rows) {
        PageVo<Merchants> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(merchantsDao.queryAllMerchants(merchants));
        pageVo.setTotal(merchantsDao.queryCountMerchants(merchants));
        return pageVo;
    }

    @Override
    public int deleteMerchants(int mid) {
        return merchantsDao.deleteMerchants(mid);
    }

    @Override
    public Merchants queryMerchantsBYId(int mid) {
        return merchantsDao.queryMerchantsBYId(mid);
    }

    @Override
    public int updateMerchants(Merchants merchants) {
        return merchantsDao.updateMerchants(merchants);
    }

    @Override
    public Merchants queryMerchantsuid(int uid) {
        return merchantsDao.queryMerchantsuid(uid);
    }
}