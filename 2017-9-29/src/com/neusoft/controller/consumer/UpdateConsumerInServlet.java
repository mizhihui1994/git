package com.neusoft.controller.consumer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Consumer;
import com.neusoft.services.Consumerservice;
@WebServlet("/UpdateConsumerInServlet")
public class UpdateConsumerInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateConsumerInServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Consumerservice cs = new Consumerservice();
		Consumer  consumer =cs.getConsumer(id);
		if(consumer!=null){
			request.setAttribute("consumer", consumer);
			request.getRequestDispatcher("updateconsumer.jsp").forward(request, response);
		}else{
			System.out.println("≤È—Ø ß∞‹");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
