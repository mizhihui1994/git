package com.neusoft.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.neusoft.dao.ConsumerDao;
import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.ConsumerDaoImpl;
import com.neusoft.entity.Consumer;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.Daofactory;

public class Consumerservice {
		//查询全部会员
	ConsumerDao cd = Daofactory.getInstance("consumerDao", ConsumerDaoImpl.class);
		public List<Consumer> getConsumerList(){
			 return cd.getConsumerList();
		}
		//添加商品
		public boolean addConsumer(Consumer consumer) throws DaoException{
			if(cd.addConsumer(consumer)){
				return true;
			}
			return false;
		}
		//删除商品
		public boolean deleteConsumer(Integer id) throws DaoException{
			if(cd.deleteConsumer(id)){
				return true;
			}
			return false;
		}
		//修改商品
		public boolean updateConsumer(Consumer consumer) throws DaoException{
			if(cd.updateConsumer(consumer)){
				return true;
			}
			return false;
		}
		//查询商品
		public Consumer getConsumer(Integer id) throws DaoException{
			return cd.getConsumer(id);
		}
		//分页
		public PageModel<Consumer> getPageModel(int pageNo,int pageSize) throws DaoException{
		return cd.getPageModel(pageNo, pageSize);
		}
		public void getConsumerLogin(HttpServletRequest request,HttpServletResponse response) throws DaoException,IOException,ServletException{
			
			String pageNo=request.getParameter("pageNo");
			String pageSize=request.getParameter("pageSize");
//			int _pageNo=Integer.parseInt(pageNo);
//			int _pageSize=Integer.parseInt(pageSize);
			int _pageNo=1;
			int _pageSize=5; 

			PageModel<Consumer> consumer=getPageModel(_pageNo, _pageSize);
			System.out.println(consumer);
			if(consumer!=null){
				int totalPageSize=(consumer.getTotalcount()%_pageSize==0 ? consumer.getTotalcount()/_pageSize : consumer.getTotalcount()/_pageSize+1);
				consumer.setTotalPageSize(totalPageSize);
				consumer.setPageNo(_pageNo);
			}
			request.setAttribute("consumers", consumer);
			try {
				request.getRequestDispatcher("readconsumer.jsp").forward(request, response);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		
		}
	/**
	 * 显示reqType=2
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public void disReqType2(ServletRequest request,ServletResponse response) throws ServletException, IOException{
		int _pageNo=1;
		int _pageSize=5;
		PageModel<Consumer> consumer=getPageModel(_pageNo, _pageSize);
		System.out.println(consumer+"=========================");
		if(consumer!=null){
			int totalPageSize=(consumer.getTotalcount()%_pageSize==0 ? consumer.getTotalcount()/_pageSize : consumer.getTotalcount()/_pageSize+1);
			consumer.setTotalPageSize(totalPageSize);
			consumer.setPageNo(_pageNo);
		}
		request.setAttribute("consumers", consumer);
		try {
			request.getRequestDispatcher("readconsumer.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
