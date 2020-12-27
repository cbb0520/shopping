package com.huguigu.dao;
import com.huguigu.vo.Deliver;
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
    List<Deliver> queryDaiFuKuan(Integer ustate);
}
