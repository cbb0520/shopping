package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.UserDao;
import com.huguigu.service.UserService;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    //查询所有用户信息
    @Override
    public PageVo<User> queryAlluserCount(User user, int page, int rows) {
        PageVo<User> pageVo = new PageVo<>();

        //在需要分页的代码调用前 执行以下代码
        PageHelper.startPage(page,rows);
        //获取分页后 显示的数据集合
        pageVo.setRows(userDao.queryAlluser(user));
        //获取总的记录数量
        pageVo.setTotal(userDao.queryAlluserCount(user));
        return pageVo;
    }
}