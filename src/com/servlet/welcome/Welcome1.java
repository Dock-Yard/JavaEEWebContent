package com.servlet.welcome;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome1 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method of Welcome1 servlet, Thread="+Thread.currentThread().getId()+", HashObject="+this.hashCode());
		resp.getWriter().print("Welcome from servlet");
	}
}
