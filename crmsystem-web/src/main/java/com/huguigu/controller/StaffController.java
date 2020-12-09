package com.huguigu.controller;

import com.huguigu.service.StaffService;
import com.huguigu.vo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping(value ="/staffLogin.action",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public  String  staffLogin(Staff staff, HttpServletResponse response) {
        Staff staff1 = staffService.staffLogin(staff.getAccount());
        if(staff1 !=null){
            return "登入成功";
        }

        return "登入失败";
    }
}
