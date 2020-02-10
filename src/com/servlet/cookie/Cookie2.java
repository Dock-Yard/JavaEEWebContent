package com.servlet.cookie;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cookie2")
public class Cookie2 extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			System.out.println("Insdide com.servlet.cookie.Cookie2.service");
			System.out.println(req.getMethod());
			System.out.println("Thread:"+Thread.currentThread().getId());
			System.out.println("Req hashcode:"+req.hashCode());
			System.out.println("Req hashcode:"+resp.hashCode());
			
			List<Cookie> cookies = Arrays.asList(req.getCookies());
			Optional<Cookie> oCookie = cookies.stream().filter(cookie -> cookie.getName().equals("cookieAttribute")).findAny();
			
			resp.getWriter().print(oCookie.get().getValue()+" in cookie data");
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
}
