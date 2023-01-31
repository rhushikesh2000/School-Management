<%@page import="schoolmanagement.studentinfo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update page</title>
</head>
<body>

<h1 align="center"></h1>
	<hr size="20">
	<%
	     studentinfo s = (studentinfo) session.getAttribute("updatestudent") ;
	%>
	<form action="updat" method="post">
 id:<input type = "number" value="<%= s.getId()%>" name="id">
 name:<input type = "text" value="<%= s.getName()%>" name="name">
 age:<input type = "number" value="<%= s.getAge()%>" name="age">
 email:<input type = "email" value="<%= s.getEmail()%>" name="email">
 contactnumber:<input type = "number" value="<%= s.getConno()%>" name="cno">
 <input type="submit">
 </form>
										

      <div align="center">
	    <hr>
		<a href="student.html">return to student option</a>
		
		</div>


</body>
</html>