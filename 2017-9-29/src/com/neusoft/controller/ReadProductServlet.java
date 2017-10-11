package com.neusoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.ProductService;

@WebServlet("/ReadProductServlet")
public class ReadProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ReadProductServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
	
	ProductService ps = new ProductService();
//	List<Product> list = productdao.getallproduct();
//		request.setAttribute("list", list);
//		System.out.println(list);
//		request.getRequestDispatcher("shangpinguanli.jsp").forward(request, response);
	
	
//	String reqType=request.getParameter("reqType");
	
	
//	if(reqType!=null && !reqType.equals("")){
// 		if(reqType.equals("2")){
//			//处理查询分类请求    捕获并且处理异常
//			try{
//				
//				ps.getProductLogin(request, response);
//				}catch(DaoException e){
//					request.setAttribute("error", e.getMessage());
//				}
//		}
//	}else{
//		ps.disReqType2(request, response);
//	}

	
	ps.getProductLogin(request, response);
	
	
}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
