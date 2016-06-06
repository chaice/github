package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.CardDAO;
import com.ccit.sta.Card;

public class Card_Add2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Card_Add2() {
        super();      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CardDAO cd = new CardDAO();
		Card c = new Card();
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		c.setCode(code);
		c.setName(name);
		c.setTel(tel);
		cd.add(c);
		response.sendRedirect("/card");
	}

}
