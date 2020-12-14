package com.huguigu.service.impl;

import com.huguigu.dao.Emp_roleDao;
import com.huguigu.service.EmproleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmproleServiceImpl implements EmproleService {
@Autowired
Emp_roleDao emp_roleDao;


    @Override
    public int addEmprole(int eid, String rids) {
        String[] arr = rids.split(",");
        int[] ints = new int[arr.length];

        for(int i=0;i<arr.length;i++){

            ints[i] = Integer.parseInt(arr[i]);

        }
        emp_roleDao.deleEmprole(eid,ints);
        return emp_roleDao.addEmprole(eid,ints);
    }
}
