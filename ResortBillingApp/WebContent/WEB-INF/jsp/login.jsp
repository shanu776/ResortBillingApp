<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<title>LoginPage</title>
<style type="text/css">
body{
margin: 0px;
background-image: url("image/Beach-Resorts-Sunset-HD-Wallpapers.jpg");
background-size: cover;
}
.loginDiv{
margin-top:150px;
margin-left:32%;
width:35%;
height:300px;
border:2px groove rgba(0,0,0,0.3);
border-radius:10px;
background: rgba(0,0,0,0.7);
}
#usr{
margin-left:20%;
margin-top:30px;
width:60%;
height:40px;
font-size:17px;
color:white;
background: transparent;
border-color: white;
}
#loginButton{
margin-top:25px;
margin-left: 38%;
width: 25%;
background:rgba(255,255,255,0.8);
}

input::-webkit-input-placeholder {
color: white !important;
}
 
input:-moz-placeholder { /* Firefox 18- */
color: white !important;  
}
 
input::-moz-placeholder {  /* Firefox 19+ */
color: white !important;  
}
 
input:-ms-input-placeholder {  
color: white !important;  
}
</style>
</head>
<body>
<form action="">
<div class="loginDiv"> 
	<div class="form-group" style="margin-top:60px;">    
   		<input id="usr" type="text" class="form-control" name="email" placeholder="Email">
  	</div>
  	<div class="form-group">    
    	<input id="usr" type="password" class="form-control" name="password" placeholder="Password">
  	</div>	
  	<div class="form-group">    
    	<input id="loginButton" type="submit" class="btn btn-default" name="password" placeholder="Password">
  	</div>	
</div>
</form>
</body>
</html>