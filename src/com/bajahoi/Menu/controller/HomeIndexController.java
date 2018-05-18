package com.bajahoi.Menu.controller;

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

@WebServlet("/home/index")
public class HomeIndexController extends HttpServlet 
{
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException 
	{
		int page = 0;
		Cate categoryDao = new JdbcCategoryDao();
		List<CategoryView> list = categoryDao.getList(page);
		
		
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher = 
	 			request.getRequestDispatcher("/WEB-INF/views/home/index.jsp");
	 	
	 	//forward를 이용하여 request와 response에 저장되어 있는 값을 보냄
	 	dispatcher.forward(request, response);
	 	
		
		
	}

}
