package com.neusoft.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.Account_productDao;
import com.neusoft.dao.DaoException;
import com.neusoft.dao.impl.Account_productDaoImpl;
import com.neusoft.entity.Account_product;
import com.neusoft.entity.PageModel;
import com.neusoft.utils.Daofactory;

public class Account_productServices {
	Account_productDao apd = Daofactory.getInstance("Account_productDao", Account_productDaoImpl.class);
	//������һ�Ա
	public boolean addAccount(Account_product Account){
		if(apd.addAccount(Account)){
			return true;
		}
		return false;
	}
	//ɾ�����һ�Ա
	public boolean deleteAccount(int id){
		
		boolean a = apd.deleteAccount(id);
		if(a){
			return true;
		}
		return false;
	}
	//�޸����һ�Ա
	public boolean upAccount(Account_product Account){
		if(apd.upAccount(Account)){
			return true;
		}
		return false;
	}
	//��ѯ���һ�Ա
	public Account_product readAccount(int id){
		return apd.readAccount(id);
	}
	//��ѯȫ�����һ�Ա
	public List<Account_product> getAccountList(){
		return apd.getAccountList();
	}
	//��ҳ
	public PageModel<Account_product> getPageModel(int pageNo,int pagesize){
		return apd.getPageModel(pageNo, pagesize);
	}
	//��ѯҵ���߼�
		public void getAccount_productLogin(HttpServletRequest request,HttpServletResponse response) throws DaoException,IOException,ServletException{
					
					String pageNo=request.getParameter("pageNo");
					String pageSize=request.getParameter("pageSize");
//					int _pageNo=Integer.parseInt(pageNo);
//					int _pageSize=Integer.parseInt(pageSize);
					int _pageNo=1;
					int _pageSize=5; 

					PageModel<Account_product> account=getPageModel(_pageNo, _pageSize);
//					System.out.println(account);
					if(account!=null){
						int totalPageSize=(account.getTotalcount()%_pageSize==0 ? account.getTotalcount()/_pageSize : account.getTotalcount()/_pageSize+1);
						account.setTotalPageSize(totalPageSize);
						account.setPageNo(_pageNo);
					}
					request.setAttribute("accounts", account);
					try {
						request.getRequestDispatcher("readaccount.jsp").forward(request, response);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
				
				}
			/**
			 * ��ʾreqType=2
			 * @throws IOException 
			 * @throws ServletException 
			 */
			public void disReqType2(ServletRequest request,ServletResponse response) throws ServletException, IOException{
				int _pageNo=1;
				int _pageSize=5;
				PageModel<Account_product> account=getPageModel(_pageNo, _pageSize);
				System.out.println(account+"=========================");
				if(account!=null){
					int totalPageSize=(account.getTotalcount()%_pageSize==0 ? account.getTotalcount()/_pageSize : account.getTotalcount()/_pageSize+1);
					account.setTotalPageSize(totalPageSize);
					account.setPageNo(_pageNo);
				}
				request.setAttribute("accounts", account);
				try {
					request.getRequestDispatcher("readaccount.jsp").forward(request, response);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
}
