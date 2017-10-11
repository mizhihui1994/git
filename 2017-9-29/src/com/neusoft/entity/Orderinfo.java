package com.neusoft.entity;

public class Orderinfo {
	 
			   
	private int  id  ;      // ����id
	private String	 orderno ;   // �������
	private int orderstatus ;     //   ,-- ����״̬     1:δ���� 2:�Ѹ��� 3:�ѷ��� 4:�����
	private int  paystatus ;         // ,-- 1:����֧��  2����������
	private long	ordertime  ;   //  ,-- �µ�ʱ��
	private long		  paytime ;//     bigint    ,-- ����ʱ��
	private int  addrinfo ;       //  ,-- �ջ�����Ϣ��������cosumer_addr���е�id
	private String	  mask;       //  varchar(200) -- ��ע��Ϣ
	public Orderinfo() {
		super();
	}
	public Orderinfo(int id, String orderno, int orderstatus, int paystatus, long ordertime, long paytime, int addrinfo,
			String mask) {
		super();
		this.id = id;
		this.orderno = orderno;
		this.orderstatus = orderstatus;
		this.paystatus = paystatus;
		this.ordertime = ordertime;
		this.paytime = paytime;
		this.addrinfo = addrinfo;
		this.mask = mask;
	}
	public Orderinfo(String orderno, int orderstatus, int paystatus, long ordertime, long paytime, int addrinfo,
			String mask) {
		super();
		this.orderno = orderno;
		this.orderstatus = orderstatus;
		this.paystatus = paystatus;
		this.ordertime = ordertime;
		this.paytime = paytime;
		this.addrinfo = addrinfo;
		this.mask = mask;
	}
	@Override
	public String toString() {
		return "Orderinfo [id=" + id + ", orderno=" + orderno + ", orderstatus=" + orderstatus + ", paystatus="
				+ paystatus + ", ordertime=" + ordertime + ", paytime=" + paytime + ", addrinfo=" + addrinfo + ", mask="
				+ mask + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public int getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(int orderstatus) {
		this.orderstatus = orderstatus;
	}
	public int getPaystatus() {
		return paystatus;
	}
	public void setPaystatus(int paystatus) {
		this.paystatus = paystatus;
	}
	public long getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(long ordertime) {
		this.ordertime = ordertime;
	}
	public long getPaytime() {
		return paytime;
	}
	public void setPaytime(long paytime) {
		this.paytime = paytime;
	}
	public int getAddrinfo() {
		return addrinfo;
	}
	public void setAddrinfo(int addrinfo) {
		this.addrinfo = addrinfo;
	}
	public String getMask() {
		return mask;
	}
	public void setMask(String mask) {
		this.mask = mask;
	}
			
}
