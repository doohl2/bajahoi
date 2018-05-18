package com.bajahoi.jspweb.controller.member.info;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;

import com.bajahoi.jspweb.dao.MemberDao;
import com.bajahoi.jspweb.entity.Member;
import com.bajahoi.jspweb.jdbc.JdbcMemberDao;

@MultipartConfig
(
		fileSizeThreshold = 1024*1024,
		maxFileSize = 1024*1024*100,
		maxRequestSize = 1024*1024*100*5
)
@WebServlet("/member/info/join")
public class JoinController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

/*		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/member/info/setting.jsp");
		dispatcher.forward(request, response);*/
		
		 ApplicationContext applicationContext = ServletUtil .getApplicationContext(request.getSession().getServletContext());
	        TilesContainer container = TilesAccess.getContainer(applicationContext);
	        ServletRequest servletRequest = new ServletRequest(applicationContext, request, response);
	        container.render("member.info.join", servletRequest);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8;");
		request.setCharacterEncoding("UTF-8");
		
		String pathURL = "/member/profile";
		String pathSystem = request.getServletContext().getRealPath(pathURL);
		File file = new File(pathSystem);
		
		if(!file.exists())
			file.mkdir();
/*		String page_ = request.getParameter("p");
		if(page_!=null && !page_.equals(""))
			page = Integer.parseInt(page_);*/
				
		Part part = request.getPart("profile");	
		InputStream is = part.getInputStream();
		String fname = part.getSubmittedFileName();

		byte[] buf = new byte[1024];
		
			if(fname.isEmpty())
			fname="acc.svg";
		
		FileOutputStream fos = new FileOutputStream(pathSystem+File.separator+fname);
				
		int size=0;
		while((size = is.read(buf,0,1024)) != -1)
			fos.write(buf,0,size);

		is.close();
		fos.close();
		
		String e2 = request.getParameter("email2");
		String es = request.getParameter("email_select");
		
		if(e2==null) 
			e2 = es;
		
		Member member = new Member();
		member.setPassword(request.getParameter("password"));
		member.setName(request.getParameter("name"));
		member.setNickname(request.getParameter("nickname"));
		member.setEmail1(request.getParameter("email1"));
		member.setEmail2(e2);
		member.setPhone(request.getParameter("phone"));
		member.setProfile(fname);
		member.setPostcode(request.getParameter("postcode"));
		member.setAddress1(request.getParameter("address1"));
		member.setAddress2(request.getParameter("address2"));
		member.setMemberType1(request.getParameter("memberType1"));
		member.setId(request.getParameter("id"));
		
		MemberDao memberDao = new JdbcMemberDao();

		memberDao.insert(member);
		response.sendRedirect("join");
		PrintWriter out = response.getWriter();
		try {
			out.write("try");
		} catch (Exception e) {
			out.write("catch");
		}
	}

}
