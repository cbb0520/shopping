package com.huguigu.service;

import com.huguigu.vo.PageVo;
import com.huguigu.vo.User;

import java.util.List;

public interface UserService {
    //查询所有用户信息
    public PageVo<User> queryAlluserCount(User user, int page, int rows) ;
    //前端登录
    public User loginUser(User user);
    //前端注册
    public int registerUser(User user);
    //根据账号查询用户
    public User queryByuaccount(User user);
    //查询最大用户ID
    public int querymaxuid();
    //根据uid查询用户
    User queryUserbyid(int uid);
    //根据用户名修改头像
    public int uplodauimgByuaccount(User user);
}
