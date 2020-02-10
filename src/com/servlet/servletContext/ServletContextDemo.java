package com.servlet.servletContext;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletContextDemo")
public class ServletContextDemo extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			System.out.println("Insdide com.servlet.servletConfig.ServletConfigDemo.service(HttpServletRequest, HttpServletResponse)");
			System.out.println(req.getMethod());
			System.out.println("Thread:"+Thread.currentThread().getId());
			System.out.println("Req hashcode:"+req.hashCode());
			System.out.println("Req hashcode:"+resp.hashCode());
			
			String you = req.getParameter("you");
			
			ServletContext servletContext = getServletContext();
			String name = servletContext.getInitParameter("name");
			String age = servletContext.getInitParameter("age");
			
			resp.getWriter().println("you="+you+" Name="+name+"; Age="+age);
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
}
