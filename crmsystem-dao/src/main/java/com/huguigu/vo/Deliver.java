package com.huguigu.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Deliver {
    private int did;
    private int uid;
    private int mid;
    private double price;
    private int ustate;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone ="GMT+8")
    private Date buytime;
    private int mstate;
    private int hstate;
    private int udele;
    private double merchantrevenue;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone ="GMT+8")
    private Date fulfiltime;
    private String text;
    private User user;
    private Merchants merchants;
    private String mothen;
    private float total;
    private List<Del_goods> del_goods;
    private Goods goods;
    public Deliver(){}

    public Deliver(int did, int uid, int mid, double price, int ustate, Date buytime, int mstate, int hstate, int udele, double merchantrevenue, Date fulfiltime, String text, User user, Merchants merchants, String mothen, float total, List<Del_goods> del_goods, Goods goods) {
        this.did = did;
        this.uid = uid;
        this.mid = mid;
        this.price = price;
        this.ustate = ustate;
        this.buytime = buytime;
        this.mstate = mstate;
        this.hstate = hstate;
        this.udele = udele;
        this.merchantrevenue = merchantrevenue;
        this.fulfiltime = fulfiltime;
        this.text = text;
        this.user = user;
        this.merchants = merchants;
        this.mothen = mothen;
        this.total = total;
        this.del_goods = del_goods;
        this.goods = goods;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUstate() {
        return ustate;
    }

    public void setUstate(int ustate) {
        this.ustate = ustate;
    }

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public int getMstate() {
        return mstate;
    }

    public void setMstate(int mstate) {
        this.mstate = mstate;
    }

    public int getHstate() {
        return hstate;
    }

    public void setHstate(int hstate) {
        this.hstate = hstate;
    }

    public int getUdele() {
        return udele;
    }

    public void setUdele(int udele) {
        this.udele = udele;
    }

    public double getMerchantrevenue() {
        return merchantrevenue;
    }

    public void setMerchantrevenue(double merchantrevenue) {
        this.merchantrevenue = merchantrevenue;
    }

    public Date getFulfiltime() {
        return fulfiltime;
    }

    public void setFulfiltime(Date fulfiltime) {
        this.fulfiltime = fulfiltime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Merchants getMerchants() {
        return merchants;
    }

    public void setMerchants(Merchants merchants) {
        this.merchants = merchants;
    }

    public String getMothen() {
        return mothen;
    }

    public void setMothen(String mothen) {
        this.mothen = mothen;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<Del_goods> getDel_goods() {
        return del_goods;
    }

    public void setDel_goods(List<Del_goods> del_goods) {
        this.del_goods = del_goods;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Deliver{" +
                "did=" + did +
                ", uid=" + uid +
                ", mid=" + mid +
                ", price=" + price +
                ", ustate=" + ustate +
                ", buytime=" + buytime +
                ", mstate=" + mstate +
                ", hstate=" + hstate +
                ", udele=" + udele +
                ", merchantrevenue=" + merchantrevenue +
                ", fulfiltime=" + fulfiltime +
                ", text='" + text + '\'' +
                ", user=" + user +
                ", merchants=" + merchants +
                ", mothen='" + mothen + '\'' +
                ", total=" + total +
                ", del_goods=" + del_goods +
                ", goods=" + goods +
                '}';
    }
}
