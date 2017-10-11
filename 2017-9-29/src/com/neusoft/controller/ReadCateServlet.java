package com.neusoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neusoft.services.CateService;
@WebServlet("/ReadCateServlet")
public class ReadCateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ReadCateServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//int pageNo=Integer.parseInt(request.getAttribute("pageNo"));
//		int pageSize =Integer.parseInt(s)
		
		CateService catedao = new CateService();
//		List<Cate> catelist= catedao.readall();
//		request.setAttribute("catelist", catelist);
//		request.getRequestDispatcher("PageModelServlet").forward(request, response);
		catedao.getCateLogin(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
