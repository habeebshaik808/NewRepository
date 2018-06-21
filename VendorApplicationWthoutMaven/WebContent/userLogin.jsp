<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Data Management ::</title>
<link rel="icon" type="image/png" href="icon.png"/>
</head>
<body>
<%@include file="master.jsp" %>
<h2>Welcome to User Login Page!!</h2>
<form action="loginCheck.html" method="post">
<table>
<tr>
<td>UserName :</td> 
<td><input type="text" name="un"/> </td>
</tr>
<tr>
<td>Password  : </td>
<td><input type="password" name="pwd"/></td>
</tr>
<tr>
<td><input type="submit" value="Login"/> </td>
</tr>
</table>
</form>
${msg}<br/>
No account yet?<a href="registerUser.html">Register</a>Here
</body>
</html>