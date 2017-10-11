package com.neusoft.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.ProductDao;
import com.neusoft.dao.impl.ProductDaoImpl;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;
import com.neusoft.utils.Daofactory;

public class ProductService {
	//���
	public boolean addprovate(Product pro) {
		ProductDao pd = Daofactory.getInstance("Product", ProductDaoImpl.class);
		boolean b =pd.insert(pro);
		if(b) {
			return true;
		}
		return false;
		
	}
	//ɾ��
	public boolean delete(int id ){
		ProductDao pdd = Daofactory.getInstance("Product", ProductDaoImpl.class);
		boolean  bb = pdd.deleteById(id);	
		if(bb){
			return true;
		}
		return false;
		
	}
	//�޸�
	public boolean updataproduct(Product product){
		ProductDao pdu = Daofactory.getInstance("Product", ProductDaoImpl.class);
		boolean bu = pdu.updateproduct(product);
		if(bu){
			return true;
		}
		return false;
	}
	//��ѯȫ��
	public List<Product> getallproduct(){
		ProductDao pdu = Daofactory.getInstance("Product", ProductDaoImpl.class);
		List<Product> listproduct = pdu.getproductList();
		return listproduct;
		
	}
	//ͨ��ID��ѯȫ����Ϣ
	public Product readbyid(Integer id){
		ProductDao pdu = Daofactory.getInstance("Product", ProductDaoImpl.class);
		return pdu.getproductById(id);
	}
	//��ѯ��Ʒ
	public PageModel<Product> getProductByPage(int pageNo,int pageSize){
		ProductDao pdu = Daofactory.getInstance("Product", ProductDaoImpl.class);
		return pdu.getPageModel(pageNo, pageSize);
	}
		//��ѯҵ���߼�
public void getProductLogin(HttpServletRequest request,HttpServletResponse response) throws DaoException,IOException,ServletException{
			
			String pageNo=request.getParameter("pageNo");
			String pageSize=request.getParameter("pageSize");
//			int _pageNo=Integer.parseInt(pageNo);
//			int _pageSize=Integer.parseInt(pageSize);
			int _pageNo=1;
			int _pageSize=5; 

			PageModel<Product> products=getProductByPage(_pageNo, _pageSize);
			if(products!=null){
				int totalPageSize=(products.getTotalcount()%_pageSize==0 ? products.getTotalcount()/_pageSize : products.getTotalcount()/_pageSize+1);
				products.setTotalPageSize(totalPageSize);
				products.setPageNo(_pageNo);
			}
			request.setAttribute("products", products);
			try {
				request.getRequestDispatcher("shangpinguanli.jsp").forward(request, response);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		
		}
	/**
	 * ��ʾreqType=2
	 * @throws IOException 
	 * @throws ServletException 
	 */
//	public void disReqType2(ServletRequest request,ServletResponse response) throws ServletException, IOException{
//		int _pageNo=1;
//		int _pageSize=5;
//		PageModel<Product> products=getProductByPage(_pageNo, _pageSize);
//		if(products!=null){
//			int totalPageSize=(products.getTotalcount()%_pageSize==0 ? products.getTotalcount()/_pageSize : products.getTotalcount()/_pageSize+1);
//			products.setTotalPageSize(totalPageSize);
//			products.setPageNo(_pageNo);
//		}
//		request.setAttribute("products", products);
//		try {
//			request.getRequestDispatcher("shangpinguanli.jsp").forward(request, response);
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
//	}
}
