<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Data Management ::</title>
<link rel="icon" type="image/png" href="icon.png"/>
</head>
<body>
 <%@include file="master.jsp"%>
 <c:choose>
<c:when test="${!empty chart}">
<img src="vendorPie.jpg"/>
<img src="vendorBar.jpg"/>
</c:when>
<c:otherwise>
<h2><font color=red >Sorry...! Vendors are not available</font></h2>
</c:otherwise>
</c:choose>
</body>
</html>