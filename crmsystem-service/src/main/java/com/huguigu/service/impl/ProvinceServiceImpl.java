package com.huguigu.service.impl;
import com.huguigu.dao.ProvinceDao;
import com.huguigu.service.ProvinceService;
import com.huguigu.vo.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    ProvinceDao provinceDao;
    @Override
    public List<Province> queryProvince() {
        return provinceDao.queryProvince();
    }

    @Override
    public Province queryProvincebyid(String code) {
        return provinceDao.queryProvincebyid(code);
    }

    @Override
    public Province queryProvinceName(String name) {
        return provinceDao.queryProvinceName(name);
    }
}
