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
    //查询待付款的订单信息
    List<Deliver> queryDaiFuKuan(Integer uid);

    //点击支付，添加订单(待付款)
    int insertDeliver(String uaccount,float price,String text);

    //支付成功,将订单改为带提货
    int deliverPayOk(int did);

    //查询待提货的订单信息
    List<Deliver> queryDaiTiHuo(Integer uid);

    //查询已完成的订单信息
    List<Deliver> queryYiWanCheng(Integer uid);

    //用户确认收货
    int queRengShouHuo(Deliver deliver);

    //用户取消订单
    int quXiaoDinDan(Integer did);

    //用户查看订单详情
    Deliver queryDdXq(Integer did);
}
