package com.huguigu.service;
import com.huguigu.vo.Deliver;
import com.huguigu.vo.PageVo;
import java.util.List;

public interface DeliverService {
    PageVo<Deliver> queryCountDeliver(Deliver deliver, int page, int rows);
    int updateDeliverState(int did);
    PageVo<Deliver> queryDeliverstate(Deliver deliver, int page, int rows);
    PageVo<Deliver> queryCountDeliverdsh(Deliver deliver, int page, int rows);
    PageVo<Deliver> queryCountDeliverdfh(Deliver deliver, int page, int rows);
    int updateDeliverStatesh(int did);
    PageVo<Deliver> queryCountDeliverdth(Deliver deliver, int page, int rows);
    PageVo<Deliver> queryCountDeliveryth(Deliver deliver, int page, int rows);
    PageVo<Deliver> queryCountDelivers(Deliver deliver, int page, int rows);
    List<Deliver> querymonthlyincome(int month, String year,int mid);
}
