package com.huguigu.vo;

/**
 * 商品表
 */
public class Goods {
    private Integer gid;
    private Classify classify;
    private String code;
    private String gname;
    private String gimgs;
    private Integer limit;
    private Integer soid;
    private Float price;
    private Integer udele;

    public Goods() {
    }

    public Goods(Integer gid, Classify classify, String code, String gname, String gimgs, Integer limit, Integer soid, Float price, Integer udele) {
        this.gid = gid;
        this.classify = classify;
        this.code = code;
        this.gname = gname;
        this.gimgs = gimgs;
        this.limit = limit;
        this.soid = soid;
        this.price = price;
        this.udele = udele;
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
                ", price=" + price +
                ", udele=" + udele +
                '}';
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getUdele() {
        return udele;
    }

    public void setUdele(Integer udele) {
        this.udele = udele;
    }
}