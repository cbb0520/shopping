package com.huguigu.dao;

import com.huguigu.vo.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffDao {
    //登入
    public Staff staffLogin(Staff staff);
    //条件查询
    public List<Staff> queryStaff(Staff staff);
    //数据条数
    public int querycontu(Staff staff);
    //删除员工
    public int deleStaff(int eid);
    //添加员工
    public int addStaff(Staff staff);
    //查询单个员工
    public Staff queryByeId(int eid);
    //修改
    public int updateStaff(Staff staff);
}
