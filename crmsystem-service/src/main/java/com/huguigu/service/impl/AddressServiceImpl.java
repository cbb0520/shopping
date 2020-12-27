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

    @Override
    public int removeAddClass(String uaccount) {
        return addressDao.removeAddClass(userDao.queryUserByUaccount(uaccount).getUid());
    }

    @Override
    public int insertAddClass(int aid,String uaccount) {
        addressDao.removeAddClassOfAid(userDao.queryUserByUaccount(uaccount).getUid(),aid);
        return addressDao.insertAddClass(aid);
    }

    @Override
    public int insertAddress(String uaccount, int mid, String name, String phone) {
        int uid = userDao.queryUserByUaccount(uaccount).getUid();
        return addressDao.insertAddress(uid,mid,name,phone);
    }

    @Override
    public int removeAddr(int aid) {
        return addressDao.removeAddr(aid);
    }
}
