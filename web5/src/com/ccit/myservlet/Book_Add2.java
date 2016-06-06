package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.BookDAO;
import com.ccit.sta.Book;

public class Book_Add2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Book_Add2() {
		super();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Book b = new Book();
		BookDAO bd = new BookDAO();
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String pub = request.getParameter("pub");
		int total = Integer.parseInt(request.getParameter("total"));
		b.setCode(code);
		b.setTitle(title);
		b.setAuthor(name);
		b.setPublishing(pub);
		b.setTotal(total);
		b.setCount(total);
		bd.addBook(b);
		response.sendRedirect("/book");
	}

}
