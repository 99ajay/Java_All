<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
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
</tr>
<c:forEach items="${registrations}" var = "registration">
<tr>
<td>${registration.firstName}</td>
<td>${registration.email}</td>
<td>${registration.mobile}</td>

</tr>
</c:forEach>

</table>
</body>
</html>