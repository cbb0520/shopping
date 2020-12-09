package com.huguigu.dao;

import com.huguigu.vo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDao {
    //根据员工账户id查菜单
    public List<Menu> indexMenus(@Param("eid")Integer eid, @Param("parentid")int parentid);
}
