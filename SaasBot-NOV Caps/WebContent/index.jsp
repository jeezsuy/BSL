
<!DOCTYPE html>
<html>
<head>
<title>Birlasoft OCUCT Test Engine</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords" content="Slide Login Form template Responsive, Login form web template, Flat Pricing tables, Flat Drop downs Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

	 <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>

	<!-- Custom Theme files -->
	<link href="css2/style.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css2/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

	<!-- //Custom Theme files -->

	<!-- web font -->


</head>
<body>

<!-- main -->
<div class="w3layouts-main"> 
	<div class="bg-layer"><br>
				<center><img src="images/logo.png" width="300px" height="67px"></center>
<h1> Ocust Test Engine Login</h1>
		<div class="header-main">
			<div class="main-icon">
			</div>
			<div class="header-left-bottom">
				<form>
					<div class="icon1 wthree-field">
						<span class="fa fa-user"></span>
						<input style="background:transparent; border:none;box-sizing: border-box;" type="text" id="txtempname" placeholder="User Name" value	 required=""/>
					</div>
					<div class="icon1">
						<span class="fa fa-lock"></span>
						<input type="password" id="txtdesignation" placeholder="Password" required=""/>
					</div>

					<div class="bottom">
						<button onclick="login();" class="btn">Log In</button>
					</div>
					<div class="links">
						<p><a href="#">Forgot Password?</a></p>
						<p class="right"><a href="#">New User? Register</a></p>
						<div class="clear"></div>
					</div>
				</form>	
			</div>
			
		</div>
		
		<!-- copyright -->
		<div class="footer">
		<p>&copy; BIRLASOFT LIMITED. All Rights Reserved  <a href="#">BIRLASOFT</a></p>
	</div>
		<!-- //copyright --> 
	</div>
</div>	
<!-- //main -->

<script>

function login(){

	var uName = $('#txtempname').val();
	var paswd = $('#txtdesignation').val();

	if(uName==="admin" && paswd==="ocust"){
		window.open("home.html")
	
	}
	else{
	alert("Invalid Credentials");
	}
}

</script>

</body>
</html>