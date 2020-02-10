package com.servlet.servletConfig;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			System.out.println("Insdide com.servlet.servletConfig.ServletConfigDemo.service(HttpServletRequest, HttpServletResponse)");
			System.out.println(req.getMethod());
			System.out.println("Thread:"+Thread.currentThread().getId());
			System.out.println("Req hashcode:"+req.hashCode());
			System.out.println("Req hashcode:"+resp.hashCode());
			
			String you = req.getParameter("you");
			
			//ServletConfig can be configured for each servlet. These properties will not be available to other servlets
			ServletConfig servletConfig = getServletConfig();
			String name = servletConfig.getInitParameter("name");
			String age = servletConfig.getInitParameter("age");
			
			resp.getWriter().println("you="+you+" Name="+name+"; Age="+age);
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
}
