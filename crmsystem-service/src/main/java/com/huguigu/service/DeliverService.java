package com.huguigu.service;
import com.huguigu.vo.Deliver;
import com.huguigu.vo.PageVo;
public interface DeliverService {
    PageVo<Deliver> queryCountDeliver(Deliver deliver, int page, int rows);
}
