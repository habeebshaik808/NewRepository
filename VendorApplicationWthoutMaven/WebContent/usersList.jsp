<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Data Management ::  </title>
</head>
<body>
<%@include file="master.jsp" %>
<h3><a href="registerUser.html">Add More Users</a></h3>
<c:choose>
<c:when test="${!empty users}">
<table align="left" border="1">
<tr bgcolor="pink">
     <th>UserName</th>
     <th>UserEmail</th>
     <th>UserMobileNumber</th>
     <th>Password</th>
     <th>ConfirmPassword</th>
     <th>Gender</th>
     <th>UserAddress</th>
     <th>Links</th>
 </tr>
 <c:forEach items="${users}" var="user">
 <tr>
 
 <td><c:out value="${user.userName}"/></td>
 <td><c:out value="${user.userEmail}"/></td>
 <td><c:out value="${user.userMobile}"/></td>
 <td><c:out value="${user.password}"/></td>
 <td><c:out value="${user.confirmPassword}"/></td>
 <td><c:out value="${user.gender}"/></td>
 <td><c:out value="${user.userAddress}"/></td>
 </tr>
 </c:forEach>
</table>
</c:when>
<c:otherwise>
<h2><font color=red >Sorry..!  Users Data is Not Available</font></h2>
</c:otherwise>
</c:choose>
</body>
</html>