package com.servlet.annotation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/annotation")
public class AnnotatedServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			System.out.println("Insdide com.servlet.annotation.AnnotatedServlet.service(HttpServletRequest, HttpServletResponse)");
			System.out.println(req.getMethod());
			System.out.println("Thread:"+Thread.currentThread().getId());
			System.out.println("Req hashcode:"+req.hashCode());
			System.out.println("Req hashcode:"+resp.hashCode());
			
			resp.getWriter().print(req.getParameter("you") + " AnnotatedServlet");
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
