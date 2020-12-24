package com.huguigu.dao;

import com.huguigu.vo.Area;
import com.huguigu.vo.City;

import java.util.List;

public interface AreaDao {
    List<Area> queryAreaByid(String citycode);
    Area querycodeArea(String code);
    Area queryAreaName(String name);
    Area queryAreabynamecitycode(Area area);
    City queryCityName2(String name);
}
