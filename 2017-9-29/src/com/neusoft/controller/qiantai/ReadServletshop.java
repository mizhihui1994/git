package com.neusoft.controller.qiantai;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Product;
import com.neusoft.services.qiantai.ProductService;

@WebServlet("/ReadServlet")
public class ReadServletshop extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ReadServletshop() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService ps = new ProductService();
		ps.getProductLOgin(request, response);;
//		List<Product> list =ps.getallproduct();
//		request.setAttribute("shouye", list);
//		request.getRequestDispatcher("shouyequanbu.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
