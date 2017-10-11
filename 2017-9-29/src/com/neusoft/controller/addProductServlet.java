package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Product;
import com.neusoft.services.ProductService;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class addProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String pname = request.getParameter("pname");//添加名称
		
		String leibie = request.getParameter("leibie");
		int cid = Integer.parseInt(leibie);
		String pno =request.getParameter("huohao");
		
		String pic = request.getParameter("pic");
		String price = request.getParameter("price");
		double priced = Double.parseDouble(price);
		String point = request.getParameter("point");
		String tuijian = request.getParameter("tuijian");
		if(tuijian==null||tuijian.equals("")) {
		 tuijian="是";
		}else {
			tuijian="否";
		}
		String online = request.getParameter("shangxian");
//		int is = Integer.parseInt(online);
		int is;//0 上线
		if(online==null||online.equals("")) {
			is=1;
			}else {
			is=0;
			}
		String tejia = request.getParameter("tejia");
		int a;
		if(tejia==null||tejia.equals("")) {
				a=1;
			}else {
				a=0;
		}
//		int tejiai = Integer.parseInt(tejia);
		String pdetaul = request.getParameter("ed");
		ProductService ps = new ProductService();
	    boolean b=ps.addprovate(new Product(pname, cid, pno, pic, priced, point, tuijian, is, a, pdetaul));
		if(b) {
			System.out.println("添加成功...");
			request.getRequestDispatcher("ReadProductServlet").forward(request, response);
		}
		else {
			System.out.println("添加失败");
		
	    }         
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
