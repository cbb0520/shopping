package com.huguigu.service.impl;

import com.huguigu.dao.AreaDao;
import com.huguigu.service.AreaService;
import com.huguigu.vo.Area;
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
}
