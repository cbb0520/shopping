package com.huguigu.dao;

import com.huguigu.vo.Classify;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassifyDao {
    //根据id查询商品类型
    Classify queryClassById(int id);

    //查询所有类别
    List<Classify> queryAllClassify(Classify classify);

    //查询类别数量
    int queryCountClassify(Classify classify);

    //删除类别
    int delClassifyById(int id);

    //根据id查询类型
    Classify queryClassifyById(int id);

    //修改类型
    int uptClassify(Classify classify);

    //添加类型
    int addCLassify(Classify classify);

    //判断是否有相同的类型名
    int isEqual(@Param("oldfname") String oldfname, @Param("newfname") String newfname);
    //查询所有的分类不包含分页
    List<Classify> queryClassify();
}
