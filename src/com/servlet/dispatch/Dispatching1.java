package com.servlet.dispatch;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatching1 extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {			
			System.out.println("Inside com.servlet.dispatch.Dispatching1.service(HttpServletRequest, HttpServletResponse)");
			System.out.println(req.getMethod());
			System.out.println("Thread:"+Thread.currentThread().getId());
			System.out.println("Req hashcode:"+req.hashCode());
			System.out.println("Req hashcode:"+resp.hashCode());
			
			req.setAttribute("attr", req.getParameter("you"));//this will be retrieved from Dispatching2
			
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("dispatching2");
			requestDispatcher.forward(req, resp);
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
	}
	
}
