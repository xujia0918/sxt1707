package cn.sxt.shop.entity;

public class Food {
    private Integer fid;

    private String fname;

    private Integer ftid;

    private Double fprice;

    private Double fmprice;

    private String fremark;

    private String fimg;

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
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getFtid() {
        return ftid;
    }

    public void setFtid(Integer ftid) {
        this.ftid = ftid;
    }

    public Double getFprice() {
        return fprice;
    }

    public void setFprice(Double fprice) {
        this.fprice = fprice;
    }

    public Double getFmprice() {
        return fmprice;
    }

    public void setFmprice(Double fmprice) {
        this.fmprice = fmprice;
    }

    public String getFremark() {
        return fremark;
    }

    public void setFremark(String fremark) {
        this.fremark = fremark == null ? null : fremark.trim();
    }

    public String getFimg() {
        return fimg;
    }

    public void setFimg(String fimg) {
        this.fimg = fimg == null ? null : fimg.trim();
    }
}