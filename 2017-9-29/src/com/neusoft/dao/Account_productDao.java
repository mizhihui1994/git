package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Account_product;
import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;

public interface Account_productDao {
			//添加卖家会员
			public boolean addAccount(Account_product Account) throws DaoException;
			//删除卖家会员
			public boolean deleteAccount(int id) throws DaoException;
			//修改卖家会员
			public boolean upAccount(Account_product Account) throws DaoException;
			//查询卖家会员
			public Account_product readAccount(int id) throws DaoException;
			//查询全部卖家会员
			public List<Account_product> getAccountList();
			//分页
			public PageModel<Account_product> getPageModel(int pageNo,int pagesize) throws DaoException;
	}
