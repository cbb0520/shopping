package com.huguigu.vo;

import java.util.List;

/**
 * 仓库表
 */
public class Warehouse {
    private Integer wid;
    private String wname;
    private Classify classify;
    private Integer liang;
    private List<Goods> goods;
    private Integer udele;

    public Warehouse() {
    }

    public Warehouse(Integer wid, String wname, Classify classify, Integer liang, List<Goods> goods, Integer udele) {
        this.wid = wid;
        this.wname = wname;
        this.classify = classify;
        this.liang = liang;
        this.goods = goods;
        this.udele = udele;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", classify=" + classify +
                ", liang=" + liang +
                ", goods=" + goods +
                ", udele=" + udele +
                '}';
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    public Integer getLiang() {
        return liang;
    }

    public void setLiang(Integer liang) {
        this.liang = liang;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    public Integer getUdele() {
        return udele;
    }

    public void setUdele(Integer udele) {
        this.udele = udele;
    }
}
