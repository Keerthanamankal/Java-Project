<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="save"  modelAttribute="user" method="post">
<input placeholder="Enter your name" name="username">
<br>
<input placeholder="Enter yiur Mobile number " name="mobilenumber">
<br>
<input placeholder="Enter your age " name="age">
<br>
<input placeholder="Enter your Email Id " name="email">
<br>
<input placeholder="Enter your password " name="password">
<br>
<input type="Submit">
</form>
</body>
</html>