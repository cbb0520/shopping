package com.huguigu.controller;

import com.huguigu.service.RevnueService;
import com.huguigu.vo.Revnue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@CrossOrigin
public class RevnueController {
    @Autowired
    RevnueService revnueService;
    @RequestMapping("/queryshouru.action")
    @ResponseBody
    public List<Revnue> queryshouru(String year,Integer month) {
        month=12;
        Calendar cal = Calendar.getInstance();
        if (year.equals("null") || year == "" || year==String.valueOf(cal.get(Calendar.YEAR))) {
            year = String.valueOf(cal.get(Calendar.YEAR));
            month = cal.get(Calendar.MONTH) + 1;
        }
        return revnueService.queryshouru(month,year);
    }

    @RequestMapping("/queryqinwu.action")
    @ResponseBody
    public List<Revnue> queryqinsan(String year,Integer month) {
        month=12;
        Calendar cal = Calendar.getInstance();
        if (year.equals("null") || year == "" || year==String.valueOf(cal.get(Calendar.YEAR))) {
            year = String.valueOf(cal.get(Calendar.YEAR));
            month = cal.get(Calendar.MONTH) + 1;
        }
        List<Revnue> queryshouru = revnueService.queryqinwu(month,year);
        List<Revnue> queryshouru2 = queryshouru.stream().sorted(Comparator.comparing(Revnue::getPrice).reversed()).collect(Collectors.toList());


        return queryshouru2;
    }


}
