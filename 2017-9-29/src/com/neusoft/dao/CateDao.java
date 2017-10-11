package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Cate;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;

public interface CateDao {
	//添加商品
	public boolean addCate(Cate cate) throws DaoException;
	//删除商品
	public boolean deleteCate(int id) throws DaoException;
	//修改商品
	public boolean upCate(Cate cate) throws DaoException;
	//查询商品
	public Cate readCate(int cid) throws DaoException;
	//查询全部商品
	public List<Cate> getcateList();
	//分页
	public PageModel<Cate> getPageModel(int pageNo,int pagesize) throws DaoException;
}
