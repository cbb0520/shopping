package com.huguigu.dao;

import com.huguigu.vo.GoodsComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsCommentDao {
    //查询该商品下的所有评论
    List<GoodsComment> queryGoodsComment(int gid);

    //提交评论
    int insertGoodsComment(GoodsComment goodsComment);

    //查询该商品的平均评分
    Float queryGoodsCommentScore(int gid);

    //删除评论
    int removeComment(GoodsComment goodsComment);

    //判断是否点赞
    String isPraise(@Param("uid") int uid,@Param("gcid") int gcid);

    //添加点赞
    int praiseBtnOk(@Param("uid") int uid,@Param("gcid") int gcid);

    //删除点赞
    int praiseBtnNo(@Param("uid") int uid,@Param("gcid") int gcid);

    //发表回复
    int sendReplyChild(GoodsComment goodsComment);

    //查询该评论的所有回复
    List<GoodsComment> queryAllReplyChild(int gcid);

    //根据父评论删除所有子评论
    int removeReplyChildByGCId(int gcid);
}
