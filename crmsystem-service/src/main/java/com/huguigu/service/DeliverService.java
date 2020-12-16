package com.huguigu.service;
import com.huguigu.vo.Deliver;
import com.huguigu.vo.PageVo;
import java.util.List;

public interface DeliverService {
    PageVo<Deliver> queryCountDeliver(Deliver deliver, int page, int rows);
    int updateDeliverState(int did);
    PageVo<Deliver> queryDeliverstate(Deliver deliver, int page, int rows);

}
