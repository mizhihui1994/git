package com.neusoft.controller.account_product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.Account_productServices;
@WebServlet("/DeleteAccount_productServlet")
public class DeleteAccount_productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteAccount_productServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Account_productServices aps = new Account_productServices();
		boolean a = aps.deleteAccount(id);
		
		System.out.println(a);
		if(a){
			request.getRequestDispatcher("ReadAccount_productServlet").forward(request, response);
		}else {
			System.out.println("É¾³ýÊ§°Ü");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
