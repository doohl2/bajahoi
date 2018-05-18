package com.bajahoi.jspweb.controller.member.purchase.order;

import java.io.IOException;
import java.util.List;

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
import com.bajahoi.jspweb.dao.OrderDao;
import com.bajahoi.jspweb.entity.OrderView;
import com.bajahoi.jspweb.jdbc.JdbcOrderDao;

@WebServlet("/member/purchase/order/list")
public class ListController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int page = 1;
		int lastPage = 1;
		
		String page_ = request.getParameter("p");
		if(page_!=null && !page_.equals(""))
			page = Integer.parseInt(page_);
		
		String id = (String)request.getSession().getAttribute("id");
		OrderDao orderDao = new JdbcOrderDao();
		List<OrderView> lis = orderDao.getList(id,page);
		request.setAttribute("lis",lis);
		int count = orderDao.getCount(id);
		
		lastPage = count / 3;
		if(count%3>0)
			lastPage++;
			
		int off = (page-1)%3;
		int startNum = page - off;
		request.setAttribute("count", count);
		request.setAttribute("lastPage", lastPage);
		request.setAttribute("startNum", startNum);
		
		 ApplicationContext applicationContext = ServletUtil .getApplicationContext(request.getSession().getServletContext());
	        TilesContainer container = TilesAccess.getContainer(applicationContext);
	        ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	        container.render("member.purchase.order.list", servletRequest);
	}
}
