package com.huguigu.controller;

import com.huguigu.service.AddressService;
import com.huguigu.vo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping("queryAddByUid.action")
    public List<Address> queryAddByUid(String uaccount){
        System.out.println(uaccount);
        return addressService.queryAddrByUid(uaccount);
    }
}
