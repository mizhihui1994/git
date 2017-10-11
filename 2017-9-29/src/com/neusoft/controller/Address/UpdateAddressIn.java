package com.neusoft.controller.Address;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Address;
import com.neusoft.services.AddressService;
@WebServlet("/UpdateAddressIn")
public class UpdateAddressIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateAddressIn() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int id = Integer.parseInt(request.getParameter("id"));
	System.out.println(id);
	AddressService ad = new AddressService();
	Address address = ad.readaddress(id);
	request.setAttribute("address", address);
	request.getRequestDispatcher("addressupdate.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
