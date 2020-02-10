package com.servlet.addNumbers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumbers extends HttpServlet{
	
	/*
	 * service method is defined in HttpServlet.
	 * Based on the method type(req.getMethod():GET,POST etc) it calls the corresponding doGet, doPost(check source code).
	 * Application developer has to override doGet, doPost. Else doGet, doPost methods send error(check source code).
	 * Note above we have overridden service and inside we are not calling any other method. So it wont call doGet, doPost etc 
	*/
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("Inside com.servlet.addNumbers.AddNumbers.service(HttpServletRequest, HttpServletResponse)");
		System.out.println(req.getMethod());//will print the method type(eg:GET, POST, etc)
		System.out.println(req.getProtocol());//will print the protocol(eg:HTTP/1.1)
		try {
			int a = Integer.parseInt(req.getParameter("num1"));
			int b = Integer.parseInt(req.getParameter("num2"));			
			int sum = a + b;
			
			PrintWriter printWriter = resp.getWriter();
			printWriter.println("Sum is="+sum);
		}
		catch(Exception e) {
			e.printStackTrace();
			PrintWriter printWriter = resp.getWriter();
			printWriter.println("You moron");
		}
	}	 
	
}
