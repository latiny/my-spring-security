<html>
<head>
  <title>Home</title>
  <!-- Meta tags -->
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="keywords" content=""
	 />
  <script>
	 addEventListener("load", function () { setTimeout(hideURLbar, 0); }, false); function hideURLbar() { window.scrollTo(0, 1); }
  </script>
  <!-- Meta tags -->
  <!--stylesheets-->
  <link href="${pageContext.request.contextPath }/resources/css/style.css" rel='stylesheet' type='text/css' media="all">
  <!--//style sheet end here-->
  <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600,700" rel="stylesheet">
</head>
<body>
  <div class="mid-class">
	 <div class="art-right-w3ls">
		<h2>Sign In and Sign Up</h2>
		<form action="${pageContext.request.contextPath}/login" method="post">
		   <div class="main">
			  <div class="form-left-to-w3l">
				 <input type="text" name="name" placeholder="Username" required="">
			  </div>
			  <div class="form-left-to-w3l ">
				 <input type="password" name="password" placeholder="Password" required="">
				 <div class="clear"></div>
			  </div>
		   </div>
		   <div class="left-side-forget">
			  <input type="checkbox" class="checked">
			  <span class="remenber-me">Remember me </span>
		   </div>
		   <div class="right-side-forget">
			  <a href="#" class="for">Forgot password...?</a>
		   </div>
		   <div class="clear"></div>
		   <div class="btnn">
			  <button type="submit">Sign In</button>
		   </div>
		</form>
		<div class="w3layouts_more-buttn">
		   <h3>Don't have an account..?
			  <a href="#content1">Sign Up Here
			  </a>
		   </h3>
		</div>
		<!-- popup-->
		<div id="content1" class="popup-effect">
		   <div class="popup">
			  <!--login form-->
			  <div class="letter-w3ls">
				 <form action="#" method="post">
					<div class="form-left-to-w3l">
					   <input type="text" name="name" placeholder="Username" required="">
					</div>
					<div class="form-left-to-w3l">
					   <input type="text" name="name" placeholder="Phone" required="">
					</div>
					<div class="form-left-to-w3l">
					   <input type="email" name="email" placeholder="Email" required="">
					</div>
					<div class="form-left-to-w3l">
					   <input type="password" name="password" placeholder="Password" required="">
					</div>
					<div class="form-left-to-w3l margin-zero">
					   <input type="password" name="password" placeholder="Confirm Password" required="">
					</div>
					<div class="btnn">
					   <button type="submit">Sign Up</button>
					   <br>
					</div>
				 </form>
				 <div class="clear"></div>
			  </div>
			  <!--//login form-->
			  <a class="close" href="#">&times;</a>
		   </div>
		</div>
		<!-- //popup -->
	 </div>
	 <div class="art-left-w3ls">
		<h1 class="header-w3ls">
		   Gaze sign up & login Form
		</h1>
	 </div>
  </div>
  <footer class="bottem-wthree-footer">
	 <p>Copyright &copy; 2019.Company name All rights reserved.<a target="_blank" href="latiny">latiny</a></p>
  </footer>
</body>
</html>