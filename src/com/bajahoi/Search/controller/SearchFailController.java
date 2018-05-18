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

import com.bajahoi.Category.Cate;
import com.bajahoi.Category.JdbcCategoryDao;
import com.bajahoi.Category.entity.CategoryView;

@WebServlet("/Search/SearchFail")
public class SearchFailController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		int cateId = 1;
		Cate categoryDao = new JdbcCategoryDao();
		List<CategoryView> list1 = categoryDao.getList1(cateId);
		request.setAttribute("list1", list1);
		
		ApplicationContext applicationContext = ServletUtil
	            .getApplicationContext(request.getSession().getServletContext());
	      TilesContainer container = TilesAccess.getContainer(applicationContext);
	      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	      container.render("Search.SearchFail", servletRequest);
	}

}
