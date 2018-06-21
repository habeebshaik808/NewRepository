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
<h2>Edit Vendor Data</h2>
<form action="updateVendor.html" method="POST">
<table>
<tr>
<td>Vendor Id:</td>
<td><input type=text name="vendorId" value="${ven.vendorId}" readonly=readonly></td>
</tr>
<tr>
<td>Vendor Name:</td>
<td><input type=text name="vendorName" value="${ven.vendorName}"></td>
</tr>
<tr>
<td>Vendor Email:</td>
<td><input type=text name="vendorEmail" value="${ven.vendorEmail}"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Update"/></td>
</tr>
</table>
</form>
</body>
</html>