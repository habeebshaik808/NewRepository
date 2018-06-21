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
<h3><a href="registerLocation.html">Add More Locations</a></h3>
<c:choose>
<c:when test="${!empty locations}">
<table align="left" border="1">
<tr bgcolor="pink">
     <th>LocationID</th>
     <th>LocationName</th>
     <th>LocationType</th>
     <th>SupervisorName</th>
     <th>AdviserName</th>
     <th>State</th>
     <th>country</th>
     <th>PinCode</th>
     <th>Links</th>
 </tr>
 <c:forEach items="${locations}" var="location">
 <tr>
 <td><c:out value="${location.locationId}"/></td>
 <td><c:out value="${location.locationName}"/></td>
 <td><c:out value="${location.locationType}"/></td>
 <td><c:out value="${location.supervisorName}"/></td>
 <td><c:out value="${location.adviserName}"/></td>
 <td><c:out value="${location.state}"/></td>
 <td><c:out value="${location.country}"/></td>
 <td><c:out value="${location.pinCode}"/></td>
 <td align="center">
 <a href="editLocation.html?id=${location.locationId}">Edit</a>
 <a href="deleteLocation.html?id=${location.locationId}">Delete</a>
 </td>
 </tr>
 </c:forEach>
</table><br><br><br><br><br><br>
<h4> <a href="excel.html">Excel Format</a>|<a href="pdf.html">PDF Format</a></h4>
</c:when>
<c:otherwise>
<h2><font color=red >Sorry.. ! Locations Data is Not Available</font></h2>
</c:otherwise>
</c:choose>
</body>
</html>