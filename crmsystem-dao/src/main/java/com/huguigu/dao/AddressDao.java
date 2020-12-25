package com.huguigu.dao;

import com.huguigu.vo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressDao {
    //根据用户名查询地址信息
    List<Address> queryAddrByUid(int uid);

    //根据用户名查询地址信息2  （关联查询使用）
    List<Address> queryAddrByUid2(int aid);

    //移除地址的class
    int removeAddClass(int uid);

    //添加地址class
    int insertAddClass(int aid);

    //移除用户除本身的其他地址
    int removeAddClassOfAid(@Param("uid") int uid, @Param("aid") int aid);

    //添加收货地址
    int insertAddress(@Param("uid") int uid, @Param("mid") int mid, @Param("name") String name, @Param("phone") String phone);

    //删除一个收货地址
    int removeAddr(int aid);
}
