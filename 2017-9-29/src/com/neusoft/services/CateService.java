package com.neusoft.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.CateDao;
import com.neusoft.dao.DaoException;
import com.neusoft.dao.ProductDao;
import com.neusoft.dao.impl.CateDaoImpl;
import com.neusoft.dao.impl.ProductDaoImpl;
import com.neusoft.entity.Cate;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Product;
import com.neusoft.utils.Daofactory;

public class CateService  {
	public boolean addCate(Cate cate) {
		
		CateDao catedao = Daofactory.getInstance("CateDao",CateDaoImpl.class);
		boolean b = catedao.addCate(cate);
			if(b) {
			return true;
			}
		return false;
		
	}
	public boolean deleteCate(int id){
		CateDao catedao = Daofactory.getInstance("CateDao",CateDaoImpl.class);
		boolean a =catedao.deleteCate(id);
		if(a){
			return true;
		}
		return false;
	}
	public boolean upcata(Cate cate){
		CateDao catedao = Daofactory.getInstance("CateDao",CateDaoImpl.class);
		boolean b =catedao.upCate(cate);
		if(b){
			return true;
		}
		return false;
	}
	public List<Cate> readall(){
		CateDao catedao = Daofactory.getInstance("CateDao",CateDaoImpl.class);
		List<Cate> lc = catedao.getcateList();
		
		return lc;
		
	}
	public Cate readate(int cid) {
	CateDao catedao = Daofactory.getInstance("CateDao",CateDaoImpl.class);
	Cate cate = catedao.readCate(cid);
		return cate;
		
	}
	public PageModel<Cate> getCateByPage(int pageNo,int pageSize){
		CateDao catedao = Daofactory.getInstance("CateDao",CateDaoImpl.class);
		return catedao.getPageModel(pageNo, pageSize);
	}
		//查询业务逻辑
public void getCateLogin(HttpServletRequest request,HttpServletResponse response) throws DaoException,IOException,ServletException{
			
			String pageNo=request.getParameter("pageNo");
			String pageSize=request.getParameter("pageSize");
//			int _pageNo=Integer.parseInt(pageNo);
//			int _pageSize=Integer.parseInt(pageSize);
			int _pageNo=1;
			int _pageSize=5; 

			PageModel<Cate> cates=getCateByPage(_pageNo, _pageSize);
			if(cates!=null){
				int totalPageSize=(cates.getTotalcount()%_pageSize==0 ? cates.getTotalcount()/_pageSize : cates.getTotalcount()/_pageSize+1);
				cates.setTotalPageSize(totalPageSize);
				cates.setPageNo(_pageNo);
			}
			request.setAttribute("cates", cates);
			try {
				request.getRequestDispatcher("fenleiguanli.jsp").forward(request, response);
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
		int pageNo=1;
		int pageSize=5;
		PageModel<Cate> cates=getCateByPage(pageNo, pageSize);
		if(cates!=null){
			int totalPageSize=(cates.getTotalcount()%pageSize==0 ? cates.getTotalcount()/pageSize : cates.getTotalcount()/pageSize+1);
			cates.setTotalPageSize(totalPageSize);
			cates.setPageNo(pageNo);
		}
		request.setAttribute("cates", cates);
		try {
			request.getRequestDispatcher("fenleiguanli.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	
}
