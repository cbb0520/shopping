package com.huguigu.dao;

import com.huguigu.vo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {
    //根据员工账户id 和 parentid查菜单
    public List<Menu> indexMenus(@Param("eid")Integer eid, @Param("parentid")int parentid);
    //查询角色含有的菜单
    public  List<Menu> queryMenuByrid(Integer rid);
    //查询员工的菜单
    public List<Menu> empMenu(Integer eid);
}
