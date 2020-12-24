package com.huguigu.controller;

import com.huguigu.service.AreaService;
import com.huguigu.service.CityService;
import com.huguigu.vo.Area;
import com.huguigu.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@CrossOrigin
@Controller
public class AreaController {
    @Autowired
    AreaService areaService;
    @RequestMapping("queryArea.action")
    @ResponseBody
    public List<Area> queryArea(String citycode){
        return areaService.queryAreaByid(citycode);
    }
    @RequestMapping("queryAreaName.action")
    @ResponseBody
    public Area queryAreaName(String name){
        return areaService.queryAreaName(name);
    }
    @RequestMapping("queryAreabynamecitycode.action")
    @ResponseBody
    public Area queryAreabynamecitycode(String name, String cityname){
        //根据城市名查询citycode
        City city=areaService.queryCityName2(cityname);
        Area area=new Area();
        area.setName(name);
        area.setCitycode(city.getCode());
        return areaService.queryAreabynamecitycode(area);
    }
}
