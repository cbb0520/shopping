package com.huguigu.vo;

public class User {
    private Integer uid;
    private String uaccount;
    private String upassword;
    private String uimg;
    private String uname;
    private String phone;
    private Integer mid;
    private String address;
    private Integer udele;

    public User() {
    }

    public User(Integer uid, String uaccount, String upassword, String uimg, String uname, String phone, Integer mid, String address, Integer udele) {
        this.uid = uid;
        this.uaccount = uaccount;
        this.upassword = upassword;
        this.uimg = uimg;
        this.uname = uname;
        this.phone = phone;
        this.mid = mid;
        this.address = address;
        this.udele = udele;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUdele() {
        return udele;
    }

    public void setUdele(Integer udele) {
        this.udele = udele;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uaccount='" + uaccount + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uimg='" + uimg + '\'' +
                ", uname='" + uname + '\'' +
                ", phone='" + phone + '\'' +
                ", mid=" + mid +
                ", address='" + address + '\'' +
                ", udele=" + udele +
                '}';
    }
}
