package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.CardDAO;
import com.ccit.sta.Card;


public class Card_Alter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Card_Alter() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = new Integer(request.getParameter("id"));
		CardDAO cd = new CardDAO();
		Card c = new Card();
		String code = request.getParameter("code");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		c.setId(id);
		c.setCode(code);
		c.setName(name);
		c.setTel(tel);
		if(cd.alterCard(c)){
			response.sendRedirect("/card");
		}else{
			response.sendError(444,"没有修改权限！");
		}
	}

}
