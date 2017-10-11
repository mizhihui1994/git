package com.neusoft.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.OederinfoDao;
import com.neusoft.dao.impl.OrderinfoDaoImpl;
import com.neusoft.entity.Consumer;
import com.neusoft.entity.Orderinfo;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.Daofactory;

public class Orderinfoservices  {
	public PageModel<Orderinfo> getPageModel(int pageNo,int pageSize) throws DaoException{
		OederinfoDao pd =  Daofactory.getInstance("OederinfoDao",OrderinfoDaoImpl.class);
		return pd.getPageModel(pageNo, pageSize);
	}
	public void getOrderinfoLogin(HttpServletRequest request,HttpServletResponse response) throws DaoException,IOException,ServletException{
		
		String pageNo=request.getParameter("pageNo");
		String pageSize=request.getParameter("pageSize");
//		int _pageNo=Integer.parseInt(pageNo);
//		int _pageSize=Integer.parseInt(pageSize);
		int _pageNo=1;
		int _pageSize=5; 

		PageModel<Orderinfo> orderinfo=getPageModel(_pageNo, _pageSize);
		System.out.println(orderinfo);
		if(orderinfo!=null){
			int totalPageSize=(orderinfo.getTotalcount()%_pageSize==0 ? orderinfo.getTotalcount()/_pageSize : orderinfo.getTotalcount()/_pageSize+1);
			orderinfo.setTotalPageSize(totalPageSize);
			orderinfo.setPageNo(_pageNo);
		}
		request.setAttribute("orderinfos", orderinfo);
		try {
			request.getRequestDispatcher("readoreder.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	
	}
/**
 * œ‘ æreqType=2
 * @throws IOException 
 * @throws ServletException 
 */
public void disReqType2(ServletRequest request,ServletResponse response) throws ServletException, IOException{
	int _pageNo=1;
	int _pageSize=5;
	PageModel<Orderinfo> orderinfo=getPageModel(_pageNo, _pageSize);
	System.out.println(orderinfo+"=========================");
	if(orderinfo!=null){
		int totalPageSize=(orderinfo.getTotalcount()%_pageSize==0 ? orderinfo.getTotalcount()/_pageSize : orderinfo.getTotalcount()/_pageSize+1);
		orderinfo.setTotalPageSize(totalPageSize);
		orderinfo.setPageNo(_pageNo);
	}
	request.setAttribute("orderinfos", orderinfo);
	try {
		request.getRequestDispatcher("readconsumer.jsp").forward(request, response);
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
}

}
