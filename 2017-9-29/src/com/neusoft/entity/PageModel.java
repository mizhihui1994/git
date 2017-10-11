package com.neusoft.entity;

import java.util.List;

/**
 * ��ҳʵ����
 *
 * @param <T>
 */
public class PageModel<T> {
	private Integer totalcount;//�ܵļ�¼��
	private List<T> datas;//��ǰ����
	private int totalPageSize;//�ܹ�ҳ��
	private int pageNo;//��ǰ�ڼ�ҳ
	
	public PageModel() {
		super();
	}
	public PageModel(Integer totalcount, List<T> datas) {
		super();
		this.totalcount = totalcount;
		this.datas = datas;
	}
	public Integer getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public int getTotalPageSize() {
		return totalPageSize;
	}
	public void setTotalPageSize(int totalPageSize) {
		this.totalPageSize = totalPageSize;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	@Override
	public String toString() {
		return "PageModel [totalcount=" + totalcount + ", datas=" + datas + "]";
	}

}
