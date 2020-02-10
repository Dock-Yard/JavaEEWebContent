package com.servlet.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class Session1 extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			System.out.println("Insdide com.servlet.session.Session1.service");
			System.out.println(req.getMethod());
			System.out.println("Thread:"+Thread.currentThread().getId());
			System.out.println("Req hashcode:"+req.hashCode());
			System.out.println("Req hashcode:"+resp.hashCode());
			
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("sessionAttribute", req.getParameter("you"));
			
			resp.sendRedirect("session2");
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
}
