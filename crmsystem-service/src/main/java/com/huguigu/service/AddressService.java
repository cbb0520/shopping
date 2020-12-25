package com.huguigu.service;

import com.huguigu.vo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressService {
    //根据用户名查询地址信息
    List<Address> queryAddrByUid(String uaccount);

    //移除地址的class
    int removeAddClass(String uaccount);

    //添加地址class
    int insertAddClass(int aid,String uaccount);

    //添加收货地址
    int insertAddress(String uaccount, int mid, String name, String phone);

    //删除一个收货地址
    int removeAddr(int aid);
}
