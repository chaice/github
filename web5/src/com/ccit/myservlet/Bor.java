package com.ccit.myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccit.dao.MyService;

public class Bor extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Bor() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookcode = request.getParameter("bookcode");
		String cardcode = request.getParameter("cardcode");
		System.out.println(bookcode +":"+cardcode);
		MyService ms = new MyService();
		String mes = ms.bo_bor(bookcode, cardcode);
		response.sendRedirect("/home?mes="+mes);
	}

}
