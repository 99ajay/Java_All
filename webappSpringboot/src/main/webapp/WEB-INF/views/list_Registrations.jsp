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
	<c:out value="100"></c:out>
	<c:set var="income" value="${4000*4}" />
	      <c:if test = "${income > 2000}">
         <p>My income is:  <c:out value = "${income}"/><p>
      </c:if>
</body>
</html>