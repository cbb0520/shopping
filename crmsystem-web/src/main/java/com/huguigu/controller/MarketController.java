package com.huguigu.controller;

import com.huguigu.service.MarketService;
import com.huguigu.vo.Ber;
import com.huguigu.vo.Market;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Action;
import java.util.List;

@Controller
@CrossOrigin
public class MarketController {
    @Autowired
    MarketService marketService;
    @RequestMapping("/queryMarketbyCond.action")
    @ResponseBody
    public PageVo<Market> queryMarketbyCond(String gname, String fname,
                                            @RequestParam(value = "page",defaultValue = "1")int page,
                                            @RequestParam(value = "rows",defaultValue = "5")int rows
    ){
        return marketService.queryMarketbyCond(gname,fname,page,rows);
    }
    @RequestMapping("/quryMarketFen.action")
    @ResponseBody
    public List<Ber> quryMarketFen(){
        return marketService.quryMarketFen();
    }
}
