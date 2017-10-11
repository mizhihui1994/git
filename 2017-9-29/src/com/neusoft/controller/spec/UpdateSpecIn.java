package com.neusoft.controller.spec;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Spec;
import com.neusoft.services.SpecService;
@WebServlet("/UpdateSpecIn")
public class UpdateSpecIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateSpecIn() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		SpecService ss = new SpecService();
		Spec spec = ss.readSpec(id);
		if (spec!=null) {
			request.setAttribute("spec", spec);
			request.getRequestDispatcher("updatespec.jsp").forward(request, response);
			
		}else{
			System.out.println("ÐÞ¸ÄÊ§°Ü");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
