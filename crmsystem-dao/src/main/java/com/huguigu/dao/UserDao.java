package com.huguigu.dao;
import com.huguigu.vo.Area;
import com.huguigu.vo.City;
import com.huguigu.vo.Province;
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
    //根据用户名修改头像
    public int uplodauimgByuaccount(User user);
    //用户修改个人信息
    public int updatauser(User user);
    Province queryProvincebyid2(String code);
    City querycodeCity2(String code);
    Area querycodeArea2(String code);
}
