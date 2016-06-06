package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.CardDAO;

public class Card_Del extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Card_Del() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CardDAO cd = new CardDAO();
		int id = new Integer(request.getParameter("id"));
		if(cd.remove(id)){
			response.sendRedirect("/card");
		}else{
			response.sendError(444, "没有删除权限");
		}
	}

	
}
