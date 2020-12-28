package com.huguigu.dao;
import com.huguigu.vo.Deliver;
import com.huguigu.vo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliverDao {
    List<Deliver> queryAllDeliver(Deliver deliver);
    int queryCountDeliver(Deliver deliver);
    Deliver queryDeliverByid(int did);
    int updateDeliverState(int did);
    List<Deliver> queryDeliverstate(Deliver deliver);
    int queryDeliver(Deliver deliver);
    List<Deliver> queryAllDeliverdsh(Deliver deliver);
    int queryCountDeliverdsh(Deliver deliver);
    List<Deliver> queryAllDeliverdfh(Deliver deliver);
    int queryCountDeliverdfh(Deliver deliver);
    int updateDeliverStatesh(int did);
    List<Deliver> queryAllDeliverdth(Deliver deliver);
    int queryCountDeliverdth(Deliver deliver);
    List<Deliver> queryAllDeliveryth(Deliver deliver);
    int queryCountDeliveryth(Deliver deliver);
    List<Deliver> queryAllDelivers(Deliver deliver);
    int queryCountDelivers(Deliver deliver);
    float querymonthlyincome(@Param("mothen")String mothen, @Param("year")String year,@Param("mid")int mid);
    //查询待付款的订单信息
    List<Deliver> queryDaiFuKuan(Integer uid);

    //点击支付，添加订单(待付款)
    int insertDeliver(Deliver deliver);

    //添加订单详情
    int addDelGoods(@Param("did")int did,@Param("gid")int gid,@Param("count")int count);

    //支付成功,将订单改为带提货
    int deliverPayOk(int did);

    //查询待提货的订单信息
    List<Deliver> queryDaiTiHuo(Integer uid);

    //查询已完成的订单信息
    List<Deliver> queryYiWanCheng(Integer uid);
}
