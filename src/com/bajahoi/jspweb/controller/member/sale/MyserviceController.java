package com.bajahoi.jspweb.controller.member.sale;

import java.io.IOException;
import java.util.List;

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

import com.bajahoi.jspweb.dao.ProductDao;
import com.bajahoi.jspweb.entity.ProductView;
import com.bajahoi.jspweb.jdbc.JdbcProductDao;

@WebServlet("/member/sale/myservice")
public class MyserviceController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		ProductDao productDao = new JdbcProductDao();
		String id = (String)request.getSession().getAttribute("id");
		List<ProductView> list = productDao.getList(id);
		
		request.setAttribute("list",list);

		/*RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/member/sale/myservice.jsp");
		dispatcher.forward(request, response);*/
		
		 ApplicationContext applicationContext = ServletUtil .getApplicationContext(request.getSession().getServletContext());
	        TilesContainer container = TilesAccess.getContainer(applicationContext);
	        ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	        container.render("member.sale.myservice", servletRequest);
	}
	
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ProductDao productDao = new JdbcProductDao();
	String id = request.getParameter("id");
	List<ProductView> list = productDao.getList(id);
	String s =  request.getParameter("z");
	request.setAttribute("list",list);
	productDao.delete(s);
	
	 ApplicationContext applicationContext = ServletUtil .getApplicationContext(request.getSession().getServletContext());
     TilesContainer container = TilesAccess.getContainer(applicationContext);
     ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
     container.render("member.sale.myservice", servletRequest);
}	
}
