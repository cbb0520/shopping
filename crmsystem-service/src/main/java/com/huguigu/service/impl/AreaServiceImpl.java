package com.huguigu.service.impl;

import com.huguigu.dao.AreaDao;
import com.huguigu.service.AreaService;
import com.huguigu.vo.Area;
import com.huguigu.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    AreaDao areaDao;
    @Override
    public List<Area> queryAreaByid(String citycode) {
        return areaDao.queryAreaByid(citycode);
    }

    @Override
    public Area querycodeArea(String code) {
        return areaDao.querycodeArea(code);
    }

    @Override
    public Area queryAreaName(String name) {
        return areaDao.queryAreaName(name);
    }

    @Override
    public Area queryAreabynamecitycode(Area area) {
        return areaDao.queryAreabynamecitycode(area);
    }

    @Override
    public City queryCityName2(String name) {
        return areaDao.queryCityName2(name);
    }

}
