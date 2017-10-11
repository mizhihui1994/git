package com.neusoft.controller.spec;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.SpecService;
@WebServlet("/DeleteSpec")
public class DeleteSpec extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteSpec() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		SpecService ss = new SpecService();
		boolean b = ss.deleteSpec(id);
		System.out.println(b);
		if(b){
			request.getRequestDispatcher("ReadSpec").forward(request, response);
		}else{
			System.out.println("É¾³ýÊ§°Ü£¡£¡£¡£¡£¡£¡£¡");
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
