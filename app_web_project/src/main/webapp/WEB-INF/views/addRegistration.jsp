<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add student here....</title>
</head>
<body>
<form action="add_Registration" method="post">
<pre>
      Name<input type="text" name="name" />
      Email<input type="text" name="email" />
      Password<input type="text" name="mobile" />
      <input type="submit" value="save" />
      
      <%
      if(request.getAttribute("message")!=null){
    	  out.println(request.getAttribute("message"));
      }
      %>
</pre>
</form>
</body>
</html>