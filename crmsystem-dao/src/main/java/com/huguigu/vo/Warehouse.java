package com.huguigu.vo;

/**
 * 仓库表
 */
public class Warehouse {
    private Integer cid;
    private String cname;
    private Classify classify;
    private Integer liang;
    private Integer udele;

    public Warehouse() {
    }

    public Warehouse(Integer cid, String cname, Classify classify, Integer liang, Integer udele) {
        this.cid = cid;
        this.cname = cname;
        this.classify = classify;
        this.liang = liang;
        this.udele = udele;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", classify=" + classify +
                ", liang=" + liang +
                ", udele=" + udele +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
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

    public Integer getUdele() {
        return udele;
    }

    public void setUdele(Integer udele) {
        this.udele = udele;
    }
}
