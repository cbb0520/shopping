package com.huguigu.service;


import com.huguigu.vo.GoodsComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsCommentService {
    //查询该商品下的所有评论
    List<GoodsComment> queryGoodsComment(int gid,String uaccount);

    //提交评论
    int insertGoodsComment(GoodsComment goodsComment);

    //查询该商品的平均评分
    Float queryGoodsCommentScore(int gid);

    //删除评论
    int removeComment(GoodsComment goodsComment);

    //添加点赞
    int praiseBtnOk(String uaccount, int gcid);

    //删除点赞
    int praiseBtnNo(String uaccount, int gcid);

    //发表回复
    int sendReplyChild(GoodsComment goodsComment);

    //查询该评论的所有回复
    List<GoodsComment> queryAllReplyChild(int gcid);
}
