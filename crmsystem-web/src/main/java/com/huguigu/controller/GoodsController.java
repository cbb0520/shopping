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
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class GoodsController {

    @Autowired
    GoodsService goodsService;

    //查询所有商品
    @RequestMapping("queryAllGoods.action")
    public PageVo<Goods> queryAllGoods(String gname,
                                     @RequestParam(value = "classify", required = false, defaultValue = "0") int classify,
                                     @RequestParam(value = "page", defaultValue = "1") int page,
                                     @RequestParam(value = "rows", defaultValue = "5") int rows) {
        Goods goods = new Goods();
        goods.setGname(gname);
        Classify classify1 = new Classify(classify, null, null);
        goods.setClassify(classify1);
        return goodsService.queryAllGoods(goods, page, rows);
    }

    //删除商品
    @RequestMapping("delGoods.action")
    public Map delGoods(int gid) {
        Map<String,String> map =new HashMap<String,String>();
        int i = goodsService.delGoods(gid);
        if (i < 1) {
            map.put("msg", "删除失败");
            map.put("type", "error");
        }
        if (i == 1) {
            map.put("msg", "删除成功");
            map.put("type", "success");
        }
        return map;
    }

    //根据id查询商品queryGoodsById
    @RequestMapping("queryGoodsById.action")
    public Goods queryGoodsById(int gid) {
        return goodsService.queryGoodsById(gid);
    }

    //修改商品
    @RequestMapping("uptGoods.action")
    public Map uptGoods(Goods goods,String oldgname,
                        @RequestParam(value = "img", defaultValue = "") Object img) {
        Map<String, String> map = new HashMap<String, String>();
        try {
            //用object接受，如果是字符串类型就不执行文件上传，是文件类型则强转成文件类型上传
            if(img instanceof String){
                System.out.println("String");
            }else {
                MultipartFile multipartFile = (MultipartFile)img;
                multipartFile.transferTo(new File("E:\\IdeaProjects\\shopping_after\\src\\assets\\"+multipartFile.getOriginalFilename()));
                goods.setGimgs("./src/assets/" + multipartFile.getOriginalFilename());
            }
            int i = goodsService.uptGoods(goods,oldgname);
            if (i < 1) {
                map.put("msg", "修改失败");
                map.put("type", "error");
            }
            if (i == 1) {
                map.put("msg", "修改成功");
                map.put("type", "success");
            }
            if (i == 2) {
                map.put("msg", "修改失败,该商品名已存在！");
                map.put("type", "info");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    //添加图片
    @RequestMapping("addImage.action")
    public Map addImage(@RequestParam(value = "img") MultipartFile img) {
        Map<String, String> map = new HashMap<String, String>();
        //将上传的文件保存到服务器上的前端项目的【绝对路径】
        try {
            img.transferTo(new File("E:\\IdeaProjects\\shopping_after\\src\\assets\\"+img.getOriginalFilename()));
            map.put("imgurl", img.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
