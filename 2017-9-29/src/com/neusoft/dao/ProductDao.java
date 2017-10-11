package com.neusoft.dao;
import java.util.List;

import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;


public interface ProductDao {

	/**
	 * �����Ʒ
	 */
	public boolean insert(Product pro);
	
	/**
	 * ����id��ѯ��Ʒ��Ϣ
	 */
	public Product getproductById(Integer i);
	
	/**
	 * ��ȡ������Ʒ��Ϣ
	 */
	public List<Product> getproductList();
	
	/**
	 * ������Ʒ���ƻ�ȡ��Ʒ��Ϣ
	 */
	public List<Product> getproductByName(String name);
	
	/**
	 * �޸���Ʒ��Ϣ
	 * */
	public boolean updateproduct(Product dept);
	
	/**
	 * ������Ʒidɾ����Ʒ��Ϣ
	 */
	public boolean deleteById(Integer id);
	/**
	  * ��ҳ��ȡ����
	  * @param pageNo:ҳ��  
	  * 	   pageSize:ÿҳ��ʾ����
	  * @return PageModel
	  */
	 public PageModel<Product> getPageModel(int pageNo,int pagesize) throws DaoException;
}
