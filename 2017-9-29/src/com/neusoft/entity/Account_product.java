package com.neusoft.entity;

public class Account_product {
	private int id;
	private String loginname;
	private String password;
	private long registertime;
	private long lastlogintime;
	private int ip;
	public Account_product(int id, String loginname, String password, long registertime, long lastlogintime,
			int ip) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.registertime = registertime;
		this.lastlogintime = lastlogintime;
		this.ip = ip;
	}
	public Account_product() {
		super();
	}
	public Account_product(String loginname, String password, long registertime, long lastlogintime, int ip) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.registertime = registertime;
		this.lastlogintime = lastlogintime;
		this.ip = ip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getRegistertime() {
		return registertime;
	}
	public void setRegistertime(long registertime) {
		this.registertime = registertime;
	}
	public long getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(long lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "Account_product [id=" + id + ", loginname=" + loginname + ", password=" + password + ", registertime="
				+ registertime + ", lastlogintime=" + lastlogintime + ", ip=" + ip + "]";
	}
	
}
