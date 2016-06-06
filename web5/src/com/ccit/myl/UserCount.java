package com.ccit.myl;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class UserCount implements HttpSessionListener {

	public UserCount() {

	}

	private int i = -2;
	public void sessionCreated(HttpSessionEvent arg) {
		HttpSession session = arg.getSession();
		ServletContext sc = session.getServletContext();
		sc.setAttribute("count", ++i);
	}

	public void sessionDestroyed(HttpSessionEvent arg) {
		HttpSession session = arg.getSession();
		ServletContext sc = session.getServletContext();
		sc.setAttribute("count", --i);
	}

}
