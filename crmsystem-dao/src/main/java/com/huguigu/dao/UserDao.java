package com.huguigu.dao;
import com.huguigu.vo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //查询所有用户信息
    public List<User> queryAlluser(User user);
    //查询所有用户信息的数量
    public int queryAlluserCount(User user);
}
