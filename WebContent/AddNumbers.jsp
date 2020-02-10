<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Exurb1a</title>
	</head>
	<body>				
				
		<!-- 
			Below tag is called scriplet. Any code written here will be put in the service method of the servlet.
			Scriptlet will automatically provide some objects(implicit objects). This is the reason, request object below is neither defined nor instatiated.
			Implicit Objects available : request, response, session, config(ServletConfig), application(ServletContext), out(for writing to response like resp.getWriter()), pageContext	 
			JSP can be have multiple scriplets. They will be combined in the service method.
		-->
		<%
			try{
				int a = Integer.parseInt(request.getParameter("num1"));
				int b = Integer.parseInt(request.getParameter("num2"));
				int sum = a + b;
				out.println("Odyssey:"+sum);	
			}
			catch(Exception e){
				e.printStackTrace();
				out.println("Odyssey:Moron");	
			}			
		%>
		
		</br>
		
		<!--
		 	Below tag is called declaration. Any code written here will be put as declaration as global variable
		 -->
		<%!
			String pain = "true";		
		%>
		
		
		
		<!--
			Below tag is called directive. This is used to import any custom used classes.
			Note most servlet/request/response/session etc will be imported automatically.(basically it does:javax.servlet.*, javax.servlet.http.*, javax.servlet.jsp.*)
			For more on this see : https://www.youtube.com/watch?v=OuBUUkQfBYM&t=2306s from 2hr 15min
		 -->
		<%@
			page import="java.util.Date" import="java.io.File"
		 %>
		


		<%!
			Date date;
			File file; 
		%>
		<%
			date = new Date();
			out.println("::"+date+"::");						
		%>	
		
		</br>
		
		<!--
			Below tag is called expression tag.
			This is used to print global variables directly
		 -->
		:This is part of the body. And value of pain is <%= pain %>
		
		
		</br>
		
		<%
			file = new File("abc");
		%>
		
		</br>
		
		File = <%= file %>
		
		</br>
		
		File existence = <%= file.exists() %>
		
	</body>
</html>