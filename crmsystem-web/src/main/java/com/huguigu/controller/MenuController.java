package com.huguigu.controller;

import com.huguigu.service.MenuService;
import com.huguigu.vo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;


@Controller
public class MenuController {
    @Autowired
    MenuService menuService;
    @RequestMapping(value ="/meuncc.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public List<Menu> queryMenuAll(Integer eid){

        List<Menu> list = menuService.indexMenus(1);
        return list;
    }

}
