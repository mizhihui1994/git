package com.neusoft.controller.consumer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Consumer;
import com.neusoft.services.Consumerservice;
@WebServlet("/UpdateConsumerOutServlet")
public class UpdateConsumerOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateConsumerOutServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String loginname = request.getParameter("loginname");
		String password = request.getParameter("password");
		String registertimes = request.getParameter("registertime");
		long registertime = Long.parseLong(registertimes);
		String lastlogintimes = request.getParameter("lastlogintime");
		long lastlogintime = Long.parseLong(lastlogintimes);
		String ip = request.getParameter("ip");
		String nickname = request.getParameter("nickname");
		String moneys = request.getParameter("money");
		double money = Double.parseDouble(moneys);
		String lasttimes = request.getParameter("lasttime");
		long lasttime = Long.parseLong(lasttimes);
		Consumerservice cs = new Consumerservice();
		boolean b = cs.updateConsumer(new Consumer(id, loginname, password, registertime, lastlogintime, ip, nickname, money, lasttime));
		if (b) {
			request.getRequestDispatcher("ReadConsumerServlet").forward(request, response);
		}else{
			System.out.println("ÐÞ¸ÄÊ§°Ü");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
