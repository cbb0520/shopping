package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.MenuDao;
import com.huguigu.dao.RoleDao;
import com.huguigu.dao.RolemenuDao;
import com.huguigu.service.RoleService;
import com.huguigu.vo.Menu;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.RoLe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDao roleDao;
    @Autowired
    MenuDao menuDao;
    @Autowired
    RolemenuDao rolemenuDao;
    @Override
    public PageVo<RoLe> queryRoLebyCond(RoLe roLe, int page, int rows) {
        PageVo<RoLe> pageVo = new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(roleDao.queryRoLe(roLe));
        pageVo.setTotal(roleDao.querycontu(roLe));
        return pageVo;
    }

    @Override
    public int deleRoLe(int rid) {
        return roleDao.deleRoLe(rid);
    }

    @Override
    public int addRoLe(RoLe roLe) {
        return roleDao.addRoLe(roLe);
    }

    @Override
    public RoLe queryByrId(int rid) {
        return roleDao.queryByrId(rid);
    }

    @Override
    public int updateRoLe(RoLe roLe) {
        return roleDao.updateRoLe(roLe);
    }

    @Override
    public List<RoLe> staffrole(int eid) {
        return roleDao.staffrole(eid);
    }

    @Override
    public int addroleMenu(int rid, int loginedi, String mids) {
        List<Menu> menus = menuDao.empMenu(loginedi);
        String[] arr = mids.split(",");
        int[] ints = new int[arr.length];
        int[] staro = new int[menus.size()];
        for(int i=0;i<menus.size();i++) {
            staro[i] = menus.get(i).getId();
        }
        for(int i=0;i<arr.length;i++){
            ints[i] = Integer.parseInt(arr[i]);
        }
        rolemenuDao.deleroleMenu(rid,staro);

        return rolemenuDao.addroleMenu(rid,ints);
    }
}
