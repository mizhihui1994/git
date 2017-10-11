package com.neusoft.dao;
import java.util.List;

import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;


public interface ProductDao {

	/**
	 * 添加商品
	 */
	public boolean insert(Product pro);
	
	/**
	 * 根据id查询商品信息
	 */
	public Product getproductById(Integer i);
	
	/**
	 * 获取所有商品信息
	 */
	public List<Product> getproductList();
	
	/**
	 * 根据商品名称获取商品信息
	 */
	public List<Product> getproductByName(String name);
	
	/**
	 * 修改商品信息
	 * */
	public boolean updateproduct(Product dept);
	
	/**
	 * 根据商品id删除商品信息
	 */
	public boolean deleteById(Integer id);
	/**
	  * 分页获取数据
	  * @param pageNo:页数  
	  * 	   pageSize:每页显示数据
	  * @return PageModel
	  */
	 public PageModel<Product> getPageModel(int pageNo,int pagesize) throws DaoException;
}
