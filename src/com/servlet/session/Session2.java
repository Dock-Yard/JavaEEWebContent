package com.servlet.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session2")
public class Session2 extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			System.out.println("Insdide com.servlet.session.Session2.service");
			System.out.println(req.getMethod());
			System.out.println("Thread:"+Thread.currentThread().getId());
			System.out.println("Req hashcode:"+req.hashCode());
			System.out.println("Req hashcode:"+resp.hashCode());
			
			HttpSession httpSession = req.getSession();
			
			//httpSession.removeAttribute("sessionAttribute");
			
			resp.getWriter().print(httpSession.getAttribute("sessionAttribute")+" in session data");
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
}
