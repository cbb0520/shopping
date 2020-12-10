package com.huguigu.service;

import com.huguigu.vo.PageVo;
import com.huguigu.vo.Staff;
import org.apache.ibatis.annotations.Param;

public interface StaffService {
    public Staff staffLogin(String account);
    public PageVo<Staff> queryStaffbyCond(Staff staff, int page, int rows) ;
    //删除员工
    public int deleStaff(int eid);
    //添加员工
    public int addStaff(Staff staff);
    //查询单个员工
    public Staff queryByeId(int eid);
}
