package com.huguigu.vo;

public class RoLe {
    private int rid;
    private String rname;
    private int  udele;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public int getUdele() {
        return udele;
    }

    public void setUdele(int udele) {
        this.udele = udele;
    }

    public RoLe(int rid, String rname, int udele) {
        this.rid = rid;
        this.rname = rname;
        this.udele = udele;
    }

    public RoLe() {
        super();
    }

    @Override
    public String toString() {
        return "RoLe{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", udele=" + udele +
                '}';
    }
}
