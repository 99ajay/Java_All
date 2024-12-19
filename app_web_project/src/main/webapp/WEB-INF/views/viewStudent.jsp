<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View student here.....</title>
</head>
<body>
	<h2>All Students</h2>
	<table>
	<tr>
		<th>name</th>
		<th>email</th>
		<th>mobile</th>
		<th>delete</th>
		
	</tr>
	<%
	ResultSet result = (ResultSet)request.getAttribute("result");
	while(result.next()){
	%>
	<tr>
	<td><%=result.getString(1) %></td>
 	<td><%=result.getString(2) %></td>
	<td><%=result.getString(3) %></td>
	<td><a href="deleteStudent?email=<%=result.getString(2)%>">delete</a></td>
	
	
	</tr>
	<%}%>
	</table>
</body>
</html>