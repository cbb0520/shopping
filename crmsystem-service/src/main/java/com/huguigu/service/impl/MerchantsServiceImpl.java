package com.huguigu.service.impl;
import com.github.pagehelper.PageHelper;
import com.huguigu.dao.*;
import com.huguigu.service.MerchantsService;
import com.huguigu.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MerchantsServiceImpl implements MerchantsService {
    @Autowired
    MerchantsDao merchantsDao;
    @Autowired
    ProvinceDao provinceDao;
    @Autowired
    CityDao cityDao;
    @Autowired
    AreaDao areaDao;
    @Autowired
    UserDao userDao;
    @Override
    public int addMerchants(Merchants merchants,String provincecode,String citycode,String areacode) {
          Province province =provinceDao.queryProvincebyid(provincecode);
           String pname=province.getName();
           City city= cityDao.querycodeCity(citycode);
           String cname=city.getName();
           Area area=areaDao.querycodeArea(areacode);
           String aname=area.getName();
           String mddress=merchants.getMddress();
           String dizhi=pname+"/"+cname+"/"+aname+"/"+mddress;
            merchants.setState("未同意");
            merchants.setMddress(dizhi);
        return merchantsDao.addMerchants(merchants);
    }

    @Override
    public int addMerchants2(Merchants merchants) {
        merchants.setState("未同意");
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
    public int updateMerchants(Merchants merchants,String provincecode,String citycode, String areacode) {
        Province province =provinceDao.queryProvincebyid(provincecode);
        String pname=province.getName();
        City city= cityDao.querycodeCity(citycode);
        String cname=city.getName();
        Area area=areaDao.querycodeArea(areacode);
        String aname=area.getName();
        String mddress=merchants.getMddress();
        String zongdizhi=pname+"/"+cname+"/"+aname+"/"+mddress;
        merchants.setState("已同意");
        merchants.setMddress(zongdizhi);
        return merchantsDao.updateMerchants(merchants);
    }

    @Override
    public Merchants queryMerchantsuid(int uid) {
        return merchantsDao.queryMerchantsuid(uid);
    }

    @Override
    public PageVo<Merchants> queryCountshengpiMerchants(Merchants merchants, int page, int rows) {
        PageVo<Merchants> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(merchantsDao.shengpiMerchants(merchants));
        pageVo.setTotal(merchantsDao.queryCountshengpiMerchants(merchants));
        return pageVo;
    }

    @Override
    public Merchants yanzheng(String uid) {
        User user = userDao.queryUserByUaccount(uid);
        System.out.println(user.getUid());
        return merchantsDao.yanzheng(user.getUid());
    }
}
