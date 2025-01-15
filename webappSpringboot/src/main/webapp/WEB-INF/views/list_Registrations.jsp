<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
       <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Delete</th>
<th>Update</th>
</tr>
<c:forEach items="${registrations}" var = "registration">
<tr>
<td>${registration.firstName}</td>
<td>${registration.email}</td>
<td>${registration.mobile}</td>
<td><a href="deleteReg?id=${registration.id}">delete</a></td>
<td><a href="getRegById?id=${registration.id}">Update</a></td>


</tr>
</c:forEach>

</table>
</body>
</html>