package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.ProductService;

/**
 * Servlet implementation class DeleteProductServlet
 */
@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteProductServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	int id = Integer.parseInt(request.getParameter("id"));
	ProductService ps = new ProductService();
	boolean b= ps.delete(id);
	if(b){
		request.getRequestDispatcher("ReadProductServlet").forward(request, response);
	}else{
		System.out.println("É¾³ýÊ§°Ü");
	}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
