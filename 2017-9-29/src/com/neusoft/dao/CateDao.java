package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Cate;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;

public interface CateDao {
	//�����Ʒ
	public boolean addCate(Cate cate) throws DaoException;
	//ɾ����Ʒ
	public boolean deleteCate(int id) throws DaoException;
	//�޸���Ʒ
	public boolean upCate(Cate cate) throws DaoException;
	//��ѯ��Ʒ
	public Cate readCate(int cid) throws DaoException;
	//��ѯȫ����Ʒ
	public List<Cate> getcateList();
	//��ҳ
	public PageModel<Cate> getPageModel(int pageNo,int pagesize) throws DaoException;
}
