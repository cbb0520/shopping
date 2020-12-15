package com.huguigu.vo;

public class Del_goods {
    private int  dgid;
    private int did;
    private int gid;
    private int dcount;
    private Goods goods;
    private Deliver deliver;
    private int state;

    public Del_goods(){}

    public Del_goods(int dgid, int did, int gid, int dcount, Goods goods, Deliver deliver) {
        this.dgid = dgid;
        this.did = did;
        this.gid = gid;
        this.dcount = dcount;
        this.goods = goods;
        this.deliver = deliver;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getDgid() {
        return dgid;
    }

    public void setDgid(int dgid) {
        this.dgid = dgid;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

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

    public Deliver getDeliver() {
        return deliver;
    }

    public void setDeliver(Deliver deliver) {
        this.deliver = deliver;
    }

    @Override
    public String toString() {
        return "Del_goods{" +
                "dgid=" + dgid +
                ", did=" + did +
                ", gid=" + gid +
                ", dcount=" + dcount +
                ", goods=" + goods +
                ", deliver=" + deliver +
                '}';
    }
}
