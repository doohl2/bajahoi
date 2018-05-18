package com.bajahoi.Category.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
import com.bajahoi.Category.entity.Category;
import com.bajahoi.Category.entity.CategoryView;
import com.bajahoi.Category.entity.Product;

@WebServlet("/Category/home/AllCategory")
public class AllCategoryController extends HttpServlet 
{
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException 
	{
		
		Cate categoryDao = new JdbcCategoryDao();
		
		int cateId = 0;
		
		List<Category> list2 = categoryDao.getList2();
		
		
		
		request.setAttribute("list2", list2);
		
		request.getContextPath();
		
		ApplicationContext applicationContext = ServletUtil
	            .getApplicationContext(request.getSession().getServletContext());
	      TilesContainer container = TilesAccess.getContainer(applicationContext);
	      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	      container.render("Category.home.AllCategory", servletRequest);
		
	      
	}
	
	

}
