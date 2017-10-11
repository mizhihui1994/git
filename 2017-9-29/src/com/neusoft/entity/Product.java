package com.neusoft.entity;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = -7457292321615262156L;
	private int id;
	private String pname;//��Ʒ����
	private int cid;//�������Cate��id==���
	private String pno;//����
	private String pic;//��ƷͼƬ
	private double price;//��Ʒ�۸�
	private String point;//�����
	private String tuijian;//�Ƿ��Ƽ�
	private int online;//�Ƿ�����
	private int tejia;//�Ƿ��ؼ�
	private String pdetaul;//��Ʒ����
	
	public Product() {
		super();
		
	}
	public Product(String pname) {
		super();
		this.pname = pname;
	}

	public Product(int id, String pname, int cid, String pno, String pic, double price, String point, String tuijian,
			int online, int tejia, String pdetaul) {
		super();
		this.id = id;
		this.pname = pname;
		this.cid = cid;
		this.pno = pno;
		this.pic = pic;
		this.price = price;
		this.point = point;
		this.tuijian = tuijian;
		this.online = online;
		this.tejia = tejia;
		this.pdetaul = pdetaul;
	}
	public Product(String pname, int cid, String pno, String pic, double price, String point, String tuijian,int online, int tejia, String pdetaul) {
		super();
		this.pname = pname;
		this.cid = cid;
		this.pno = pno;
		this.pic = pic;
		this.price = price;
		this.point = point;
		this.tuijian = tuijian;
		this.online = online;
		this.tejia = tejia;
		this.pdetaul = pdetaul;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getTuijian() {
		return tuijian;
	}

	public void setTuijian(String tuijian) {
		this.tuijian = tuijian;
	}

	public int getOnline() {
		return online;
	}

	public void setOnline(int online) {
		this.online = online;
	}

	public int getTejia() {
		return tejia;
	}

	public void setTejia(int tejia) {
		this.tejia = tejia;
	}

	public String getPdetaul() {
		return pdetaul;
	}

	public void setPdetaul(String pdetaul) {
		this.pdetaul = pdetaul;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", cid=" + cid + ", pno=" + pno + ", pic=" + pic + ", price="
				+ price + ", online=" + online + ", pdetaul=" + pdetaul + "]";
	}
	
	
}
