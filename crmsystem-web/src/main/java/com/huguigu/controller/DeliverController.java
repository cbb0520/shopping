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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        System.out.println(did);
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
}
