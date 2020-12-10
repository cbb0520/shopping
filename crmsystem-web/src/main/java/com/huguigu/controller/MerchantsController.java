package com.huguigu.controller;
import com.huguigu.service.AreaService;
import com.huguigu.service.CityService;
import com.huguigu.service.MerchantsService;
import com.huguigu.service.ProvinceService;
import com.huguigu.vo.Merchants;
import com.huguigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;
@Controller
@CrossOrigin
public class MerchantsController {
    @Autowired
    MerchantsService merchantsService;
    @RequestMapping("/queryCountMerchants.action")
    @ResponseBody
    public PageVo<Merchants> queryCountMerchants(Merchants merchants,
                                          @RequestParam(value = "page",defaultValue ="1") int page,
                                          @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return merchantsService.queryCountMerchants(merchants,page,rows);
    }
    @RequestMapping("/addMerchants.action")
    @ResponseBody
    public Map addMerchants(Merchants merchants,String provincecode,String citycode,String areacode){
        Map<String,String> map=new HashMap<>();
        int num=merchantsService.addMerchants(merchants,provincecode,citycode,areacode);
        if(num==1){
            map.put("msg","添加成功");
            map.put("code","1");
        }else {
            map.put("msg","添加失败");
            map.put("code","0");
        }
        return map;
    }
    @RequestMapping("/Merchants.action")
    @ResponseBody
    public Map updatestate(Merchants merchants){
        Map<String,String> map=new HashMap<>();
        int num=merchantsService.updatestate(merchants);
        if(num==1){
            map.put("msg","发货成功");
            map.put("code","1");
        }else {
            map.put("msg","发货失败");
            map.put("code","0");
        }
        return map;
    }
    @RequestMapping("/deleteMerchants.action")
    @ResponseBody
    public Map deleteMerchants(int mid){
        Map<String,String> map=new HashMap<>();
        int num=merchantsService.deleteMerchants(mid);
        if(num==1){
            map.put("msg","删除成功");
            map.put("code","1");
        }else {
            map.put("msg","删除失败");
            map.put("code","0");
        }
        return map;
    }
    @RequestMapping("/updateMerchants.action")
    @ResponseBody
    public Map updateMerchants(Merchants merchants){
        Map<String,String> map=new HashMap<>();
        int num=merchantsService.updateMerchants(merchants);
        if(num==1){
            map.put("msg","修改成功");
            map.put("code","1");
        }else {
            map.put("msg","修改失败");
            map.put("code","0");
        }
        return map;
    }
    @RequestMapping("/queryMerchantsuid.action")
    @ResponseBody
    public Merchants queryMerchantsuid(int uid){
        return merchantsService.queryMerchantsuid(uid);
    }
}
