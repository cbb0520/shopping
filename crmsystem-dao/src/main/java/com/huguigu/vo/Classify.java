package com.huguigu.vo;

/**
 * 商品类别表
 */
public class Classify {
    private Integer fid;
    private String fname;
    private Integer udele;

    public Classify(Integer fid, String fname, Integer udele) {
        this.fid = fid;
        this.fname = fname;
        this.udele = udele;
    }

    public Classify() {
    }

    @Override
    public String toString() {
        return "Classify{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", udele=" + udele +
                '}';
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getUdele() {
        return udele;
    }

    public void setUdele(Integer udele) {
        this.udele = udele;
    }
}
