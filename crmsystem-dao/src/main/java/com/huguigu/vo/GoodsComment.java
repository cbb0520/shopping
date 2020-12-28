package com.huguigu.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class GoodsComment {
    private Integer id;
    private User user;
    private Integer gid;
    private Float score; //评分
    private String text; //评价
    //@JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date; //时间
    private Integer anonymity; //是否匿名0：是
    private Integer praise; //赞的数量
    private Integer count = 0;
    private Integer isPraise = 0; //判断用户是否点赞   1：点赞   0：未点赞

    public GoodsComment() {
    }

    public GoodsComment(Integer id, User user, Integer gid, Float score, String text, Date date, Integer anonymity, Integer praise, Integer isPraise) {
        this.id = id;
        this.user = user;
        this.gid = gid;
        this.score = score;
        this.text = text;
        this.date = date;
        this.anonymity = anonymity;
        this.praise = praise;
        this.isPraise = isPraise;
    }

    @Override
    public String toString() {
        return "GoodsComment{" +
                "id=" + id +
                ", user=" + user +
                ", gid=" + gid +
                ", score=" + score +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", anonymity=" + anonymity +
                ", praise=" + praise +
                ", count=" + count +
                ", isPraise=" + isPraise +
                '}';
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(Integer anonymity) {
        this.anonymity = anonymity;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Integer getIsPraise() {
        return isPraise;
    }

    public void setIsPraise(Integer isPraise) {
        this.isPraise = isPraise;
    }
}
