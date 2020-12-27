package com.huguigu.controller;

import com.huguigu.service.AddressService;
import com.huguigu.vo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping("queryAddByUid.action")
    public List<Address> queryAddByUid(String uaccount){
        return addressService.queryAddrByUid(uaccount);
    }

    //移除地址的class
    @RequestMapping("removeAddClass.action")
    public int removeAddClass(String uaccount){
        return addressService.removeAddClass(uaccount);
    }

    //添加地址class
    @RequestMapping("insertAddClass.action")
    public int insertAddClass(int aid,String uaccount){
        return addressService.insertAddClass(aid,uaccount);
    }

    //添加收货信息
    @RequestMapping("insertAddress.action")
    public Map<String,String> insertAddress(String uaccount, int mid, String name, String phone){
        Map<String,String> map = new HashMap<String,String>();
        int i = addressService.insertAddress(uaccount,mid,name,phone);
        if(i == 1){
            map.put("msg","添加成功");
            map.put("type","s'cuccess");
        }
        return map;
    }

    //删除收货地址
    @RequestMapping("removeAddr.action")
    public Map<String,String> removeAddr(int aid) {
        Map<String,String> map = new HashMap<String,String>();
        int i = addressService.removeAddr(aid);
        if(i == 1){
            map.put("msg","删除成功");
            map.put("type","s'cuccess");
        }
        return map;
    }

}
