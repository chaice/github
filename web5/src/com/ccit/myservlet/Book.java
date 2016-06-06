package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;


public class Book extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Book() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookDAO bd = new BookDAO();
		request.setAttribute("list", bd.findAll());
		request.getRequestDispatcher("/WEB-INF/views/book.jsp").forward(request, response);
	}

	

}
