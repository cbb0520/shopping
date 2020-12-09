package com.huguigu.service.impl;

import com.huguigu.dao.StaffDao;
import com.huguigu.service.StaffService;
import com.huguigu.vo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffDao staffDao;
    @Override
    public Staff staffLogin(String account) {
        return staffDao.staffLogin(account);
    }
}
