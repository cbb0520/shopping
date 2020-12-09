package com.huguigu.dao;

import com.huguigu.vo.Staff;
import org.apache.ibatis.annotations.Param;

public interface StaffDao {
    //登入
    public Staff staffLogin(@Param("account")String account);
}
