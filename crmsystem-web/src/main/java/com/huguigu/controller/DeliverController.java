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
}
