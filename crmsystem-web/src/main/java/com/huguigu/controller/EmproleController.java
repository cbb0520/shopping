package com.huguigu.controller;

import com.huguigu.service.EmproleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class EmproleController {
    @Autowired
    EmproleService emproleService;

    @RequestMapping(value = "/addEmprole.action",produces = "text/json;charset=utf-8")
    @ResponseBody
    public String addEmprole(int eid,String rids) {

        int shouquan = emproleService.addEmprole(eid, rids);
        if (1 > 0) {
            return "恭喜你，授权成功";
        }
        return "授权失败";
    }
}
