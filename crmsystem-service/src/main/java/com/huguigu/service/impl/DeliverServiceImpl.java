package com.huguigu.service.impl;
import com.github.pagehelper.PageHelper;
import com.huguigu.dao.DeliverDao;
import com.huguigu.service.DeliverService;
import com.huguigu.vo.Deliver;
import com.huguigu.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliverServiceImpl implements DeliverService {
    @Autowired
    DeliverDao deliverDao;
    @Override
    public PageVo<Deliver> queryCountDeliver(Deliver deliver, int page, int rows) {
        PageVo<Deliver> pageVo=new PageVo<>();
        PageHelper.startPage(page,rows);
        pageVo.setRows(deliverDao.queryAllDeliver(deliver));
        pageVo.setTotal(deliverDao.queryCountDeliver(deliver));
        return pageVo;
    }
}
