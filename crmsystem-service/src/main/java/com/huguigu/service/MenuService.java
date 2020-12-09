package com.huguigu.service;

import com.huguigu.vo.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuService {
    //根据员工账户id查菜单
    public List<Menu> indexMenus(Integer eid);
}
