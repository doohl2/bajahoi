package com.bajahoi.jspweb.controller.Board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bajahoi.jspweb.dao.BoardDao;
import com.bajahoi.jspweb.entity.Board;
import com.bajahoi.jspweb.jdbc.jdbcBoardDao;

@WebServlet("/Board/messageboard/MessageBoard")
public class BoardController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String id = request.getParameter("id");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		int page = 1;
		String categortId = "01";
	    int lastPage = 1;
		
	    String page_ = request.getParameter("p");
	      if(page_ != null && !page_.equals(""))
	         page = Integer.parseInt(page_);
	    
		BoardDao boardDao = new jdbcBoardDao();
		int count = boardDao.getCount(categortId);
		//Board board = boardDao.get(id);
		if(count > 0) {
	         lastPage = count/10;
	         if(count%10 > 0)
	            lastPage++;
	      }
	      
	      int off = (page-1)%5;
	      int startNum = page - off;
	      
		List<Board> list = boardDao.getList(page,categortId);
		
		request.setAttribute("list", list);
	    request.setAttribute("count", count);
	    request.setAttribute("lastPage", lastPage);
	    request.setAttribute("startNum", startNum);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/WEB-INF/views/Board/messageboard/MessageBoard.jsp");

		dispatcher.forward(request, response);
	}
	
	

}
