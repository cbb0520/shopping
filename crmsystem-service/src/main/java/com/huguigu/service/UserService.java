package com.huguigu.service;

import com.huguigu.vo.PageVo;
import com.huguigu.vo.User;

import java.util.List;

public interface UserService {
    //查询所有用户信息
    public PageVo<User> queryAlluserCount(User user, int page, int rows) ;
}
