package cn.sxt.shop.entity;

public class Foodtype {
    private Integer ftid;

    private String ftname;

    public Integer getFtid() {
        return ftid;
    }

    public void setFtid(Integer ftid) {
        this.ftid = ftid;
    }

    public String getFtname() {
        return ftname;
    }

    public void setFtname(String ftname) {
        this.ftname = ftname == null ? null : ftname.trim();
    }
}