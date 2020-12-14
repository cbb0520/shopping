package com.huguigu.vo;

public class Emp_role {
    private int  erid;
    private int  eid;

    public int getErid() {
        return erid;
    }

    public void setErid(int erid) {
        this.erid = erid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    private int  rid;


    public Emp_role(int erid, int eid, int rid) {
        this.erid = erid;
        this.eid = eid;
        this.rid = rid;
    }

    public Emp_role() {
        super();
    }

    @Override
    public String toString() {
        return "Emp_role{" +
                "erid=" + erid +
                ", eid=" + eid +
                ", rid=" + rid +
                '}';
    }
}
