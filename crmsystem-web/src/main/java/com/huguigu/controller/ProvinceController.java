package com.huguigu.controller;
import com.huguigu.service.ProvinceService;
import com.huguigu.vo.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
@CrossOrigin
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;
    @RequestMapping("/queryAllProvince.action")
    @ResponseBody
    public List<Province> queryAllProvince(){
        return provinceService.queryProvince();
    }
    @RequestMapping("/queryProvinceName.action")
    @ResponseBody
    public Province queryProvinceName(String name){
        return provinceService.queryProvinceName(name);
    }
}
