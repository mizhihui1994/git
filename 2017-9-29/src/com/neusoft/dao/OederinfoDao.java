package com.neusoft.dao;


import java.util.List;

import com.neusoft.entity.Orderinfo;
import com.neusoft.entity.PageModel;

public interface OederinfoDao {
	//查询全部订单 
	public PageModel<Orderinfo> getPageModel(int pageNo,int pagesize) throws DaoException;
	//查询orderstatus  =1：未付款
	public List<Orderinfo> getweifukuan() ;
	//查询orderstatus  =2：已付款
	public List<Orderinfo> getyifukuan() throws DaoException;
	//查询orderstatus  =3：已发货
	public List<Orderinfo> getyifahuo() throws DaoException;
	//查询orderstatus  =4：已完成
	public List<Orderinfo> getyiwancheng() throws DaoException;
	//通过ID查询指定订单
	public Orderinfo getByid(int id);
	//插入数据
	public boolean addorder(Orderinfo order);
	}
