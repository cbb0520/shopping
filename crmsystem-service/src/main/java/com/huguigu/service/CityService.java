package com.huguigu.service;

import com.huguigu.vo.City;

import java.util.List;

public interface CityService {
    List<City> queryCityByid(String provincecode);
    City querycodeCity(String code);
    City queryCityName(String name);
}
