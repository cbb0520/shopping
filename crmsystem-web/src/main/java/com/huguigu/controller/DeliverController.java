package com.huguigu.controller;
import com.huguigu.service.DeliverService;
import com.huguigu.vo.Deliver;
import com.huguigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.stream.Collectors;

@Controller
@CrossOrigin
public class DeliverController {
    @Autowired
    DeliverService deliverService;
    @RequestMapping("/queryCountDeliver.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliver(Deliver deliver,
                                             @RequestParam(value = "page",defaultValue ="1") int page,
                                             @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliver(deliver,page,rows);
    }
    @RequestMapping("/updateDeliverState.action")
    @ResponseBody
    public Map updateDeliverState(int did){
        Map<String,String> map=new HashMap<>();
        int num=deliverService.updateDeliverState(did);
        if(num==1){
            map.put("msg","发货成功");
            map.put("code","1");
        }else {
            map.put("msg","发货失败");
            map.put("code","0");
        }
        return map;
    }
    @RequestMapping("/queryDeliverstate.action")
    @ResponseBody
    public PageVo<Deliver> queryDeliverstate(Deliver deliver,
                                             @RequestParam(value = "page",defaultValue ="1") int page,
                                             @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryDeliverstate(deliver,page,rows);
    }
    @RequestMapping("/queryCountDeliverdsh.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliverdsh(Deliver deliver,
                                             @RequestParam(value = "page",defaultValue ="1") int page,
                                             @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliverdsh(deliver,page,rows);
    }
    @RequestMapping("/queryCountDeliverdfh.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliverdfh(Deliver deliver,
                                             @RequestParam(value = "page",defaultValue ="1") int page,
                                             @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliverdfh(deliver,page,rows);
    }
    @RequestMapping("/updateDeliverStatesh.action")
    @ResponseBody
    public Map updateDeliverStatesh(int did){
        Map<String,String> map=new HashMap<>();
        int num=deliverService.updateDeliverStatesh(did);
        if(num==1){
            map.put("msg","收货成功");
            map.put("code","1");
        }else {
            map.put("msg","收货失败");
            map.put("code","0");
        }
        return map;
    }
    @RequestMapping("/queryCountDeliverdth.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliverdth(Deliver deliver,
                                                @RequestParam(value = "page",defaultValue ="1") int page,
                                                @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliverdth(deliver,page,rows);
    }
    @RequestMapping("/queryCountDeliveryth.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDeliveryth(Deliver deliver,
                                                @RequestParam(value = "page",defaultValue ="1") int page,
                                                @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDeliveryth(deliver,page,rows);
    }
    @RequestMapping("/queryCountDelivers.action")
    @ResponseBody
    public PageVo<Deliver> queryCountDelivers(Deliver deliver,
                                                @RequestParam(value = "page",defaultValue ="1") int page,
                                                @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return deliverService.queryCountDelivers(deliver,page,rows);
    }
    @RequestMapping("/querymonthlyincome.action")
    @ResponseBody
    public List<Deliver> querymonthlyincome(String year,int mid) {
        Calendar cal = Calendar.getInstance();
        if (year==null || year == "") {
            year = String.valueOf(cal.get(Calendar.YEAR));
        }
        int month = cal.get(Calendar.MONTH) + 1;
        List<Deliver> querymonthlyincome = deliverService.querymonthlyincome(month,year,mid);
        return querymonthlyincome;
    }
}
