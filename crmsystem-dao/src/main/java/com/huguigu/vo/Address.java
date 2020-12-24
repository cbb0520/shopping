package com.huguigu.vo;

public class Address {
    private Integer aid;
    private User user;
    private Merchants merchants;
    private String name;
    private String phone;

    public Address() {
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", user=" + user +
                ", merchants=" + merchants +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
