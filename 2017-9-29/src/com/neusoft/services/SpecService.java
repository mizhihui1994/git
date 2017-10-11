package com.neusoft.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.DaoException;
import com.neusoft.dao.SpecDao;
import com.neusoft.dao.impl.SpecDaoImpl;
import com.neusoft.entity.PageModel;
import com.neusoft.entity.Spec;
import com.neusoft.utils.Daofactory;

public class SpecService {
	//查询商品
	public PageModel<Spec> getSpecByPage(int pageNo,int pageSize){
		SpecDao sd = Daofactory.getInstance("specdao", SpecDao.class);
		return sd.getPageModel(pageNo, pageSize);
	}
		//查询业务逻辑
public void getSpecLogin(HttpServletRequest request,HttpServletResponse response) throws DaoException,IOException,ServletException{
			
			String pageNo=request.getParameter("pageNo");
			String pageSize=request.getParameter("pageSize");
			
//			int _pageNo=Integer.parseInt(pageNo);
//			int _pageSize=Integer.parseInt(pageSize);
			int _pageNo=1;
			int _pageSize=5; 

			PageModel<Spec> specs=getSpecByPage(_pageNo, _pageSize);
			if(specs!=null){
				int totalPageSize=(specs.getTotalcount()%_pageSize==0 ? specs.getTotalcount()/_pageSize : specs.getTotalcount()/_pageSize+1);
				specs.setTotalPageSize(totalPageSize);
				specs.setPageNo(_pageNo);
			}
			request.setAttribute("specs", specs);
			try {
				request.getRequestDispatcher("spec.jsp").forward(request, response);
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
		PageModel<Spec> specs=getSpecByPage(_pageNo, _pageSize);
		if(specs!=null){
			int totalPageSize=(specs.getTotalcount()%_pageSize==0 ? specs.getTotalcount()/_pageSize : specs.getTotalcount()/_pageSize+1);
			specs.setTotalPageSize(totalPageSize);
			specs.setPageNo(_pageNo);
		}
		request.setAttribute("specs", specs);
		try {
			request.getRequestDispatcher("spec.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	public boolean deleteSpec(int id){
		SpecDao sd = Daofactory.getInstance("specdao",SpecDaoImpl.class);
		boolean b = sd.deleteSpec(id);
		if(b){
			return true;
			
		}
		return false;
	}
	public boolean addSpec(Spec spec){
		SpecDao sd = Daofactory.getInstance("specdao",SpecDaoImpl.class);
		boolean b = sd.addSpec(spec);
		if (b) {
			return true;
		}
		return false;
	}
	public Spec readSpec(int cid){
		SpecDao sd = Daofactory.getInstance("specdao",SpecDaoImpl.class);
		return sd.readSpec(cid);
	}
	public boolean upSpec(Spec spec){
		SpecDao sd = Daofactory.getInstance("specdao",SpecDaoImpl.class);
		boolean b =sd.upSpec(spec);
		if(b){
			return true;
		}
		return false;
	}
	
}
