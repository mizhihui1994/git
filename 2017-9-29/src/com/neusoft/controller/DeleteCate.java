package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.CateService;

@WebServlet("/DeleteCate")
public class DeleteCate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteCate() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid = Integer.parseInt(request.getParameter("cid"));
		CateService cate = new CateService();
		boolean b =cate.deleteCate(cid);
		if(b){
			request.getRequestDispatcher("ReadCateServlet").forward(request, response);
		}else{
			System.out.println("É¾³ýÊ§°Ü£¡£¡£¡");
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
