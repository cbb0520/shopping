package com.huguigu.controller;

import com.huguigu.service.AreaService;
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
}
