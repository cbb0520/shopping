package com.huguigu.controller;
import com.huguigu.service.CityService;
import com.huguigu.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
public class CityController {
    @Autowired
    CityService cityService;
    @RequestMapping("/queryCity.action")
    @ResponseBody
    @CrossOrigin
    public List<City> queryCity(String provincecode){
        return cityService.queryCityByid(provincecode);
    }
}
