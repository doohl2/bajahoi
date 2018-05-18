package com.bajahoi.Category.controller;

import java.io.IOException;
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

@WebServlet("/Category/Subcategory/3")
public class Category3Controller extends HttpServlet 
{
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException 
	{
		
		int page = 1;
		int lastpage = 1;
		
		String page_= request.getParameter("p");
		if(page_ != null && !page_.equals(""))
			page = Integer.parseInt(page_);
		
		Cate categoryDao = new JdbcCategoryDao();
		
		int count = categoryDao.getCount();
		
		if(count>0)
		{
			lastpage = count/5;
			if(count%5 >0)
				lastpage++;
		}
		
		int off = (page-1)%3;
		int startNum = page-off;
		
		List<CategoryView> list = categoryDao.getList(page);
		int cateId = 3;
		List<CategoryView> list1 = categoryDao.getList1(cateId);
		
		
		request.setAttribute("list", list);
		request.setAttribute("list1", list1);
		
		request.setAttribute("count", count);
		request.setAttribute("lastpage", lastpage);
		request.setAttribute("startNum", startNum);
		/*RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/WEB-INF/views/Category/Subcategory/1/00.jsp");
		
		
		dispatcher.forward(request, response);*/
		
		ApplicationContext applicationContext = ServletUtil
	            .getApplicationContext(request.getSession().getServletContext());
	      TilesContainer container = TilesAccess.getContainer(applicationContext);
	      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	      container.render("Category.Subcategory.3", servletRequest);
		
	}
	
	

}
