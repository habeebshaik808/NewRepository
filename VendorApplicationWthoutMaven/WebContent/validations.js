function validateLocationForm()
{
	var id=document.locationForm.locationId.value;
	var name=document.locationForm.locationName.value;
	var sname=document.locationForm.supervisorName.value;
	var aname=document.locationForm.adviserName.value;
	var state=document.locationForm.state.value;
	var country=document.locationForm.country.value;
	var pin=document.locationForm.pinCode.value;
	var exp1=/^[1-9][0-9]*$/;
	var exp2=/^[A-Za-z]{2,15}$/;
	var exp3=/^[0-9]{6}$/;
	var flag=false;
	if(id=="")
	{
		document.getElementById("locationIdError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Location Id is required";
		flag=false;
	}
	else if(!(document.locationForm.locationId.value.match(exp1)))
	{
		
		document.getElementById("locationIdError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Id is not zero";
		flag=false;
	}
	else
	{
		 document.getElementById("locationIdError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
			 flag=true;
	}
	
	if(name=="")
	{
		document.getElementById("locationNameError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/>Location name is required";  
		flag=false;
	}
	else if(!(document.locationForm.locationName.value.match(exp2)))
	{
		document.getElementById("locationNameError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Location name in between 2 to 15 characters only";  
		flag=false;
	}
	else
	{
		 document.getElementById("locationNameError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
			 flag=true; 
	}
	
	if(document.locationForm.locationType[0].checked==false && document.locationForm.locationType[1].checked==false && document.locationForm.locationType[2].checked==false && document.locationForm.locationType[3].checked==false)
	{
		document.getElementById("locationTypeError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Choose any one location type";
		flag=false;
	}
	else
	{
	  document.getElementById("locationTypeError").innerHTML=
	 "<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
		  flag=true;
	}
	
	if(sname=="")
	{
		document.getElementById("supervisorNameError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/>Supervisor Name is required";
		flag=false;
	}
	else if(!(document.locationForm.supervisorName.value.match(exp2)))
	{
		
		document.getElementById("supervisorNameError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Supervisor name in between 2 to 15 characters only";
		flag=false;
	}
	else
	{
		 document.getElementById("supervisorNameError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
			 flag=true;
	}
	if(aname=="")
	{
		document.getElementById("adviserNameError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Advisor Name is required";
		flag=false;
	}
	else if(!(document.locationForm.adviserName.value.match(exp2)))
	{
		
		document.getElementById("adviserNameError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Adviser name in between 2 to 15 characters only";
		flag=false;
	}
	else
	{
		 document.getElementById("adviserNameError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
			 flag=true;
	}
	if(state=="")
	{
		document.getElementById("stateError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> State is required";
		flag=false;
	}
	else if(!(document.locationForm.state.value.match(exp2)))
	{
		
		document.getElementById("stateError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> State name in between 2 to 15 characters only";
		flag=false;
	}
	else
	{
		 document.getElementById("stateError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
			 flag=true;
	}
	if(country=="")
	{
		document.getElementById("countryError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/>Country Name is required";
		flag=false;
	}
	else if(!(document.locationForm.country.value.match(exp2)))
	{
		
		document.getElementById("countryError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Country name in between 2 to 15 characters only";
		flag=false;
	}
	else
	{
		 document.getElementById("countryError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
			 
	}
	if(pin=="")
	{
		document.getElementById("pincodeError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Pincode is required";
		flag=false;
	}
	else if(!(document.locationForm.pinCode.value.match(exp3)))
	{
		
		document.getElementById("pincodeError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> pincode is invalid";
		flag=false;
	}
	else
	{
		 document.getElementById("pincodeError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
		
	}
	
	return  flag;
}
function validateVendorForm()
{
	var id=document.vendorForm.vendorId.value;
	var name=document.vendorForm.vendorName.value;
	var email=document.vendorForm.vendorEmail.value;
	var exp1=/^[1-9][0-9]*$/;
	var exp2=/^[A-Za-z]{5,15}$/;
	var exp3=/^[A-Za-z0-9\_\-\.]+\@[A-Za-z]{3,9}\.[a-z\.]{2,6}$/;
	var flag=false;
	document.getElementById("vendorIdError").innerHTML="";
	document.getElementById("vendorNameError").innerHTML="";
	document.getElementById("vendorEmailError").innerHTML="";
	document.getElementById("locationError").innerHTML="";
	if(id=="")
	{
		document.getElementById("vendorIdError").innerHTML="<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Please enter  id";
		flag=false;
	}
	else if(!(document.vendorForm.vendorId.value.match(exp1)))
	{
		document.getElementById("vendorIdError").innerHTML="<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/>Id is not zero";
		flag=false;
	}
	else
	{
		document.getElementById("vendorIdError").innerHTML=" <img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
	     flag=true;
	}
	if(name=="")
	{
		document.getElementById("vendorNameError").innerHTML="<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Please enter name";
		flag=false;
	}
	else if(!(document.vendorForm.vendorName.value.match(exp2))&&!name==""){
		document.getElementById("vendorNameError").innerHTML="<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/>vendor Name in between 5 to 15 characters only";
		flag=false;
	}
	else
	{
		document.getElementById("vendorNameError").innerHTML=" <img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
	     
	}
	if(email=="")
	{
		document.getElementById("vendorEmailError").innerHTML="<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Please enter email";
		flag=false;
	}
	else if(!(document.vendorForm.vendorEmail.value.match(exp3)))
	{
		document.getElementById("vendorEmailError").innerHTML="<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/> Email id is not valid";
		flag=false;
	}
	else
	{
		document.getElementById("vendorEmailError").innerHTML=" <img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
	     
	}
	if(document.getElementById("locationInp").value==-1)
	{
	    document.getElementById("locationError").innerHTML=" <img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/>please select one location";
	    flag=false;
	}
	return flag;
}
function validateLoginForm()
{
	var username=document.loginForm.userEmail.value;
	var password=document.loginForm.password.value;
	if(username=="")
	{
		document.getElementById("userEmailError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/>  Username is required";
	}
	else
	{
		 document.getElementById("userEmailError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
	}
	if(password=="")
	{
		document.getElementById("passwordError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/unchecked.gif'/>  Password is required";
	}
	else
	{
		 document.getElementById("passwordError").innerHTML=
	"<img src='http://www.javatpoint.com/javascriptpages/images/checked.gif'/>"
	}
}