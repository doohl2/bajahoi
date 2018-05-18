package com.bajahoi.jspweb.controller.Board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bajahoi.jspweb.dao.BOARD_CommentDao;
import com.bajahoi.jspweb.dao.BoardDao;
import com.bajahoi.jspweb.entity.BOARD_Comment;
import com.bajahoi.jspweb.entity.Board;
import com.bajahoi.jspweb.jdbc.jdbcBOARDCommentDao;
import com.bajahoi.jspweb.jdbc.jdbcBoardDao;

@WebServlet("/Board/messageboard/see")
public class SeeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8"); // ��¿� ���� �ѱ۱��� �ذ�
	    response.setContentType("text/html; charset=UTF-8");
	    request.setCharacterEncoding("UTF-8"); // �Է¿� ���� �ѱ۱��� �ذ�
		
		String id = request.getParameter("id");
		String command = null;
		String cmcommand = null;
		
		BoardDao boardDao = new jdbcBoardDao();
		Board board = boardDao.get(id);
		boardDao.update_hit(board);
		
		BOARD_CommentDao boardcmDao = new jdbcBOARDCommentDao();
		List<BOARD_Comment> boardcm = boardcmDao.getList(id);
		
		request.setAttribute("board", board);
		request.setAttribute("boardcm", boardcm);
		request.setAttribute("command", command);
		request.setAttribute("cmcommand", cmcommand);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Board/messageboard/see.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8"); // ��¿� ���� �ѱ۱��� �ذ�
	    response.setContentType("text/html; charset=UTF-8");
	    request.setCharacterEncoding("UTF-8"); // �Է¿� ���� �ѱ۱��� �ذ�
		String id_ = "abc123";
		
		Board board= new Board();
		BoardDao boardDao = new jdbcBoardDao();
		
		BOARD_CommentDao boardcmDao = new jdbcBOARDCommentDao();
		
		String id = request.getParameter("id");
		String cmd = request.getParameter("command");
		
		if(cmd.equals("delete")) 
		{
			boardDao.delete(id);
			response.sendRedirect("MessageBoard");
		}
		else if(cmd.equals("recom")) {
			Board board2 = boardDao.get(id);
			boardDao.update_recomm(board2);
			response.sendRedirect("MessageBoard");
		}
		else if(cmd.equals("cm_delete")) 
		{
			boardcmDao.delete(id);
			response.sendRedirect("MessageBoard");
		}
		else if(cmd.equals("cm_insert")) {
			BOARD_Comment comment= new BOARD_Comment();
			comment.setContent(request.getParameter("cm_content"));
			comment.setBoardId(id);
			comment.setMemberId(id_);
			boardcmDao.insert(comment);
			response.sendRedirect("MessageBoard");
		}
		


		//response.sendRedirect("MessageBoard");
	}
	

}
