package com.huguigu.vo;

public class Revnue {
    private String mothen;
    private float price;

    public String getMothen() {
        return mothen;
    }

    public void setMothen(String mothen) {
        this.mothen = mothen;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Revnue(String mothen, float price) {
        this.mothen = mothen;
        this.price = price;
    }

    public Revnue() {
        super();
    }

    @Override
    public String toString() {
        return "Revnue{" +
                "mothen='" + mothen + '\'' +
                ", price=" + price +
                '}';
    }
}
