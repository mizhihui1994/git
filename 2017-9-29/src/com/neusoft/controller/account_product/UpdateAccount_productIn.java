package com.neusoft.controller.account_product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Account_product;
import com.neusoft.services.Account_productServices;
@WebServlet("/UpdateAccount_productIn")
public class UpdateAccount_productIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateAccount_productIn() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Account_productServices aps =new Account_productServices();
		Account_product a = aps.readAccount(id);
		System.out.println(a);
		if (a!=null) {
			request.setAttribute("account", a);
			request.getRequestDispatcher("updataAccount_product.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
