package com.huguigu.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 商品表
 */
@JsonIgnoreProperties("handler")
public class Goods {
    private Integer gid;
    private Classify classify;
    private String code;
    private String gname;
    private String gimgs;
    private Integer limit;
    private Integer soid;
    private Float gprice;
    private Integer udele;

    private Integer count = 1;//默认值：商品选择默认为1。设置值：购物车的商品数量或仓库的商品数量
    private String wid = "0";//默认值：设置该商品的仓库储存地
    private Boolean select;//默认购物车不选中

    public Goods() {
    }
    
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGimgs() {
        return gimgs;
    }

    public void setGimgs(String gimgs) {
        this.gimgs = gimgs;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getSoid() {
        return soid;
    }

    public void setSoid(Integer soid) {
        this.soid = soid;
    }

    public Float getGprice() {
        return gprice;
    }

    public void setGprice(Float gprice) {
        this.gprice = gprice;
    }

    public Integer getUdele() {
        return udele;
    }

    public void setUdele(Integer udele) {
        this.udele = udele;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public Boolean getSelect() {
        return select;
    }

    public void setSelect(Boolean select) {
        this.select = select;
    }

    public Goods(Integer gid, Classify classify, String code, String gname, String gimgs, Integer limit, Integer soid, Float gprice, Integer udele, Integer count, String wid, Boolean select) {
        this.gid = gid;
        this.classify = classify;
        this.code = code;
        this.gname = gname;
        this.gimgs = gimgs;
        this.limit = limit;
        this.soid = soid;
        this.gprice = gprice;
        this.udele = udele;
        this.count = count;
        this.wid = wid;
        this.select = select;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", classify=" + classify +
                ", code='" + code + '\'' +
                ", gname='" + gname + '\'' +
                ", gimgs='" + gimgs + '\'' +
                ", limit=" + limit +
                ", soid=" + soid +
                ", gprice=" + gprice +
                ", udele=" + udele +
                ", count=" + count +
                ", wid=" + wid +
                ", select=" + select +
                '}';
    }
}
