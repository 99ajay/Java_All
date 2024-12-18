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
		
	</tr>
	<%
	ResultSet res = (ResultSet)request.getAttribute("result");
	while(res.next()){
	%>
	<tr>
	<td><%=res.getString(1) %></td>
 	<td><%=res.getString(2) %></td>
	<td><%=res.getString(3) %></td>
	</tr>
	<%} %>
	</table>
</body>
</html>