package com.huguigu.service.impl;
import com.huguigu.dao.Del_goodsDao;
import com.huguigu.service.Del_goodsService;
import com.huguigu.vo.Del_goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Del_goodsServiceImpl implements Del_goodsService {
    @Autowired
    Del_goodsDao del_goodsDao;
    @Override
    public List<Del_goods> queryAllDel_goods(int did) {
        return del_goodsDao.queryAllDel_goods(did);
    }
}
