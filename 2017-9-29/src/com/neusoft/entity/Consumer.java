package com.neusoft.entity;
public class Consumer {
	private Integer id;
	private String loginname;//����û���
	private String password;//����
	private long registertime;//ע��ʱ��
	private long lastlogintime;//����¼ʱ��
	private String ip;//ip��ַ
	
	private String nickname;//�û��ǳ�
	private Double money;//�������
	private long lasttime;//�������ʱ��
	public Consumer() {
		super();
	}
	public Consumer(Integer id, String loginname, String password, long registertime, long lastlogintime,
		String ip, String nickname, Double money, long lasttime) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.registertime = registertime;
		this.lastlogintime = lastlogintime;
		this.ip = ip;
		this.nickname = nickname;
		this.money = money;
		this.lasttime = lasttime;
	}
	public Consumer(String loginname, String password, long registertime, long lastlogintime, String ip,
			String nickname, Double money, long lasttime) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.registertime = registertime;
		this.lastlogintime = lastlogintime;
		this.ip = ip;
		this.nickname = nickname;
		this.money = money;
		this.lasttime = lasttime;
	}
	
	public Consumer(String loginname, String password, long registertime, long lastlogintime, String ip) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.registertime = registertime;
		this.lastlogintime = lastlogintime;
		this.ip = ip;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public long getLasttime() {
		return lasttime;
	}
	public void setLasttime(long lasttime) {
		this.lasttime = lasttime;
	}
	@Override
	public String toString() {
		return "Consumer [id=" + id + ", loginname=" + loginname + ", password=" + password + ", registertime="
		+ registertime + ", lastlogintime=" + lastlogintime + ", ip=" + ip + ", nickname=" + nickname
		+ ", money=" + money + ", lasttime=" + lasttime + "]";
	}
	
	
	
}
