package com.huguigu.dao;

import org.apache.ibatis.annotations.Param;

public interface Emp_roleDao {
    //批量删除角色权限
    public int  deleEmprole(@Param("eid")int eid, @Param("rids")int[] rids);
    //批量增加权限
    public int   addEmprole(@Param("eid")int eid, @Param("rids")int[] rids);
}
