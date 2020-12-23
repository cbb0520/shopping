package com.huguigu.service;

import com.huguigu.vo.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryAreaByid(String citycode);
    Area querycodeArea(String code);
    Area queryAreaName(String name);
}
