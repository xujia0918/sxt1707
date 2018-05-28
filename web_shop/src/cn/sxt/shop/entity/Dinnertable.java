package cn.sxt.shop.entity;

import java.util.Date;
/**
 * 餐桌实体类
 * */
public class Dinnertable {
    private Integer tid;

    private String tname;

    private Integer tstatus;

    private Date orderdate;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTstatus() {
        return tstatus;
    }

    public void setTstatus(Integer tstatus) {
        this.tstatus = tstatus;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }
    
    

	public Dinnertable() {
		super();
	}

	public Dinnertable(String tname, Integer tstatus, Date orderdate) {
		super();
		this.tname = tname;
		this.tstatus = tstatus;
		this.orderdate = orderdate;
	}

	public Dinnertable(Integer tid, String tname, Integer tstatus,
			Date orderdate) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tstatus = tstatus;
		this.orderdate = orderdate;
	}
    
}