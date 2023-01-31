<%@page import="schoolmanagement.teacherinfo"%>
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
	     teacherinfo s = (teacherinfo) session.getAttribute("updateteacher") ;
	%>
	<form action="updatech" method="post">
 id:<input type = "number" value="<%= s.getId()%>" name="id">
 name:<input type = "text" value="<%= s.getName()%>" name="name">
 age:<input type = "number" value="<%= s.getCno()%>" name="cno">
 email:<input type = "email" value="<%= s.getSubject()%>" name="sub">
 contactnumber:<input type = "number" value="<%= s.getSalary()%>" name="sal">
 <input type="submit">
 </form>
										

      <div align="center">
	    <hr>
		<a href="teacher.html">return to teacher option</a>
		
		</div>


</body>
</html>