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
 * Servlet implementation class CateServlet
 */
@WebServlet("/CateServlet")
public class addCateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addCateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		String cname =  request.getParameter("cname");
		String pid =  request.getParameter("pid");
		CateService h = new CateService();
			Cate c = new Cate(cname,pid);
			boolean b = h.addCate(c);
			if(b) {
				request.setAttribute("houtai", h);
				request.getRequestDispatcher("ReadCateServlet").forward(request, response);
				System.out.println("Ìí¼Ó³É¹¦...");
			}
			  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
