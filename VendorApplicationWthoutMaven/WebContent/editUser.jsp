<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Data Management ::</title>
</head>
<body>
<%@include file="master.jsp" %>
<h2>Edit User Data</h2>
<form action="updateUser.html" method="POST">
<table>
<tr>
<td>User Id:</td>
<td><input type=text name="userId" value="${u.userId}" readonly=readonly></td>
</tr>
<tr>
<td>User Name:</td>
<td><input type=text name="userName" value="${u.userName}"></td>
</tr>
<tr>
<td>User Email:</td>
<td><input type="text" name="userEmail" value="${u.userEmail}"></td>
</tr>
<tr>
<td>User Mobile:</td>
<td><input type="text" name="userMobile" value="${u.userMobile}"></td>
</tr>
<tr>
<td>User Address:</td>
<td><input type="text" name="userAddress" value="${u.userAddress}"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Update"/></td>
</tr>
</table>
</form>
</body>
</html>