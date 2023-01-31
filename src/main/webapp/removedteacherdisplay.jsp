<%@page import="schoolmanagement.teacherinfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>teacher removed</title>
</head>
<body>
<h1 align="center">teacher  added</h1>
	<hr size="20">
	<%
	teacherinfo x = (teacherinfo) session.getAttribute("removeteacher");
	%>
	<table align="center" cellpadding="50px" border="1">
		<th>name</th>
		<th>id</th>
		<th>cno</th>
		<th>subject</th>
		<th>salary</th>
		

<tr align="center">
<td><%=x.getName() %></td>
<td><%=x.getId() %></td>
<td><%=x.getCno() %></td>
<td><%=x.getSubject() %></td>
<td><%=x.getSalary() %></td>

</tr>
		


	</table>
	
	
	
	<div align="center">
	    <hr>
		<a href="teacher.html">return to teacher option</a>
		<hr><a href="removeteacher.html">remove another teacher </a>
		</div>



</body>
</html>