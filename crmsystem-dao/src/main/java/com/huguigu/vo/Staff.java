package com.huguigu.vo;

import java.util.Date;

public class Staff {
    private int eid;
    private String account;
    private String password;
    private String name;
    private String sex;
    private String phone;
    private Date etiem;
    private String address;
    private int udele;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getEtiem() {
        return etiem;
    }

    public void setEtiem(Date etiem) {
        this.etiem = etiem;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUdele() {
        return udele;
    }

    public void setUdele(int udele) {
        this.udele = udele;
    }

    public Staff(int eid, String account, String password, String name, String sex, String phone, Date etiem, String address, int udele) {
        this.eid = eid;
        this.account = account;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.etiem = etiem;
        this.address = address;
        this.udele = udele;
    }

    public Staff() {
        super();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "eid=" + eid +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", etiem=" + etiem +
                ", address='" + address + '\'' +
                ", udele=" + udele +
                '}';
    }
}
