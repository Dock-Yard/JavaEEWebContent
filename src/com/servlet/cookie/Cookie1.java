package com.servlet.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cookie1")
public class Cookie1 extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			System.out.println("Insdide com.servlet.cookie.Cookie1.service");
			System.out.println(req.getMethod());
			System.out.println("Thread:"+Thread.currentThread().getId());
			System.out.println("Req hashcode:"+req.hashCode());
			System.out.println("Req hashcode:"+resp.hashCode());
			
			Cookie cookie = new Cookie("cookieAttribute", req.getParameter("you"));
			resp.addCookie(cookie);//this is set in response
						
			resp.sendRedirect("cookie2");//response is redirecting, so cookie2 servlet request will have this cookie
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
}
