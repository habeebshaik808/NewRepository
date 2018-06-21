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
<h3><a href="registerVendor.html">Add More Vendors</a></h3>
<c:choose>
<c:when test="${!empty vendors}">
<table align="left" border="1">
<tr bgcolor="pink">
     <th>VendorID</th>
     <th>VendorName</th>
     <th>VendorEmail</th>
     <th>LocationName</th>
	 <th>LocationType</th> 
	 <th>SupervisorName</th>
     <th>AdviserName</th>
     <th>State</th>
     <th>country</th>
     <th>PinCode</th>
     <th>Links</th>
 </tr>
 <c:forEach items="${vendors}" var="vendor">
 <tr>
 <td><c:out value="${vendor.vendorId}"/></td>
 <td><c:out value="${vendor.vendorName}"/></td>
 <td><c:out value="${vendor.vendorEmail}"/></td>
 <td><c:out value="${vendor.location.locationName}" /></td>
 <td><c:out value="${vendor.location.locationType}" /></td> 
 <td><c:out value="${vendor.location.supervisorName}"/></td>
 <td><c:out value="${vendor.location.adviserName}"/></td>
 <td><c:out value="${vendor.location.state}"/></td>
 <td><c:out value="${vendor.location.country}"/></td>
 <td><c:out value="${vendor.location.pinCode}"/></td>
 <td align="center">
 <a href="editVendor.html?id=${vendor.vendorId}">Edit</a>
 <a href="deleteVendor.html?id=${vendor.vendorId}">Delete</a>
 </td>
 </tr>
 </c:forEach>
</table>
</c:when>
<c:otherwise>
<h2><font color=red >Sorry...! Vendors Data is Not Available</font></h2>
</c:otherwise>
</c:choose>
</body>
</html>