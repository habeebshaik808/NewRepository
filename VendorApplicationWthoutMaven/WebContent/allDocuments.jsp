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
<h3><a href="showDocument.html">Add More Documents</a></h3>
<c:choose>
<c:when test="${!empty documents}">
<table border="1">
<tr bgcolor="pink">
	<th>fileId</th>
	<th>fileName</th>
	<th>link</th>
</tr>
<c:forEach items="${documents}" var="document">
<tr>
<td><c:out value="${document[0]}"/></td>
<td><c:out value="${document[1]}"/></td>
<td><a href="download.html?id=${document[0]}">Download</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h2><font color=red >Sorry..! Files are Not Available</font></h2>
</c:otherwise>
</c:choose>
</body>
</html>