package com.huguigu.service;

import com.huguigu.vo.Staff;
import org.apache.ibatis.annotations.Param;

public interface StaffService {
    public Staff staffLogin(String account);
}
