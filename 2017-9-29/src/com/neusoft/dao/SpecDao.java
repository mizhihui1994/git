package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.PageModel;
import com.neusoft.entity.Spec;

public interface SpecDao {
		//添加商品
		public boolean addSpec(Spec spec) throws DaoException;
		//删除商品
		public boolean deleteSpec(int id) throws DaoException;
		//修改商品
		public boolean upSpec(Spec spec) throws DaoException;
		//查询商品byid
		public Spec readSpec(int id) throws DaoException;
		//查询全部商品
		public List<Spec> getcateList();
		//分页
		public PageModel<Spec> getPageModel(int pageNo,int pagesize) throws DaoException;
	
}
