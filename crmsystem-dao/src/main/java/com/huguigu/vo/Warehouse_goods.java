package com.huguigu.vo;
public class Warehouse_goods {
    private int wgid;
    private int wid;
    private int gid;
    private int count;
    private Warehouse warehouse;
    private Goods goods;
    public Warehouse_goods(){}

    public Warehouse_goods(int wgid, int wid, int gid, int count, Warehouse warehouse, Goods goods) {
        this.wgid = wgid;
        this.wid = wid;
        this.gid = gid;
        this.count = count;
        this.warehouse = warehouse;
        this.goods = goods;
    }

    public int getWgid() {
        return wgid;
    }

    public void setWgid(int wgid) {
        this.wgid = wgid;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Warehouse_goods{" +
                "wgid=" + wgid +
                ", wid=" + wid +
                ", gid=" + gid +
                ", count=" + count +
                ", warehouse=" + warehouse +
                ", goods=" + goods +
                '}';
    }
}
