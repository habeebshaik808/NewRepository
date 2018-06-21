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
<h2>Add Vendor Data</h2>
<form  action="saveVendor.html" method="POST" name="vendorForm" onsubmit="return validateVendorForm();" enctype="multipart/form-data">
<table>
<tr>
<td>Vendor Id:</td>
<td><input type="text" name="vendorId"><span id="vendorIdError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Vendor Name:</td>
<td><input type="text" name="vendorName"><span id="vendorNameError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Vendor Email:</td>
<td><input type="text" name="vendorEmail"><span id="vendorEmailError" class="error" style="color:red"></span></td>
</tr> 
<tr>
<td>Location:</td>
<td><select name="location.locationId" style="width:160px" id="locationInp" >
		<option value="-1">--select--</option>
		<c:forEach items="${locations}" var="location">
		<option value="${location.locationId}"><c:out value="${location.locationName}"/></option>
		</c:forEach>
		</select><span id="locationError" style="color:red"></span>
</td>
</tr>
<tr>
<td>File:</td>
<td><input type="file" name="fileObj"></td>
</tr> 
<tr>
<td><input type=submit value="Register"></td><td><input type="reset" value="Clear"/></td>
</tr>
</table>
</form>
</body>
</html>