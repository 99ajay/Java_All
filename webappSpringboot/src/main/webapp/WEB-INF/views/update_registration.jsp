<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update title here</title>
</head>
<body>

<form action="updateReg" method="post">
<pre>
Id: <input type="text" name="id" value ="${reg.id}" />
Name: <input type="text" name="firstName" value ="${reg.firstName}" />
Email-Id<input type="text" name="email" value = "${reg.email}"/>
Mobile <input type="text" name="mobile" value = "${reg.mobile}"/>
<input type="submit" value="update" />
</pre>
</form>
${msg}
</body>
</html>