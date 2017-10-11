package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;

public interface AddressDao {
		//��ӵ�ַ
		public boolean addaddress(Address address) throws DaoException;
		//ɾ����ַ
		public boolean deleteaddress(int id) throws DaoException;
		//�޸ĵ�ַ
		public boolean upaddress(Address address) throws DaoException;
		//��ѯ��ַ
		public Address readaddress(int id) throws DaoException;
		//��ѯȫ����ַ
		public List<Address> getaddressList();
		//��ҳ
		public PageModel<Address> getPageModel(int pageNo,int pagesize) throws DaoException;
}
