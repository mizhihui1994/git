package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Cate;
import com.neusoft.services.CateService;

/**
 * Servlet implementation class UpdateCateyujuServlet
 */
@WebServlet("/UpdateCateyujuServlet")
public class UpdateCateyujuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateCateyujuServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		String cname = request.getParameter("cname");
		String pid = request.getParameter("pid");
		CateService catedao = new CateService();
		boolean b = catedao.upcata(new Cate(cid, cname, pid));
	    if(b){
	    	//request.getRequestDispatcher("fenleiguanli.jsp").forward(request, response);
	    	response.sendRedirect("ReadCateServlet");
	    }else{
	    	System.out.println("ÐÞ¸ÄÊ§°Ü");
	    }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
