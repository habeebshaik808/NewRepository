<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>:: Data Management :: </title>
<style>
      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
      @import url(http://fonts.googleapis.com/css?family=Exo:100,200,400);
@import url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300);

body{
	margin: 0;
	padding: 0;
	background: #fff;

	color: #fff;
	font-family: Arial;
	font-size: 12px;
}

.body{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background-image: url(http://ginva.com/wp-content/uploads/2012/07/city-skyline-wallpapers-008.jpg);
	background-size: cover;
	-webkit-filter: blur(1px);
	z-index: 0;
}

.grad{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(0,0,0,0)), color-stop(100%,rgba(0,0,0,0.65))); /* Chrome,Safari4+ */
	z-index: 1;
	opacity: 0.7;
}

.header{
	position: absolute;
	top: calc(50% - 35px);
	left: calc(50% - 230px);
	z-index: 2;
}
.header1{
	position: absolute;
	top: calc(50% - 180px);
	left: calc(50% - 35px);
	z-index: 2;
	color:blue;
}

.header div{
	float: left;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 25px;
	font-weight: 200;
}

.header div span{
	color: #ff00ff !important;
}

.login{
	position: absolute;
	top: calc(50% - 105px);
	left: calc(50% - 50px);
	height: 150px;
	width: 350px;
	padding: 5px;
	z-index: 2;
}

.login input[type=text]{
    width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

.login input[type=password]{
	width: 250px;
	height: 30px;
	background: transparent;
	border: 1px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	margin-top: 10px;
}

.login input[type=submit]{
	width: 260px;
	height: 35px;
	background: #fff;
	border: 1px solid #fff;
	cursor: pointer;
	border-radius: 2px;
	color: #a18d6c;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
}

.login input[type=submit]:hover{
	opacity: 0.8;
}

.login input[type=submit]:active{
	opacity: 0.6;
}

.login input[type=text]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}

.login input[type=password]:focus{
	outline: none;
	border: 1px solid rgba(255,255,255,0.9);
}

.login input[type=submit]:focus{
	outline: ff0000;
}

::-webkit-input-placeholder{
   color: rgba(255,255,255,0.6);
}

::-moz-input-placeholder{
   color: rgba(255,255,255,0.6);
}
#gender1,#gender2{width:30px;}
    </style>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
<link rel="icon" type="image/png" href="icon.png"/>
</head>

<body>
  <div class="body"></div>
		<div class="grad"></div>
		<div class="header1">
		<h1>Please Register Here</h1>
		</div>
		<div class="header">
		<div class="header">Vendor<span>Data</span>Management</div>
		</div>
		<br>
		<div class="login">
		
		<form  action="saveUser.html" method="POST">
		<table>
		  <tr><td><input type="text" placeholder="username" name="userName"></td></tr>
		<tr><td>  <input type="text" placeholder="useremail" name="userEmail">@gmail.com</td></tr>			
		  <tr><td><input type="text" placeholder="mobile number" name="userMobile"></td></tr>		
		  <tr><td><input type="password" placeholder="create a password" name="password"></td></tr>
		  <tr><td><input type="password" placeholder="confirm your password" name="confirmPassword"></td></tr>
		  <tr><td><input type="radio" id="gender1" name="gender" value="male"/>Male 
          <input type="radio" id="gender2" name="gender" value="female"/>Female</td></tr>
          <tr><td><input type="text" placeholder="address" name="userAddress"></td></tr>
		  <tr><td><input type="submit" value="Register"></td></tr>
		  </table>
		</form>
		
		<div><h2>Already Member?<a href="/VendorProject">Sign In</a></h2></div>
		</div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
</body>
</html>


<!--<h2>Add User Data</h2>
<form  action="saveUser.html" method="POST">
<table>
<tr>
<td>User Id:</td>
<td><input type="text" name="userId"></td>
</tr>
<tr>
<td>User Name:</td>
<td><input type="text" name="userName"></td>
</tr>
<tr>
<td>User Email:</td>
<td><input type="text" name="userEmail"></td>
</tr> 
<tr>
<td>User Mobile No:</td>
<td><input type="text" name="userMobile"></td>
</tr> 
<tr>
<td>User Address:</td>
<td><textarea name="userAddress"></textarea></td>
</tr> 
<tr>
<td colspan=1><input type=submit value="Register"></td>
<td><input type=reset value="Clear"></td>
</tr>
</table>
</form>
</body>
</html>  -->