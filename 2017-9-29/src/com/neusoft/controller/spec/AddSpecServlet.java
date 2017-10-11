package com.neusoft.controller.spec;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Spec;
import com.neusoft.services.SpecService;

/**
 * Servlet implementation class AddSpecServlet
 */
@WebServlet("/AddSpecServlet")
public class AddSpecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddSpecServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid = Integer.parseInt(request.getParameter("pid"));
		String size = request.getParameter("size");
		SpecService ss = new SpecService();
		boolean b = ss.addSpec(new Spec(pid, size));
		if (b) {
			request.getRequestDispatcher("ReadSpec").forward(request, response);
		}else {
			System.out.println("Ìí¼ÓÊ§°Ü£¡£¡£¡£¡£¡£¡");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
