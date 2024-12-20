<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Registration</title>
</head>
<body>
<form action="updateStudent" method="post">
email <input type="text" name="email" value = "<%=request.getAttribute("email")%>"/>
mobile <input type="text" name="mobile" value = "<%=request.getAttribute("mobile")%>"/>

<input type="submit" value = "update"/>

</form>

</body>
</html>