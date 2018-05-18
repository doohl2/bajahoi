package Category.controller;

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

import Category.Cate;
import Category.IndexDao;
import Category.entity.Category;
import Category.entity.CategoryView;
import Category.entity.Product;

@WebServlet("/home1/index")
public class IndexController extends HttpServlet 
{
	@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException 
	{
		
		/*ProductDao productDao = new jdbcProductDao();
		List<Product> plist = productDao.getList();*/
		
		Cate categoryDao = new IndexDao();
		List<CategoryView> list = categoryDao.getList();
		//List<Category> list1 = categoryDao.getList1();
		
		
		/*request.setAttribute("plist", plist);*/
		request.setAttribute("list", list);
		//request.setAttribute("list1", list1);
		//request.getContextPath();
		
		
		ApplicationContext applicationContext = ServletUtil
	            .getApplicationContext(request.getSession().getServletContext());
	      TilesContainer container = TilesAccess.getContainer(applicationContext);
	      ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	      container.render("home1.index", servletRequest);
	      
	}
}
