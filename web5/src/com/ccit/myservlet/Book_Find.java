package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;


public class Book_Find extends HttpServlet {
	private static final long serialVersionUID = 1L;        
    public Book_Find() {
        super();
        
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  BookDAO bd = new BookDAO();
	  String code = request.getParameter("code");
	  request.setAttribute("book", bd.findOne(code));
	  request.getRequestDispatcher("/WEB-INF/views/book_alter.jsp").forward(request, response);
	}

}
