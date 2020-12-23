package com.huguigu.dao;
import com.huguigu.vo.User;
import java.util.List;

public interface UserDao {
    //查询所有用户信息
    public List<User> queryAlluser(User user);
    //查询所有用户信息的数量
    public int queryAlluserCount(User user);
    User queryUserbyid(int uid);
    //前端登录
    public User loginUser(User user);
    //前端注册
    public int registerUser(User user);
    //根据账号查询用户
    public User queryByuaccount(User user);
    //查询最大用户ID
    public int querymaxuid();

    //根据用户名查询用户信息
    User queryUserByUaccount(String uaccount);
}
