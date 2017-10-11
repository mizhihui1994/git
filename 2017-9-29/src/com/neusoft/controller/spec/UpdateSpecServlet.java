package com.neusoft.controller.spec;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Spec;
import com.neusoft.services.SpecService;
@WebServlet("/UpdateSpecServlet")
public class UpdateSpecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateSpecServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int pid = Integer.parseInt(request.getParameter("pid"));
		String size = request.getParameter("size");
		SpecService ss = new SpecService();
		boolean b = ss.upSpec(new Spec(id, pid, size));
		if (b) {
			request.getRequestDispatcher("ReadSpec").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
