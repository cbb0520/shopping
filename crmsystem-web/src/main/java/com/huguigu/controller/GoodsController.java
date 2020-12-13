package com.huguigu.controller;

import com.huguigu.service.GoodsService;
import com.huguigu.vo.Classify;
import com.huguigu.vo.Goods;
import com.huguigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    //查询所有商品
    @RequestMapping("queryAllGoods.action")
    public PageVo<Goods> queryAllGoods(String  gname,
                                       @RequestParam(value = "classify",required = false,defaultValue = "0")int classify,
                                       @RequestParam(value = "page", defaultValue = "1") int page,
                                       @RequestParam(value = "rows", defaultValue = "5") int rows){
       // System.out.println(goods);
      //  System.out.println(classify);
        Goods goods=new Goods();
        goods.setGname(gname);
        Classify classify1 = new Classify(classify,null,null);
        goods.setClassify(classify1);
        return goodsService.queryAllGoods(goods,page,rows);
    }

    //删除商品
    @RequestMapping("delGoods.action")
    public Map delGoods(int gid){
        Map<String,String> map =new HashMap<String,String>();
        int i = goodsService.delGoods(gid);
        if (i < 0) {
            map.put("msg","删除失败");
            map.put("type","error");
        }
        if (i == 1) {
            map.put("msg","删除成功");
            map.put("type","success");
        }
        return map;
    }

    //根据id查询商品queryGoodsById
    @RequestMapping("queryGoodsById.action")
    public Goods queryGoodsById(int gid){
        System.out.println(goodsService.queryGoodsById(gid));
        return goodsService.queryGoodsById(gid);
    }

    //修改商品
    @RequestMapping("uptGoods.action")
    public Map uptGoods(Goods goods){
        System.out.println(goods);
        Map<String,String> map =new HashMap<String,String>();
        int i = goodsService.uptGoods(goods);
        if (i < 0) {
            map.put("msg","修改失败");
            map.put("type","error");
        }
        if (i == 1) {
            map.put("msg","修改成功");
            map.put("type","success");
        }
        return map;
    }
}
