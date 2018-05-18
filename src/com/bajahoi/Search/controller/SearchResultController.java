package com.bajahoi.Search.controller;

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

import com.bajahoi.Category.JdbcSearchDao;
import com.bajahoi.Category.Search;
import com.bajahoi.Category.entity.CategoryView;


@WebServlet("/Search/SearchResult")
public class SearchResultController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		String tags = (String)request.getParameter("search");
		
		if(tags.equals(""))
			response.sendRedirect("../Search/SearchFail");
		
		//String tags = "마크";
		String tag = "%" + tags +"%";
		
		//tag = request.getParameter("search");
		
		Search searchDao = new JdbcSearchDao();
		
		
		List<CategoryView> list = searchDao.getList(tag);
		
		if(list.isEmpty())
			response.sendRedirect("../Search/SearchFail");
		
		request.setAttribute("list", list);
		
		
		
		
		request.getContextPath();
		
		ApplicationContext applicationContext = ServletUtil
	            .getApplicationContext(request.getSession().getServletContext());
	      TilesContainer container = TilesAccess.getContainer(applicationContext);
	      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	      container.render("Search.SearchResult", servletRequest);
	}

}
