package com.neusoft.controller.account_product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.Account_productServices;
@WebServlet("/ReadAccount_productServlet")
public class ReadAccount_productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ReadAccount_productServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Account_productServices aps = new Account_productServices();
		System.out.println("aaaaaaaaaaaa");
		aps.getAccount_productLogin(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
