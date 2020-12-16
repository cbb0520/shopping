package com.huguigu.service.impl;

import com.huguigu.dao.CityDao;
import com.huguigu.service.CityService;
import com.huguigu.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityDao cityDao;
    @Override
    public List<City> queryCityByid(String provincecode) {
        return cityDao.queryCityByid(provincecode);
    }

    @Override
    public City querycodeCity(String code) {
        return cityDao.querycodeCity(code);
    }

    @Override
    public City queryCityName(String name) {
        return cityDao.queryCityName(name);
    }
}
