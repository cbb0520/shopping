package com.huguigu.service.impl;

import com.huguigu.dao.GoodsCommentDao;
import com.huguigu.dao.UserDao;
import com.huguigu.service.GoodsCommentService;
import com.huguigu.vo.GoodsComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsCommentServiceImpl implements GoodsCommentService {

    @Autowired
    GoodsCommentDao goodsCommentDao;

    @Autowired
    UserDao userDao;

    @Override
    public List<GoodsComment> queryGoodsComment(int gid,String uaccount) {
        List<GoodsComment> list = goodsCommentDao.queryGoodsComment(gid);
        try{
            for (GoodsComment g : list) {
                int uid = userDao.queryUserByUaccount(uaccount).getUid();
                int gcid = g.getId();
                if(Integer.parseInt(goodsCommentDao.isPraise(uid,gcid)) == 1){
                    g.setIsPraise(1);
                }
            }
        }catch (Exception e){
        }
        return list;
    }

    @Override
    public int insertGoodsComment(GoodsComment goodsComment) {
        return goodsCommentDao.insertGoodsComment(goodsComment);
    }

    @Override
    public Float queryGoodsCommentScore(int gid) {
        return goodsCommentDao.queryGoodsCommentScore(gid);
    }

    @Override
    public int removeComment(GoodsComment goodsComment) {
        goodsCommentDao.removeReplyChildByGCId(goodsComment.getId());
        return goodsCommentDao.removeComment(goodsComment);
    }

    @Override
    public int praiseBtnOk(String uaccount, int gcid) {
        return goodsCommentDao.praiseBtnOk(userDao.queryUserByUaccount(uaccount).getUid(),gcid);
    }

    @Override
    public int praiseBtnNo(String uaccount, int gcid) {
        return goodsCommentDao.praiseBtnNo(userDao.queryUserByUaccount(uaccount).getUid(),gcid);
    }

    @Override
    public int sendReplyChild(GoodsComment goodsComment) {
        return goodsCommentDao.sendReplyChild(goodsComment);
    }

    @Override
    public List<GoodsComment> queryAllReplyChild(int gcid) {
        return goodsCommentDao.queryAllReplyChild(gcid);
    }
}
