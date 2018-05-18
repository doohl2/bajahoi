package com.bajahoi.jspweb.controller.member.purchase;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import com.bajahoi.jspweb.dao.MemberDao;
import com.bajahoi.jspweb.dao.OrderDao;
import com.bajahoi.jspweb.dao.ProductDao;
import com.bajahoi.jspweb.dao.ProductReqDao;
import com.bajahoi.jspweb.entity.Member;
import com.bajahoi.jspweb.entity.Order;
import com.bajahoi.jspweb.entity.ProductReq;
import com.bajahoi.jspweb.entity.ProductView;
import com.bajahoi.jspweb.jdbc.JdbcMemberDao;
import com.bajahoi.jspweb.jdbc.JdbcOrderDao;
import com.bajahoi.jspweb.jdbc.JdbcProductDao;
import com.bajahoi.jspweb.jdbc.JdbcProductReqDao;

@WebServlet("/member/purchase/ask")
public class AskController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderDao orderDao = new JdbcOrderDao();
		ProductDao productDao = new JdbcProductDao();
		MemberDao memberDao = new JdbcMemberDao();

		String mid = (String)request.getSession().getAttribute("id");
		
//		String mid = request.getParameter("mid");
		String pid = request.getParameter("pid"); 
				
		Order order = orderDao.get(mid,pid); 
		ProductView productView = productDao.get(pid);
		Member member = memberDao.get(mid);
		
		HttpSession session = request.getSession();
		session.getAttribute(mid);
		session.getAttribute(pid);
		
		request.setAttribute("order", order);
		request.setAttribute("productView", productView);
		request.setAttribute("member", member);
		
/*		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/member/purchase/ask.jsp");
		dispatcher.forward(request, response);*/
		
		 ApplicationContext applicationContext = ServletUtil .getApplicationContext(request.getSession().getServletContext());
	        TilesContainer container = TilesAccess.getContainer(applicationContext);
	        ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);	
	        container.render("member.purchase.home.ask", servletRequest);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8;");
		request.setCharacterEncoding("UTF-8");
		
		ProductReq productReq = new ProductReq();
		productReq.setMemberId(request.getParameter("mid"));
		productReq.setProductId(request.getParameter("pid"));
		productReq.setTitleName(request.getParameter("titleName"));
		productReq.setContent(request.getParameter("content"));
		
		ProductReqDao productReqDao = new JdbcProductReqDao();
		productReqDao.insert(productReq);
		response.sendRedirect("ask");
		
		
	}
	
}
