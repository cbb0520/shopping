package com.huguigu.controller;
import com.huguigu.service.Del_goodsService;
import com.huguigu.vo.Del_goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
@CrossOrigin
public class Del_goodsController {
    @Autowired
    Del_goodsService del_goodsService;
    @RequestMapping("queryAllDel_goods.action")
    @ResponseBody
    public List<Del_goods> queryAllDel_goods(Integer did){
        return del_goodsService.queryAllDel_goods(did);
    }
}
