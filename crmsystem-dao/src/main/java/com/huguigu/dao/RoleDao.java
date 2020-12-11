package com.huguigu.dao;

import com.huguigu.vo.RoLe;

import java.util.List;

public interface RoleDao {
    //条件查询
    public List<RoLe> queryRoLe(RoLe roLe);
    //数据条数
    public int querycontu(RoLe roLe);
    //删除角色
    public int deleRoLe(int rid);
    //添加角色
    public int addRoLe(RoLe roLe);
    //查询一个角色
    public RoLe queryByrId(int rid);
    //修改角色
    public int updateRoLe(RoLe roLe);
}
