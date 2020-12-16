package com.huguigu.dao;

import com.huguigu.vo.Province;

import java.util.List;

public interface ProvinceDao {
    List<Province> queryProvince();
    Province queryProvincebyid(String code);
    Province queryProvinceName(String name);
}
