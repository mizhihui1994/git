package com.neusoft.entity;

public class Spec {
	private int id ;
	private int pid;
	private String size;
	public Spec() {
		super();
	}
	

	public Spec(int pid, String size) {
		super();
		this.pid = pid;
		this.size = size;
	}

	public Spec(int id, int pid, String size) {
		super();
		this.id = id;
		this.pid = pid;
		this.size = size;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Spec [id=" + id + ", pid=" + pid + ", size=" + size + "]";
	}
	
}
