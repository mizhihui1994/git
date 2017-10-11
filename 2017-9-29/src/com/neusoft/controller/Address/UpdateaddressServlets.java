package com.neusoft.controller.Address;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Address;
import com.neusoft.services.AddressService;
@WebServlet("/UpdateaddressServlets")
public class UpdateaddressServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateaddressServlets() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String province = request.getParameter("province");
		String city = request.getParameter("city");
		String area = request.getParameter("area");
		AddressService as = new AddressService();
		if(as.upaddress(new Address(id, province, city, area))){
			request.getRequestDispatcher("ReadAddressServlet").forward(request, response);;
		}else {
			System.out.println("ÐÞ¸ÄÊ§°Ü");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
