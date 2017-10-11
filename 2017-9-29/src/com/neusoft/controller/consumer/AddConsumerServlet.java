package com.neusoft.controller.consumer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Consumer;
import com.neusoft.services.Consumerservice;
@WebServlet("/AddConsumerServlet")
public class AddConsumerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddConsumerServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String loginname = request.getParameter("loginname");
		String password = request.getParameter("password");
		String registertimes = request.getParameter("registertime");
		long registertime = Long.parseLong(registertimes);
		String lastlogintimes = request.getParameter("lastlogintime");
		long lastlogintime = Long.parseLong(lastlogintimes);
		String ip = request.getParameter("ip");
		Consumerservice cs = new Consumerservice();
		boolean b = cs.updateConsumer(new Consumer(loginname, password, registertime, lastlogintime, ip));
		if(b){
			request.getRequestDispatcher("ReadConsumerServlet").forward(request, response);
		}
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
