package com.neusoft.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.AddressDao;
import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.AddressDaoImpl;
import com.neusoft.entity.Address;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.Daofactory;

public class AddressService {
	public boolean addaddress(Address address) {
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		boolean b = addao.addaddress(address);
		if(b){
			return true;
		}
		return false;
	}
	//删除地址
	public boolean deleteaddress(int id){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		boolean b = addao.deleteaddress(id);
		if(b){
			return true;
		}
		return false;
		
	}
	//修改地址
	public boolean upaddress(Address address){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		boolean b = addao.upaddress(address);
		if(b){
			return true;
		}
		return false;
		
	}
	//查询地址
	public Address readaddress(int id){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		return addao.readaddress(id);
	}
	//查询全部地址
	public List<Address> getaddressList(){
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		return addao.getaddressList();
	}
	//分页
	public PageModel<Address> getPageModel(int pageNo,int pagesize) throws DaoException{
		AddressDao addao = Daofactory.getInstance("addressdao", AddressDaoImpl.class);
		return addao.getPageModel(pageNo, pagesize);
	}
	//查询业务逻辑
	public void getAddressLogin(HttpServletRequest request,HttpServletResponse response) throws DaoException,IOException,ServletException{
				
				String pageNo=request.getParameter("pageNo");
				String pageSize=request.getParameter("pageSize");
//				int _pageNo=Integer.parseInt(pageNo);
//				int _pageSize=Integer.parseInt(pageSize);
				int _pageNo=1;
				int _pageSize=5; 

				PageModel<Address> address=getPageModel(_pageNo, _pageSize);
				System.out.println(address);
				if(address!=null){
					int totalPageSize=(address.getTotalcount()%_pageSize==0 ? address.getTotalcount()/_pageSize : address.getTotalcount()/_pageSize+1);
					address.setTotalPageSize(totalPageSize);
					address.setPageNo(_pageNo);
				}
				request.setAttribute("addresss", address);
				try {
					request.getRequestDispatcher("address.jsp").forward(request, response);
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
			PageModel<Address> address=getPageModel(_pageNo, _pageSize);
			System.out.println(address+"=========================");
			if(address!=null){
				int totalPageSize=(address.getTotalcount()%_pageSize==0 ? address.getTotalcount()/_pageSize : address.getTotalcount()/_pageSize+1);
				address.setTotalPageSize(totalPageSize);
				address.setPageNo(_pageNo);
			}
			request.setAttribute("addresss", address);
			try {
				request.getRequestDispatcher("address.jsp").forward(request, response);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
}
