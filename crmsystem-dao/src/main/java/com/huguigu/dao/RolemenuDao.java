package com.huguigu.dao;

import org.apache.ibatis.annotations.Param;

public interface RolemenuDao {
    //删除当前用户所有菜单
    public  int deleroleMenu(@Param("rid")int rid, @Param("mids")int[] mids);
    //添加角色菜单权限
    public int  addroleMenu(@Param("rid")int rid, @Param("mids")int[] mids);

}
