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

<h2>Register here :--</h2>
<h2>Must be login</h2>
<form action="saveReg" method="post">
<pre>
Name: <input type="text" name="firstName" />
Email-Id<input type="text" name="email" />
Mobile <input type="text" name="mobile" />
<input type="submit" value="save" />
</pre>
</form>
${msg}
</body>
</html>