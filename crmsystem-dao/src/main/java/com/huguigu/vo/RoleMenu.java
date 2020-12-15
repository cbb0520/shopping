package com.huguigu.vo;

public class RoleMenu {
    private int mrid;
    private int rid;
    private int id;

    public int getMrid() {
        return mrid;
    }

    public void setMrid(int mrid) {
        this.mrid = mrid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoleMenu(int mrid, int rid, int id) {
        this.mrid = mrid;
        this.rid = rid;
        this.id = id;
    }

    public RoleMenu() {
        super();
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
                "mrid=" + mrid +
                ", rid=" + rid +
                ", id=" + id +
                '}';
    }
}
