package com.bajahoi.jspweb.controller.member.purchase.order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import com.bajahoi.jspweb.dao.MemberDao;
import com.bajahoi.jspweb.dao.OrderDao;
import com.bajahoi.jspweb.dao.ProductDao;
import com.bajahoi.jspweb.entity.Member;
import com.bajahoi.jspweb.entity.Order;
import com.bajahoi.jspweb.entity.ProductView;
import com.bajahoi.jspweb.jdbc.JdbcMemberDao;
import com.bajahoi.jspweb.jdbc.JdbcOrderDao;
import com.bajahoi.jspweb.jdbc.JdbcProductDao;
@WebServlet("/member/purchase/order/detail")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String memberId = (String)request.getSession().getAttribute("id");
		String productId = request.getParameter("pid");
		
		OrderDao orderDao = new JdbcOrderDao();
		Order order = orderDao.get(memberId, productId);

		ProductDao productDao = new JdbcProductDao();
		ProductView product = productDao.get(productId);

		MemberDao memberDao = new JdbcMemberDao();
		Member member = memberDao.get(memberId);
		
		request.setAttribute("order", order);
		request.setAttribute("product", product);
		request.setAttribute("member", member);
		
/*		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/member/purchase/order/detail.jsp");
		dispatcher.forward(request, response);*/
		
		 ApplicationContext applicationContext = ServletUtil .getApplicationContext(request.getSession().getServletContext());
	        TilesContainer container = TilesAccess.getContainer(applicationContext);
	        ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	        container.render("member.purchase.order.detail", servletRequest);
	}
}
