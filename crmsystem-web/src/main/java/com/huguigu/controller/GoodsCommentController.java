package com.huguigu.controller;

import com.huguigu.dao.UserDao;
import com.huguigu.service.GoodsCommentService;
import com.huguigu.vo.GoodsComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class GoodsCommentController {

    @Autowired
    GoodsCommentService goodsCommentService;

    @Autowired
    UserDao userDao;

    @RequestMapping("queryGoodsAllComment.action")
    public List<GoodsComment> queryGoodsAllComment(int gid,String uaccount){
        return goodsCommentService.queryGoodsComment(gid,uaccount);
    }

    @RequestMapping("insertGoodsComment.action")
    public int insertGoodsComment(String uaccount,GoodsComment goodsComment) {
        goodsComment.setUser(userDao.queryUserByUaccount(uaccount));
        return goodsCommentService.insertGoodsComment(goodsComment);
    }

    @RequestMapping("removeComment.action")
    public int removeComment(GoodsComment goodsComment) {
        return goodsCommentService.removeComment(goodsComment);
    }

    @RequestMapping("praiseBtnOk.action")
    public int praiseBtnOk(String uaccount, int gcid) {
        return goodsCommentService.praiseBtnOk(uaccount,gcid);
    }

    @RequestMapping("praiseBtnNo.action")
    public int praiseBtnNo(String uaccount, int gcid) {
        return goodsCommentService.praiseBtnNo(uaccount,gcid);
    }

    @RequestMapping("sendReplyChild.action")
    public int sendReplyChild(String uaccount, GoodsComment goodsComment) {
        goodsComment.setUser(userDao.queryUserByUaccount(uaccount));
        return goodsCommentService.sendReplyChild(goodsComment);
    }

    @RequestMapping("queryAllReplyChild.action")
    public List<GoodsComment> queryAllReplyChild(int gcid) {
        return goodsCommentService.queryAllReplyChild(gcid);
    }
}
