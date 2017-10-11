package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Cate;
import com.neusoft.services.CateService;
@WebServlet("/UpdateCateServlet")
public class UpdateCateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateCateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		CateService ca = new CateService();
		Cate cate = ca.readate(cid);
//		//重定向到一个修改jsp页面
//		response.sendRedirect("updatecate.jsp");
		request.setAttribute("cid", cate);
		request.getRequestDispatcher("updatecate.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
