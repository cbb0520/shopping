package com.huguigu.vo;

public class City {
    private int id;
    private String code;
    private String name;
    private String provincecode;
    public City(){}

    public City(int id, String code, String name, String provincecode) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.provincecode = provincecode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", provincecode='" + provincecode + '\'' +
                '}';
    }
}
