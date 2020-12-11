package com.huguigu.service;

import com.huguigu.vo.PageVo;
import com.huguigu.vo.RoLe;

public interface RoleService {
    public PageVo<RoLe> queryRoLebyCond(RoLe roLe, int page, int rows) ;
    //删除角色
    public int deleRoLe(int rid);
    //添加角色
    public int addRoLe(RoLe roLe);
    //查询一个角色
    public RoLe queryByrId(int rid);
    //修改角色
    public int updateRoLe(RoLe roLe);
}
