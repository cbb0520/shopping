package com.huguigu.dao;

import com.huguigu.vo.Area;

import java.util.List;

public interface AreaDao {
    List<Area> queryAreaByid(String citycode);
}
