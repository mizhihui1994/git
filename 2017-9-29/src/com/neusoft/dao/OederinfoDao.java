package com.neusoft.dao;


import java.util.List;

import com.neusoft.entity.Orderinfo;
import com.neusoft.entity.PageModel;

public interface OederinfoDao {
	//��ѯȫ������ 
	public PageModel<Orderinfo> getPageModel(int pageNo,int pagesize) throws DaoException;
	//��ѯorderstatus  =1��δ����
	public List<Orderinfo> getweifukuan() ;
	//��ѯorderstatus  =2���Ѹ���
	public List<Orderinfo> getyifukuan() throws DaoException;
	//��ѯorderstatus  =3���ѷ���
	public List<Orderinfo> getyifahuo() throws DaoException;
	//��ѯorderstatus  =4�������
	public List<Orderinfo> getyiwancheng() throws DaoException;
	//ͨ��ID��ѯָ������
	public Orderinfo getByid(int id);
	//��������
	public boolean addorder(Orderinfo order);
	}
