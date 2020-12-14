package com.huguigu.service.impl;

import com.github.pagehelper.PageHelper;
import com.huguigu.dao.ClassifyDao;
import com.huguigu.service.ClassifyService;
import com.huguigu.vo.Classify;
import com.huguigu.vo.Goods;
import com.huguigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    ClassifyDao classifyDao;

    @Override
    public PageVo<Classify> queryAllClassify(Classify classify, int page, int rows) {
        PageVo<Classify> pageVo = new PageVo<>();
        PageHelper.startPage(page, rows);
        pageVo.setRows(classifyDao.queryAllClassify(classify));
        pageVo.setTotal(classifyDao.queryCountClassify(classify));
        return pageVo;
    }

    @Override
    public int delClassifyById(int id) {
        return classifyDao.delClassifyById(id);
    }

    @Override
    public Classify queryClassifyById(int id) {
        return classifyDao.queryClassifyById(id);
    }

    @Override
    public int uptClassify(Classify classify) {
        return classifyDao.uptClassify(classify);
    }

    @Override
    public int addCLassify(Classify classify) {
        return classifyDao.addCLassify(classify);
    }
}
