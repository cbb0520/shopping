package com.huguigu.vo;

public class Deliver {
    private int did;
    private int uid;
    private int mid;
    private double price;
    private int state;
    private int udele;
    private User user;
    private Merchants merchants;
    public Deliver(){}

    public Deliver(int did, int uid, int mid, double price, int state, int udele, User user, Merchants merchants) {
        this.did = did;
        this.uid = uid;
        this.mid = mid;
        this.price = price;
        this.state = state;
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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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
                ", state=" + state +
                ", udele=" + udele +
                ", user=" + user +
                ", merchants=" + merchants +
                '}';
    }
}
