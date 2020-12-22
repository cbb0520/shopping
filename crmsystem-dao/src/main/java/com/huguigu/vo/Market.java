package com.huguigu.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("handler")
public class Market {

    private int gid;
    private int dcount;
    private Goods goods;


    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getDcount() {
        return dcount;
    }

    public void setDcount(int dcount) {
        this.dcount = dcount;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Market(int gid, int dcount, Goods goods) {
        this.gid = gid;
        this.dcount = dcount;
        this.goods = goods;
    }

    public Market() {
        super();
    }

    @Override
    public String toString() {
        return "Market{" +
                "gid=" + gid +
                ", dcount=" + dcount +
                ", goods=" + goods +
                '}';
    }
}
