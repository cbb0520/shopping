package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.RoleDao;
import com.huguigu.service.RoleService;
import com.huguigu.vo.PageVo;
import com.huguigu.vo.RoLe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDao roleDao;
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
}
