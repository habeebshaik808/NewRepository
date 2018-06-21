<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Data Management ::</title>
<link rel="icon" type="image/png" href="icon.png"/>
<link rel="stylesheet" type="text/css" href="common.css"></link>
<script type="text/javascript" src="validations.js"></script> 
 
</head>
<body>
<img src="banner.jpg" height=100px width=100%>
<ul>
  <li><a href="home.html">Home</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbutton">Location</a>
    <div class="dropdown-content">
      <a href="registerLocation.html">Location Registration</a>
      <a href="allLocations.html">All Locations</a>
    </div>
  </li>
<li class="dropdown">
    <a href="javascript:void(0)" class="dropbutton">Vendor</a>
    <div class="dropdown-content">
      <a href="registerVendor.html">Vendor Registration</a>
      <a href="allVendors.html">All Vendors</a>
    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbutton">Customer</a>
    <div class="dropdown-content">
      <a href="registerCustomer.html">Customer Registration</a>
      <a href="allCustomers.html">All Customers</a>
    </div>
  </li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbutton">Document</a>
    <div class="dropdown-content">
      <a href="showDocument.html">UploadFile</a>
      <a href="allDocuments.html">DownloadFile</a>
    </div>
  </li>
   <li class="dropdown">
    <a href="javascript:void(0)" class="dropbutton">Reports</a>
    <div class="dropdown-content">
      <a href="lreport.html">Locations Report</a>
      <a href="vreport.html">Vendors Report</a>
    </div>
  </li>
   <li class="dropdown">
    <a href="javascript:void(0)" class="dropbutton">User</a>
    <div class="dropdown-content">
   <!--   <a href="login.html">Sign In</a>
      <a href="registerUser.html">Sign Up</a>-->
      <a href="allUsers.html">All Users</a>
    </div>
  </li>
  <li class="dropdown">
  <div>
    <a href="userLogout.html">Log Out</a>
    </div>
  </li>
</ul>
</body>
</html>