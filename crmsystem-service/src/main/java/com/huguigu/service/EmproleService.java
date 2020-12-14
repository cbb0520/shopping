package com.huguigu.service;

import org.apache.ibatis.annotations.Param;

public interface EmproleService {
    //批量增加权限
    public int   addEmprole(int eid,String rids);
}
