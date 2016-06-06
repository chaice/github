package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Card_Add1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Card_Add1() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/card_add.jsp").forward(request, response);
	}

}
