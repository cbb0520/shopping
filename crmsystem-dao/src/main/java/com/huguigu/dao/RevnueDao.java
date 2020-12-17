package com.huguigu.dao;

import org.apache.ibatis.annotations.Param;

public interface RevnueDao {

    //每个月的收入
    public  int querymothen(@Param("mothen")String mothen, @Param("year")String year);
    //年季总收入
    public  int queryyear(@Param("year")String year);
    //求总和
    public  int querysum();
}
