package com.huguigu.controller;
import com.huguigu.service.MerchantsService;
import com.huguigu.vo.Merchants;
import com.huguigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
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
    public Map addMerchants(Merchants merchants, String provincecode, String citycode, String areacode,
                            @RequestParam(value = "filename",required =false) MultipartFile filename, HttpServletRequest request){
        System.out.println(merchants);
        String path =request.getServletContext().getRealPath("/upload");
        File file  =new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        try {
            merchants.setMimgs((filename.getOriginalFilename()));
            filename.transferTo(new File(path,merchants.getMimgs()));
            System.out.println("文件保存成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
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
    @RequestMapping("/updatestate.action")
    @ResponseBody
    public Map updatestate(Merchants merchants){
        merchants.setState("已同意");
        Map<String,String> map=new HashMap<>();
        int num=merchantsService.updatestate(merchants);
        if(num==1){
            map.put("msg","审批成功");
            map.put("code","1");
        }else {
            map.put("msg","审批失败");
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
    @RequestMapping("/queryCountshengpiMerchants.action")
    @ResponseBody
    public PageVo<Merchants> queryCountshengpiMerchants(Merchants merchants,
                                                 @RequestParam(value = "page",defaultValue ="1") int page,
                                                 @RequestParam(value ="rows",defaultValue ="5")  int rows){
        return merchantsService.queryCountshengpiMerchants(merchants,page,rows);
    }
    @RequestMapping("/queryMerchantsBYId.action")
    @ResponseBody
    public Merchants queryMerchantsBYId(int mid){
        return merchantsService.queryMerchantsBYId(mid);
    }
}
