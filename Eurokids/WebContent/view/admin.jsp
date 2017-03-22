<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<!-- Bootstrap -->
	      <link href="css/bootstrap.css" rel="stylesheet">
      <link href="css/bootstrap.min.css" rel="stylesheet">
	  	  <link href="css/bootstrap-responsive.css" rel="stylesheet"/>
	  <link href="css/bootstrap-responsive.min.css" rel="stylesheet"/>
	<link href="css/font-awesome.css" rel="stylesheet" type="text/css">
         <script src="js/bootstrap.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
 <script src="js/jquery.js" type="text/javascript"></script>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  
  
  <script src="jquery-2.1.4.js"></script>
  <script src="jquery-2.1.4.min.js"></script>
  <script src="jquery-ui.js"></script>
  <script src="jquery-ui.min.js"></script>
  
  <script src="jquery/jquery.js"></script>
  <link rel="stylesheet" type="text/css" href="css/stylesheet.css"/>
</head>
<style>
.captchainput{
	width:355px;
	height: 30px;
	background:navy;
	color:white;
	border:2px solid white;
	padding:10px;
	
}
</style>
<body style="background-color:yellow">
	<div class="container">
		<div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 com-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Sign In</div>
					<div style="float:right; font-size:80%; position:relative; top=-10px"><a href="#">Forgot Password?</a></div>
					
					
				</div>
				<div style="padding-top:30px;" class="panel-body">
					<div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
					<form id="login" name="login" class="form-horizontal" method="POST" action="../login">
						<div style="margin-bottom:25px;" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
							<input id="login-username" placeholder="Username or Email ID" type="text" class="form-control" name="username">
						</div>
						<div style="margin-bottom:25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
							<input id="login-password" type="password" class="form-control" name="password" placeholder="password">
						</div>
						<div class="input-group">
							<div class="checkbox">
								<label>
									<input id="login-remember" type="checkbox" name="remember" value="1">Remember me
									
								</label>
							</div>
						</div>
						<div style="margin-top:10px"; class="form-group">
							<div class="col-sm-12 col-sm-offset-4 controls">
                                      <input class="btn btn-success btn-lg" type="submit" id="login" value="Login">
                                    </div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>