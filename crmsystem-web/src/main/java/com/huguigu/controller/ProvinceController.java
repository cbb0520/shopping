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
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;
    @RequestMapping("/queryAllProvince.action")
    @ResponseBody
    @CrossOrigin
    public List<Province> queryAllProvince(){
        return provinceService.queryProvince();
    }
}
