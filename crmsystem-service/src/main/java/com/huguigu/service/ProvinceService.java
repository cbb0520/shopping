package com.huguigu.service;

import com.huguigu.vo.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> queryProvince();
    Province queryProvincebyid(String code);
}
