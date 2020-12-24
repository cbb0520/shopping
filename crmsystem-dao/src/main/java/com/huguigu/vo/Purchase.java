package com.huguigu.vo;

public class Purchase {
    private int pid;
    private int fid;
    private String pimgs;
    private String pname;
    private int  liang;
    private float price;
    private Classify classify;
    private String udele;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getPimgs() {
        return pimgs;
    }

    public void setPimgs(String pimgs) {
        this.pimgs = pimgs;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getLiang() {
        return liang;
    }

    public void setLiang(int liang) {
        this.liang = liang;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Classify getClassify() {
        return classify;
    }

    public void setClassify(Classify classify) {
        this.classify = classify;
    }

    public String getUdele() {
        return udele;
    }

    public void setUdele(String udele) {
        this.udele = udele;
    }

    public Purchase(int pid, int fid, String pimgs, String pname, int liang, float price, Classify classify, String udele) {
        this.pid = pid;
        this.fid = fid;
        this.pimgs = pimgs;
        this.pname = pname;
        this.liang = liang;
        this.price = price;
        this.classify = classify;
        this.udele = udele;
    }

    public Purchase() {
        super();
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "pid=" + pid +
                ", fid=" + fid +
                ", pimgs='" + pimgs + '\'' +
                ", pname='" + pname + '\'' +
                ", liang=" + liang +
                ", price=" + price +
                ", classify=" + classify +
                ", udele=" + udele +
                '}';
    }
}
