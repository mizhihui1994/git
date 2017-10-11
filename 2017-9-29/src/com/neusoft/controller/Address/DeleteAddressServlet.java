package com.neusoft.controller.Address;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.AddressService;

/**
 * Servlet implementation class DeleteAddressServlet
 */
@WebServlet("/DeleteAddressServlet")
public class DeleteAddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteAddressServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		AddressService as = new AddressService();
		boolean a = as.deleteaddress(id);
		if(a){
			request.getRequestDispatcher("ReadAddressServlet").forward(request, response);
		}else {
			System.out.println("É¾³ýÊ§°Ü");
		}
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
