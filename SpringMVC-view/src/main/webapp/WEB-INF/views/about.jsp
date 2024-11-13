<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
</head>
<body>
	<h1>About Page......!</h1>
	<!-- JSP Expression Language (EL) -->
	<h2>${Message}</h2>
	
	<!-- scriptlet tag -->
	<% 
		String name = (String) request.getAttribute("Name"); 
		Integer age = (Integer) request.getAttribute("age");
		List<String> courses = (List<String>) request.getAttribute("courses");
	%>
	<h2> Hi, <%=name%> </h2>
	<h3> You are <%=age%> years old ...!</h3>
	<h3> You have selected the following courses: </h3>
	<% for(String course: courses)
			{ 
				out.print(course+", ");
			}
	%>
	<hr>
	<h3> You have selected the following courses: </h3>
	<ul>
		<% for(String course: courses) {%>
			<li><%=course%></li>
			<%} %>
	</ul>
</body>
</html>