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
<h2>Edit Customer Data</h2>
<form action="updateCustomer.html" method="POST">
<table>
<tr>
<td>Customer Id:</td>
<td><input type=text name="customerId" value="${cust.customerId}" readonly=readonly></td>
</tr>
<tr>
<td>Customer Name:</td>
<td><input type=text name="customerName" value="${cust.customerName}"></td>
</tr>
<tr>
<td>Customer Type:</td>
<td>
<select name="customerType" style="width:160px">
<option value="select" value="${cust.customerType}">select</option>
<option value="seller" value="${cust.customerType}">Seller</option>
<option value="consumer" value="${cust.customerType}">Consumer</option>
</select>
</td>
</tr>
<tr>
<td>Customer Email:</td>
<td><input type="text" name="customerEmail" value="${cust.customerEmail}"></td>
</tr>
<tr>
<td>Customer Address:</td>
<td><input type="text" name="customerAddress" value="${cust.customerAddress}"></td>
</tr>
<tr>
<td>Customer Mobile:</td>
<td><input type="text" name="customerMobile" value="${cust.customerMobile}"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Update"/></td>
</tr>
</table>
</form>
</body>
</html>