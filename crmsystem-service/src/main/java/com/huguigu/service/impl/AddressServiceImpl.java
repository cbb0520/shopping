package com.huguigu.service.impl;

import com.huguigu.dao.AddressDao;
import com.huguigu.dao.UserDao;
import com.huguigu.service.AddressService;
import com.huguigu.vo.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressDao addressDao;

    @Autowired
    UserDao userDao;

    @Override
    public List<Address> queryAddrByUid(String uaccount) {
        return addressDao.queryAddrByUid(userDao.queryUserByUaccount(uaccount).getUid());
    }
}
