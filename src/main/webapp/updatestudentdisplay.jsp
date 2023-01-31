<%@page import="schoolmanagement.studentinfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>updated details</title>
</head>
<body>
<h1 align="center"> updated student details</h1>
<hr size="20">

<%
studentinfo x=(studentinfo)session.getAttribute("updatedstudent1");
%>
<table align="center" cellpadding="50px" border="1">
		<th>name</th>
		<th>id</th>
		<th>age</th>
		<th>email</th>
		<th>cno</th>
		

<tr align="center">
<td><%=x.getName() %></td>
<td><%=x.getId() %></td>
<td><%=x.getAge() %></td>
<td><%=x.getEmail() %></td>
<td><%=x.getConno() %></td>

</tr>
		


	</table>
<div align="center">
	    <hr>
		<a href="student.html">return to student option</a>
		<hr><a href="updatestudent.html">update another student </a>
		</div>


</body>
</html>