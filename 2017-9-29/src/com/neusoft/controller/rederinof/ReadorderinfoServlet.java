package com.neusoft.controller.rederinof;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.Orderinfoservices;
@WebServlet("/ReadorderinfoServlet")
public class ReadorderinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ReadorderinfoServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Orderinfoservices of = new Orderinfoservices();
	of.getOrderinfoLogin(request, response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
