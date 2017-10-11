package com.neusoft.entity;

import java.io.Serializable;

public class Cate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 732154264315308187L;
	private int cid;
	private String cname;
	private String pid;
	public Cate() {
		super();
	}
	
	public Cate(String cname, String pid) {
		super();
		this.cname = cname;
		this.pid = pid;
	}

	public Cate(int cid, String cname, String pid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.pid = pid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Cate [cid=" + cid + ", cname=" + cname + ", pid=" + pid + "]";
	}
	
}
