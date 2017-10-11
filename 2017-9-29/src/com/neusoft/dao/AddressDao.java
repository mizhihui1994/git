package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;

public interface AddressDao {
		//添加地址
		public boolean addaddress(Address address) throws DaoException;
		//删除地址
		public boolean deleteaddress(int id) throws DaoException;
		//修改地址
		public boolean upaddress(Address address) throws DaoException;
		//查询地址
		public Address readaddress(int id) throws DaoException;
		//查询全部地址
		public List<Address> getaddressList();
		//分页
		public PageModel<Address> getPageModel(int pageNo,int pagesize) throws DaoException;
}
