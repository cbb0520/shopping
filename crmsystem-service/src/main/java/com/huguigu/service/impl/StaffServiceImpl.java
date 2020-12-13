package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.StaffDao;
import com.huguigu.service.StaffService;
import com.huguigu.vo.PageVo;
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

    @Override
    public PageVo<Staff> queryStaffbyCond(Staff staff, int page, int rows) {
        PageVo<Staff> pageVo = new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(staffDao.queryStaff(staff));
        pageVo.setTotal(staffDao.querycontu(staff));
        return pageVo;
    }

    @Override
    public int deleStaff(int eid) {
        return staffDao.deleStaff(eid);
    }

    @Override
    public int addStaff(Staff staff) {
        return staffDao.addStaff(staff);
    }

    @Override
    public Staff queryByeId(int eid) {
        return staffDao.queryByeId(eid);
    }

    @Override
    public int updateStaff(Staff staff) {
        return staffDao.updateStaff(staff);
    }
}
