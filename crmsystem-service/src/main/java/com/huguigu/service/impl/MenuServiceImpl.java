package com.huguigu.service.impl;

import com.huguigu.dao.MenuDao;
import com.huguigu.service.MenuService;
import com.huguigu.vo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;
    @Override
    public List<Menu> indexMenus(Integer eid) {
        List<Menu> meuns1 = menuDao.indexMenus(eid,0);
        for (Menu pmenu: meuns1) {
            List<Menu> childmenus =menuDao.indexMenus(eid,pmenu.getId());
            pmenu.setChildren(childmenus);
        }
        return meuns1;
    }
}
