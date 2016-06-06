package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ccit.dao.AdminDAO;


public class Home_c extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Home_c() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = request.getParameter("name");
		session.setAttribute("username", name);
		String pwd = request.getParameter("pwd");
		request.setAttribute("username", name);
		AdminDAO ad = new AdminDAO();
		if(ad.find(name, pwd)){
			response.sendRedirect("/home");
		}else{
			response.sendRedirect("login?err=444");
		}
	}

}
