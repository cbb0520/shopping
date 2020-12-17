package com.huguigu.service.impl;

import com.huguigu.dao.Emp_roleDao;
import com.huguigu.dao.RoleDao;
import com.huguigu.service.EmproleService;
import com.huguigu.vo.RoLe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmproleServiceImpl implements EmproleService {
@Autowired
Emp_roleDao emp_roleDao;
@Autowired
RoleDao roleDao;


    @Override
    public int addEmprole(int eid,int loginedi, String rids) {

        List<RoLe> staffrole = roleDao.staffrole(loginedi);
        String[] arr = rids.split(",");
        int[] ints = new int[arr.length];
        int[] staro = new int[staffrole.size()];
        for(int i=0;i<staffrole.size();i++) {
            staro[i] = staffrole.get(i).getRid();
        }
        emp_roleDao.deleEmprole(eid,staro);
        if(rids != "") {
            for (int i = 0; i < arr.length; i++) {
                ints[i] = Integer.parseInt(arr[i]);
            }
            emp_roleDao.addEmprole(eid,ints);
        }

        return  1;
    }
}
