<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Data Management ::</title>
</head>
<body>
<%@include file="master.jsp" %>
<h2>Items of Customer:${name}</h2>
<c:choose>
<c:when test="${!empty items}">
<table align="left" border="1">
<tr bgcolor="pink">
 <th>ItemId</th>
 <th>ItemName</th>
 <th>ItemCost</th>
</tr>
<c:forEach items="${items}" var="item">
<tr>
<td><c:out value="${item.itemId}"/></td>
<td><c:out value="${item.itemName}"/></td>
<td><c:out value="${item.itemCost}"/></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h2><font color=red >Sorry..!  Items are not there for the Customer:${name}?</font></h2>
</c:otherwise>
</c:choose>
</body>
</html>