package com.huguigu.service.impl;

import com.huguigu.dao.RevnueDao;
import com.huguigu.service.RevnueService;
import com.huguigu.vo.Revnue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RevnueServiceImpl implements RevnueService {
    @Autowired
    RevnueDao revnueDao;
    @Override
    public List<Revnue> queryshouru(int month ,String year) {
        List<Revnue> incoMes = new ArrayList<>();
        for (int i = 1;i<month+1;i++){
            Revnue revnue = new Revnue();
            float querymothen = revnueDao.querymothen(String.valueOf(i), year);
            revnue.setMothen(i+"月");
            revnue.setPrice(querymothen);
            incoMes.add(revnue);
        }
        Revnue me1 = new Revnue();
        Revnue me2 = new Revnue();
        Revnue me3 = new Revnue();
        Revnue me = new Revnue();
        float querynianji = revnueDao.queryyear(year);//年和
        float querysum = revnueDao.querysum();//总和
        System.out.println(querynianji);
        int yongjin = (int) (querynianji*0.1);
        int sumyongjin = (int) (querysum*0.1);
        me1.setMothen("年度总收入");
        me1.setPrice(querynianji);
        me.setMothen("年度总发放佣金");
        me.setPrice(yongjin);
        me2.setMothen("公司总营收");
        me2.setPrice(querysum);
        me3.setMothen("佣金总发放量");
        me3.setPrice(sumyongjin);
        incoMes.add(me1);
        incoMes.add(me);
        incoMes.add(me2);
        incoMes.add(me3);
        return incoMes;
    }

    @Override
    public List<Revnue> queryqinwu(int mothen, String year) {
        List<Revnue> incoMes = new ArrayList<>();
        for (int i = 1;i<mothen+1;i++){
            Revnue revnue = new Revnue();
            float querymothen = revnueDao.querymothen(String.valueOf(i), year);
            revnue.setMothen(i+"月");
            revnue.setPrice(querymothen);
            incoMes.add(revnue);
        }
        return incoMes;
    }


}
