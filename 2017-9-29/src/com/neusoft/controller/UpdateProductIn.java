package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Product;
import com.neusoft.services.ProductService;

/**
 * Servlet implementation class UpdateProductIn
 */
@WebServlet("/UpdateProductIn")
public class UpdateProductIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateProductIn() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		ProductService ps = new ProductService();
		Product product =ps.readbyid(id);
		request.setAttribute("product", product);
		request.getRequestDispatcher("updateproduct.jsp").forward(request, response);;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
