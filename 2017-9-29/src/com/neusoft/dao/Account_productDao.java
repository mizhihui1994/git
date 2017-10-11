package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Account_product;
import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;

public interface Account_productDao {
			//������һ�Ա
			public boolean addAccount(Account_product Account) throws DaoException;
			//ɾ�����һ�Ա
			public boolean deleteAccount(int id) throws DaoException;
			//�޸����һ�Ա
			public boolean upAccount(Account_product Account) throws DaoException;
			//��ѯ���һ�Ա
			public Account_product readAccount(int id) throws DaoException;
			//��ѯȫ�����һ�Ա
			public List<Account_product> getAccountList();
			//��ҳ
			public PageModel<Account_product> getPageModel(int pageNo,int pagesize) throws DaoException;
	}
