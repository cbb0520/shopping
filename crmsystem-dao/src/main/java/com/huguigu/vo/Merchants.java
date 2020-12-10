package com.huguigu.vo;

public class Merchants {
    private int mid;
    private int uid;
    private String sname;
    private String mddress;
    private String mname;
    private String phone;
    private String certificate;
    private String mimgs;
    private String mtype;
    private String state;
    private int udele;
    public Merchants(){}

    public Merchants(int mid, int uid, String sname, String mddress, String mname, String phone, String certificate, String mimgs, String mtype, String state, int udele) {
        this.mid = mid;
        this.uid = uid;
        this.sname = sname;
        this.mddress = mddress;
        this.mname = mname;
        this.phone = phone;
        this.certificate = certificate;
        this.mimgs = mimgs;
        this.mtype = mtype;
        this.state = state;
        this.udele = udele;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getMddress() {
        return mddress;
    }

    public void setMddress(String mddress) {
        this.mddress = mddress;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getMimgs() {
        return mimgs;
    }

    public void setMimgs(String mimgs) {
        this.mimgs = mimgs;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getUdele() {
        return udele;
    }

    public void setUdele(int udele) {
        this.udele = udele;
    }

    @Override
    public String toString() {
        return "Merchants{" +
                "mid=" + mid +
                ", uid=" + uid +
                ", sname='" + sname + '\'' +
                ", mddress='" + mddress + '\'' +
                ", mname='" + mname + '\'' +
                ", phone='" + phone + '\'' +
                ", certificate='" + certificate + '\'' +
                ", mimgs='" + mimgs + '\'' +
                ", mtype='" + mtype + '\'' +
                ", state='" + state + '\'' +
                ", udele=" + udele +
                '}';
    }
}
