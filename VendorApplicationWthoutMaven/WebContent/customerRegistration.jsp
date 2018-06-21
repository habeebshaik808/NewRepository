<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Data Management ::</title>
</head>
<body>
<%@include file="master.jsp" %>
<h2>Add Customer Data</h2>
<form  action="saveCustomer.html" method="POST">
<table>
<tr>
<td>Customer Id:</td>
<td><input type="text" name="customerId"></td>
</tr>
<tr>
<td>Customer Name:</td>
<td><input type="text" name="customerName"></td>
</tr>
<tr>
<td>Customer Type:</td>
<td><select name="customerType" style="width:160px">
<option value="select">--select--</option>
<option value="Seller">Seller</option>
<option value="Consumer">Consumer</option>
</select>
</td>
</tr>
<tr>
<td>Customer Email:</td>
<td><input type="text" name="customerEmail"></td>
</tr>
<tr>
<td>Customer Address:</td>
<td><textarea name="customerAddress"></textarea></td>
</tr>
<tr>
<td>Customer Mobile:</td>
<td><input type="text" name="customerMobile"></td>
</tr>
<tr>
<td>
<input type=submit value="Register"></td>
<td><input type="reset" value="Clear"/></td>
</tr>
</table>
</form>
</body>
</html>