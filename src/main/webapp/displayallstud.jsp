<%@page import="schoolmanagement.studentinfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all student</title>
</head>
<body>
<h1 align="center">student  Details</h1>
	<hr size="20">
	<%
	List<studentinfo> a1 = (List) session.getAttribute("displayallstudent");
	%>
	<table align="center" cellpadding="50px" border="1">
		<th>name</th>
		<th>id</th>
		<th>age</th>
		<th>email</th>
		<th>cno</th>
		<%for(studentinfo x:a1) { %>

<tr align="center">
<td><%=x.getName() %></td>
<td><%=x.getId() %></td>
<td><%=x.getAge() %></td>
<td><%=x.getEmail() %></td>
<td><%=x.getConno() %></td>

</tr>
		<% } %>


	</table>
	<div align="center">
	    <hr>
		<a href="student.html">return to student option</a>
		
		</div>



</body>
</html>