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
<h2>Add Location Data</h2>
<form  action="saveLocation.html" method="POST" name="locationForm" onsubmit="return validateLocationForm();">
<table>
<tr>
<td>Location Id:</td>
<td><input type="text" name="locationId"><span id="locationIdError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Location Name:</td>
<td><input type="text" name="locationName"><span id="locationNameError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Location Type:</td>
<td><input type="radio" name="locationType" value="Urban">Urban
        <input type="radio" name="locationType" value="Semi-Urban">Semi-Urban<br>
        <input type="radio" name="locationType" value="Rural">Rural
        <input type="radio" name="locationType" value="Semi-Rural">Semi-Rural
<span id="locationTypeError" class="error" style="color:red"></span>
</td>
</tr>
<tr>
<td>Supervisor Name:</td>
<td><input type="text" name="supervisorName"><span id="supervisorNameError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Adviser Name:</td>
<td><input type="text" name="adviserName"><span id="adviserNameError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>State:</td>
<td><input type="text" name="state"><span id="stateError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Country:</td>
<td><input type="text" name="country"><span id="countryError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>Pin Code:</td>
<td><input type="text" name="pinCode"><span id="pincodeError" class="error" style="color:red"></span></td>
</tr>
<tr>
<td>
<input type=submit value="Register"></td><td><input type="reset" value="Clear"/></td>
</tr>
</table>
</form>
</body>
</html>