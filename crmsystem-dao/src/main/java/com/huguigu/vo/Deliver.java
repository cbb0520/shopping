package com.huguigu.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

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
    private User user;
    private Merchants merchants;
    public Deliver(){}

    public Deliver(int did, int uid, int mid, double price, int ustate, Date buytime, int mstate, int hstate, int udele, User user, Merchants merchants) {
        this.did = did;
        this.uid = uid;
        this.mid = mid;
        this.price = price;
        this.ustate = ustate;
        this.buytime = buytime;
        this.mstate = mstate;
        this.hstate = hstate;
        this.udele = udele;
        this.user = user;
        this.merchants = merchants;
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
                ", user=" + user +
                ", merchants=" + merchants +
                '}';
    }
}
