package com.huguigu.dao;

import com.huguigu.vo.City;

import java.util.List;

public interface CityDao {
 List<City> queryCityByid(String provincecode);
}
