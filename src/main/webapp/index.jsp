<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<form action="login" method="post" style="margin:auto;width:50%;">
		<input type="text" name="userName" placeholder="user name"><br>
		<input type="password" name="password" placeholder="password">
		<br>
		<button type="submit"> submit</button>
		<br>
		<small>Not have account? </small>
		<a href="http://localhost:8090/JSP-Servlet-POC/signup.jsp">sign-up</a>
		<br>
		<small style="color:red;">${errorMessage }</small>
</form>
</body>
</html>