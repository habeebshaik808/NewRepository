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
<h2>Add Documents</h2>
<form action="uploadDocument.html" method="POST" enctype="multipart/form-data">
<table>
<tr>
<td>DocumentId:</td>
 <td><input type="text" name="fid"/> </td>
 </tr>
 <tr>
 <td>Document:</td> 
<td><input type="file" name="filedetails"/></td>
</tr>
<tr>
<td><input type="submit" value="Upload"/></td> 
</tr>
</table>
</form>
</body>
</html>