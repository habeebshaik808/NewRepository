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
<h2>Edit Location Data</h2>
<form action="updateLocation.html" method="POST"  name="locationForm" onsubmit="return validateLocationForm();">
<table>
<tr>
<td>Location Id:</td>
<td><input type=text name="locationId" value="${loc.locationId}" readonly=readonly></td>
</tr>
<tr>
<td>Location Name:</td>
<td><input type=text name="locationName" value="${loc.locationName}"><span id="locationNameError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Location Type:</td>
<td>
<c:choose>
<c:when test="${loc.locationType eq 'Urban'}">
<input type=radio name="locationType" value="Urban" checked="checked">Urban
<input type=radio name="locationType" value="Semi-Urban">Semi-Urban<br>
<input type=radio name="locationType" value="Rural">Rural
<input type=radio name="locationType" value="Semi-Rural">Semi-Rural
</c:when>
<c:when test="${loc.locationType eq 'Semi-Urban'}">
<input type=radio name="locationType" value="Urban">Urban
<input type=radio name="locationType" value="Semi-Urban" checked="checked">Semi-Urban<br>
<input type=radio name="locationType" value="Rural">Rural
<input type=radio name="locationType" value="Semi-Rural">Semi-Rural
</c:when>
<c:when test="${loc.locationType eq 'Rural'}">
<input type=radio name="locationType" value="Urban">Urban
<input type=radio name="locationType" value="Semi-Urban" >Semi-Urban<br>
<input type=radio name="locationType" value="Rural" checked="checked">Rural
<input type=radio name="locationType" value="Semi-Rural">Semi-Rural
</c:when>
<c:otherwise>
<input type=radio name="locationType" value="Urban">Urban
<input type=radio name="locationType" value="Semi-Urban">Semi-Urban<br>
<input type=radio name="locationType" value="Rural">Rural
<input type=radio name="locationType" value="Semi-Rural" checked="checked">Semi-Rural
</c:otherwise>
</c:choose><span id="locationTypeError" class="error" style="color:red"></span>
</td>
</tr>
<tr>
<td>Supervisor Name:</td>
<td><input type="text" name="supervisorName" value="${loc.supervisorName}"><span id="supervisorNameError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Adviser Name:</td>
<td><input type="text" name="advisorName" value="${loc.adviserName}"><span id="advisorNameError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>State:</td>
<td><input type="text" name="state" value="${loc.state}"><span id="stateError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Country:</td>
<td><input type="text" name="country" value="${loc.country}"><span id="countryError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Pin Code:</td>
<td><input type="text" name="pinCode" value="${loc.pinCode}"><span id="pincodeError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Update"/></td>
</tr>
</table>
</form>
</body>
</html>