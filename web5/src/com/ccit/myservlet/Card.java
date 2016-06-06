package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.CardDAO;


public class Card extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Card() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CardDAO cd = new CardDAO();
		request.setAttribute("list", cd.findAll());
		request.getRequestDispatcher("/WEB-INF/views/card.jsp").forward(request, response);
	}

	
}
