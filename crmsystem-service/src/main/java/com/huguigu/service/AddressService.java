package com.huguigu.service;

import com.huguigu.vo.Address;

import java.util.List;

public interface AddressService {
    //根据用户名查询地址信息
    List<Address> queryAddrByUid(String uaccount);
}
