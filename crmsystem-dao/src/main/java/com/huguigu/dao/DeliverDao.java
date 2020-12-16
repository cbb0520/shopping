package com.huguigu.dao;
import com.huguigu.vo.Deliver;
import java.util.List;

public interface DeliverDao {
    List<Deliver> queryAllDeliver(Deliver deliver);
    int queryCountDeliver(Deliver deliver);
    Deliver queryDeliverByid(int did);
    int updateDeliverState(int did);
    List<Deliver> queryDeliverstate(Deliver deliver);
    int queryDeliver(Deliver deliver);
}
