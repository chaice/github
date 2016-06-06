package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;

public class Book_Del extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Book_Del() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookDAO bd = new BookDAO();
		int id = Integer.parseInt(request.getParameter("id"));
		if(bd.deleteBook(id)){
			response.sendRedirect("/book");
		}else{
			response.sendError(444,"没有删除权限");
		}
	}

	

}
