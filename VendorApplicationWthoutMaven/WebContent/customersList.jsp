<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Data Management ::</title>
</head>
<body>
<%@include file="master.jsp" %>
<h3><a href="registerCustomer.html">Add More Customers</a></h3>
<c:choose>
<c:when test="${!empty customers}">
<table align="left" border="1">
<tr bgcolor="pink">
     <th>CustomerID</th>
     <th>CustomerName</th>
     <th>CustomerType</th>
     <th>CustomerEmail</th>
     <th>CustomerAddress</th>
     <th>CustomerMobile</th>
     <th>CustomerItems</th>
 </tr>
 <c:forEach items="${customers}" var="customer">
 <tr>
 <td><c:out value="${customer.customerId}"/></td>
 <td><c:out value="${customer.customerName}"/></td>
 <td><c:out value="${customer.customerType}"/></td>
 <td><c:out value="${customer.customerEmail}"/></td>
 <td><c:out value="${customer.customerAddress}"/></td>
 <td><c:out value="${customer.customerMobile}"/></td>
 <td align="center">
 <a href="showCustomerItems.html?id=${customer.customerId}">Show  All Customer Items</a>
 </td>
 </tr>
 </c:forEach>
</table>
</c:when>
<c:otherwise>
<h2><font color=red >Sorry..!  Customers Data is Not Available</font></h2>
</c:otherwise>
</c:choose>
</body>
</html>