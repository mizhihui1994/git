package com.neusoft.controller.consumer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.Consumerservice;
@WebServlet("/ReadConsumerServlet")
public class ReadConsumerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ReadConsumerServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Consumerservice cs = new Consumerservice();
		cs.getConsumerLogin(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
