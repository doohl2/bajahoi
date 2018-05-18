package com.bajahoi.jspweb.controller.Board;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.bajahoi.jspweb.dao.BoardDao;
import com.bajahoi.jspweb.entity.Board;
import com.bajahoi.jspweb.jdbc.jdbcBoardDao;

@WebServlet("/Board/messageboard/make")
@MultipartConfig(
		   fileSizeThreshold = 1024*1024*1024,
		   maxFileSize = 1024*1024*5, //5�ް�
		   maxRequestSize = 1024*1024*5*5 //5�ް� 5������
		      )
public class MakeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String type = "";
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/Board/messageboard/make.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8"); // ��¿� ���� �ѱ۱��� �ذ�
	    response.setContentType("text/html; charset=UTF-8");
	    request.setCharacterEncoding("UTF-8"); // �Է¿� ���� �ѱ۱��� �ذ�
	    
		
		
		
		
		Part part = null;
		part =request.getPart("att");
		InputStream is = part.getInputStream();
		String fname = part.getSubmittedFileName();
		
		if(!(fname.equals(""))) {
		
		String pathUrl = "/WebContent/WEB-INF/views/Board/messageboard/upload"; //������ ���ε� �ǵ��� ��� ���� ����
		String pathSystem = request.getServletContext().getRealPath(pathUrl); //������ ��θ� �� �����ͼ� pathSystem�ӿ� �ִ´�.	
		File file = new File(pathSystem);//������ �� ��ΰ� �����ϴ��� Ȯ���ϱ� ���� �۾�
		
		if(!file.exists())//������ �� ��ΰ� �����ϴ��� Ȯ���ϱ� ���� �۾�
			file.mkdirs();//���� make directions
		byte[] buf = new byte[1024];
		
		
		FileOutputStream fos = new FileOutputStream(pathSystem+File.separator+fname);
		
		int size = 0;
		
		while((size = is.read(buf,0,1024)) != -1)
				fos.write(buf,0,size);
		
		 is.read(buf, 0, 1024);
		 
		 is.close();
		 fos.close();
		 
		 String id_ = "abc123";
		 Board board= new Board();
		 
		 board.setTitle(request.getParameter("title"));
			
		 if(request.getParameter("title").equals(""))
			{
				board.setTitle("...");
			}
			
			board.setContent(request.getParameter("content"));
			board.setCategoryId(request.getParameter("categortId"));
			board.setRegMemberId(id_);
			board.setAtt(fname);

			BoardDao boardDao = new jdbcBoardDao();
			boardDao.insert(board);
				
		}
				/*������� �ϴ� ���丮�� ���� ���丮�� �������� ���� ���, ���� ���丮���� ����
				C:\base\want
				want ���丮�� ������� �ϴµ�, base ���丮�� ���� ���, base ���丮���� ����*/
		else {
			String id_ = "abc123";
			Board board= new Board();
			board.setTitle(request.getParameter("title"));
			if(request.getParameter("title").equals(""))
			{
				board.setTitle("...");
			}
			
			board.setContent(request.getParameter("content"));
			board.setCategoryId(request.getParameter("categortId"));
			board.setRegMemberId(id_);
			
	
			//System.out.println(fname);
			BoardDao boardDao = new jdbcBoardDao();
			boardDao.notattinsert(board);
			
			
		}
		response.sendRedirect("MessageBoard");
	}
	

}
