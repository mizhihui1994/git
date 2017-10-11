package com.neusoft.controller.account_product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Account_product;
import com.neusoft.services.Account_productServices;
@WebServlet("/AddAccount_productServlet")
public class AddAccount_productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddAccount_productServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginname =  request.getParameter("loginname");
		String password = request.getParameter("password");
		String registertimes = request.getParameter("registertime");
		long registertime = Long.parseLong(registertimes);
		String lastlogintimes = request.getParameter("lastlogintime");
		long lastlogintime = Long.parseLong(lastlogintimes);
		int ip = Integer.parseInt(request.getParameter("ip"));
		Account_productServices aps =new Account_productServices();
		boolean b = aps.addAccount(new Account_product(loginname, password, registertime, lastlogintime, ip));
		if(b){
			request.getRequestDispatcher("ReadAccount_productServlet").forward(request, response);
		}else{
			System.out.println("ÃÌº” ß∞‹");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
