package com.bajahoi.jspweb.controller.customer.login;

import java.io.IOException;
import java.io.PrintWriter;

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
import com.bajahoi.jspweb.dao.ProductDao;
import com.bajahoi.jspweb.entity.Member;
import com.bajahoi.jspweb.entity.Product;
import com.bajahoi.jspweb.jdbc.JdbcMemberDao;
import com.bajahoi.jspweb.jdbc.JdbcProductDao;

@WebServlet("/member/info/login")
public class LoginController extends HttpServlet{
 
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ApplicationContext applicationContext = ServletUtil .getApplicationContext(request.getSession().getServletContext());
	        TilesContainer container = TilesAccess.getContainer(applicationContext);
	        ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	        container.render("member.info.login", servletRequest);
	}
		
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8;");
		PrintWriter out = response.getWriter();
		
		String mid = request.getParameter("id");
		String password = request.getParameter("password");
	
		MemberDao memberDao = new JdbcMemberDao();
		Member member = memberDao.get(mid);
		
		if(member == null)
//		out.println("<script>alert('아이디 또는 비밀번호가 올바르지 않습니다.');  location.href='login' </script>");
		response.sendRedirect("login?error=1");
		
		else if(!member.getPassword().equals(password))
//			out.println("<script>alert('아이디 또는 비밀번호가 올바르지 않습니다.');  location.href='login' </script>");
			response.sendRedirect("login?error=1");
		
			else {
				request.getSession().setAttribute("id", mid);
				String returnUrl = request.getParameter("returnurl");
				if(returnUrl != null)
					response.sendRedirect(returnUrl);
			
				else
				response.sendRedirect("setting");
			}
		}
}
