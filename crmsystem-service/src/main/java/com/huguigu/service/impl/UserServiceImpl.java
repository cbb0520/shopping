package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.AreaDao;
import com.huguigu.dao.CityDao;
import com.huguigu.dao.ProvinceDao;
import com.huguigu.dao.UserDao;
import com.huguigu.service.UserService;

import com.huguigu.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    ProvinceDao provinceDao;
    CityDao cityDao;
    AreaDao areaDao;

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
    //前端登录
    @Override
    public User loginUser(User user) {
        return userDao.loginUser(user);
    }
    //前端注册
    @Override
    public int registerUser(User user) {
        return userDao.registerUser(user);
    }

    //根据账号查询用户
    @Override
    public User queryByuaccount(User user) {
        return userDao.queryByuaccount(user);
    }
    //查询最大用户ID
    @Override
    public int querymaxuid() {
        return userDao.querymaxuid();
    }

    @Override
    public User queryUserbyid(int uid) {
        return userDao.queryUserbyid(uid);
    }

    //根据用户名修改头像
    @Override
    public int uplodauimgByuaccount(User user) {
        return userDao.uplodauimgByuaccount(user);
    }
    //用户修改个人信息
    @Override
    public int updatauser(User user, String provincecode,String citycode, String areacode) {
        Province province =userDao.queryProvincebyid2(provincecode);
        System.out.println(province.getName());
        String pname=province.getName();
        City city= userDao.querycodeCity2(citycode);
        String cname=city.getName();
        Area area=userDao.querycodeArea2(areacode);
        String aname=area.getName();
        String useraddress=user.getAddress();
        String address=pname+"/"+cname+"/"+aname+"/"+useraddress;
        user.setAddress(address);
        return userDao.updatauser(user);
    }


}
