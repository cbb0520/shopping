package com.huguigu.vo;
//饼装图
public class Ber {
    private float value;
    private String name;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ber(float value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ber{" +
                "value='" + value + '\'' +
                ", name=" + name +
                '}';
    }

    public Ber() {
        super();
    }
}
