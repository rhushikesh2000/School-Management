<%@page import="schoolmanagement.teacherinfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">student  Details</h1>
	<hr size="20">
	<%
	List<teacherinfo> a1 = (List) session.getAttribute("displayallteacher");
	%>
	<table align="center" cellpadding="50px" border="1">
		<th>name</th>
		<th>id</th>
		<th>contactno</th>
		<th>salary</th>
		<th>subject</th>
		<%for(teacherinfo x:a1) { %>

<tr align="center">
<td><%=x.getName() %></td>
<td><%=x.getId() %></td>
<td><%=x.getCno() %></td>
<td><%=x.getSalary() %></td>
<td><%=x.getSubject() %></td>

</tr>
		<% } %>


	</table>
	<div align="center">
	    <hr>
		<a href="teacher.html">return to teacher option</a>
		
		</div>




</body>
</html>