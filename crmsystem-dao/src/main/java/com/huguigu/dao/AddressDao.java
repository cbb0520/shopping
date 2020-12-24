package com.huguigu.dao;

import com.huguigu.vo.Address;

import java.util.List;

public interface AddressDao {
    //根据用户名查询地址信息
    List<Address> queryAddrByUid(int uid);
}
