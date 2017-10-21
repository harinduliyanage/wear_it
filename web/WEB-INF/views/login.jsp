<%-- 
    Document   : login
    Created on : Oct 4, 2017, 7:35:07 PM
    Author     : Harindu.sul
--%>

<%@page import="com.ijse.wearit.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>  
<title>Login Page</title>
<link rel="shortcut icon" href="<c:url value="resources/images/titleIcon.ico" /> "/>
<link href="<c:url value="resources/css/css-a/bootstrap.css" />" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<!--theme-style-->
<link href="<c:url value="resources/css/css-a/style.css" />" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--theme-style-->
<link href="<c:url value="resources/css/css-a/style4.css" />" rel="stylesheet" type="text/css" media="all" />	
<link href="<c:url value="resources/css/css-a/bootstrap.css" />" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<script src="<c:url value="resources/js/js-a/jquery.min.js" />"></script>
<!--- start-rate---->
<script src="<c:url value="resources/js/js-a/jstarbox.js" />"></script>
	<link rel="stylesheet" href="<c:url value="resources/css/css-a/jstarbox.css" />" type="text/css" media="screen" charset="utf-8" />
	 <style>
                            .loader {
                                border: 7px solid #f3f3f3; /* Light grey */
                                border-top: 7px solid #F47983; /* Blue */
                                border-radius: 50%;
                                width: 40px;
                                height: 40px;
                                animation: spin 2s linear infinite;
                            }

                                @keyframes spin {
                                    0% { transform: rotate(0deg); }
                                    100% { transform: rotate(360deg); }
                                }
                        </style>	
        
        <script type="text/javascript">
			jQuery(function() {
			jQuery('.starbox').each(function() {
				var starbox = jQuery(this);
					starbox.starbox({
					average: starbox.attr('data-start-value'),
					changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,
					ghosting: starbox.hasClass('ghosting'),
					autoUpdateAverage: starbox.hasClass('autoupdate'),
					buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,
					stars: starbox.attr('data-star-count') || 5
					}).bind('starbox-value-changed', function(event, value) {
					if(starbox.hasClass('random')) {
					var val = Math.random();
					starbox.next().text(' '+val);
					return val;
					} 
				})
			});
		});
		</script>
<!---//End-rate---->
</head>
<body>
    <%
        User user=(User) session.getAttribute("currentUser");
    %>
<!--header-->
<div class="header">
<div class="container">
		<div class="head">
			<div class=" logo">
				<a href="index.jsp"><img src="<c:url value="resources/images/logo.png" />" alt=""></a>	
			</div>
		</div>
	</div>
	<div class="header-top">
		<div class="container">
		<div class="col-sm-5 col-md-offset-2  header-login">
					<ul><% 
                                            if(user!=null){
                                            %>
						<li><a><%=user.getUserName() %></a></li>
						<li><a id="log-out-btn">Log Out</a></li>
                                                <li><a href="checkout?userName=<%=user.getUserName() %>">Checkout</a></li>
                                              <% }else{%>
                                                    <li><a href="login">Log In</a></li>
                                                    <li><a href="register">Register</a></li>
						
                                              <%
                                                }
                                               %>      
					</ul>
				</div>
				
			<div class="col-sm-5 header-social">		
					<ul >
						<li><a href="#"><i></i></a></li>
						<li><a href="#"><i class="ic1"></i></a></li>
						<li><a href="#"><i class="ic2"></i></a></li>
						<li><a href="#"><i class="ic3"></i></a></li>
						<li><a href="#"><i class="ic4"></i></a></li>
					</ul>
					
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		
		<div class="container">
		
			<div class="head-top">
			
		 <div class="col-sm-8 col-md-offset-2 h_menu4">
				<nav class="navbar nav_bottom" role="navigation">
 
 <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header nav_2">
      <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     
   </div> 
   <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
        <ul class="nav navbar-nav nav_1">
            <li><a class="color" href="index.jsp">Home</a></li>
            
    		<li class="dropdown mega-dropdown active">
			    <a class="color1" href="#" class="dropdown-toggle" data-toggle="dropdown">Women<span class="caret"></span></a>				
				<div class="dropdown-menu ">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu1</h4>
									<ul>
										<li><a href="product">Accessories</a></li>
										<li><a href="product">Bags</a></li>
										<li><a href="product">Caps & Hats</a></li>
										<li><a href="product">Hoodies & Sweatshirts</a></li>
										
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu2</h4>
								<ul>
										<li><a href="product">Jackets & Coats</a></li>
										<li><a href="product">Jeans</a></li>
										<li><a href="product">Jewellery</a></li>
										<li><a href="product">Jumpers & Cardigans</a></li>
										<li><a href="product">Leather Jackets</a></li>
										<li><a href="product">Long Sleeve T-Shirts</a></li>
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu3</h4>
									<ul>
										<li><a href="product">Shirts</a></li>
										<li><a href="product">Shoes, Boots & Trainers</a></li>
										<li><a href="product">Sunglasses</a></li>
										<li><a href="product">Sweatpants</a></li>
										<li><a href="product">Swimwear</a></li>
										<li><a href="product">Trousers & Chinos</a></li>
										
									</ul>	
								
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu4</h4>
								<ul>
									<li><a href="product">T-Shirts</a></li>
									<li><a href="product">Underwear & Socks</a></li>
									<li><a href="product">Vests</a></li>
									<li><a href="product">Jackets & Coats</a></li>
									<li><a href="product">Jeans</a></li>
									<li><a href="product">Jewellery</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1 col5">
						<img src="<c:url value="resources/images/me.png" />" class="img-responsive" alt="">
						</div>
						<div class="clearfix"></div>
					</div>                  
				</div>				
			</li>
			<li class="dropdown mega-dropdown active">
			    <a class="color2" href="#" class="dropdown-toggle" data-toggle="dropdown">Men<span class="caret"></span></a>				
				<div class="dropdown-menu mega-dropdown-menu">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu1</h4>
									<ul>
										<li><a href="product">Accessories</a></li>
										<li><a href="product">Bags</a></li>
										<li><a href="product">Caps & Hats</a></li>
										<li><a href="product">Hoodies & Sweatshirts</a></li>
										
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu2</h4>
								<ul>
										<li><a href="product">Jackets & Coats</a></li>
										<li><a href="product">Jeans</a></li>
										<li><a href="product">Jewellery</a></li>
										<li><a href="product">Jumpers & Cardigans</a></li>
										<li><a href="product">Leather Jackets</a></li>
										<li><a href="product">Long Sleeve T-Shirts</a></li>
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu3</h4>
								
<ul>
										<li><a href="product">Shirts</a></li>
										<li><a href="product">Shoes, Boots & Trainers</a></li>
										<li><a href="product">Sunglasses</a></li>
										<li><a href="product">Sweatpants</a></li>
										<li><a href="product">Swimwear</a></li>
										<li><a href="product">Trousers & Chinos</a></li>
										
									</ul>	
								
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Submenu4</h4>
								<ul>
									<li><a href="product">T-Shirts</a></li>
									<li><a href="product">Underwear & Socks</a></li>
									<li><a href="product">Vests</a></li>
									<li><a href="product">Jackets & Coats</a></li>
									<li><a href="product">Jeans</a></li>
									<li><a href="product">Jewellery</a></li>
								</ul>	
							</div>							
						</div>
						<div class="col1 col5">
						<img src="<c:url value="resources/images/me1.png" />" class="img-responsive" alt="">
						</div>
						<div class="clearfix"></div>
					</div>                  
				</div>				
			</li>
			<li><a class="color3" href="product">Sale</a></li>
			<li><a class="color4" href="404">About</a></li>
            <li><a class="color5" href="typo">Short Codes</a></li>
            <li ><a class="color6" href="contact">Contact</a></li>
        </ul>
     </div><!-- /.navbar-collapse -->

</nav>
			</div>
			<div class="col-sm-2 search-right">
				<ul class="heart">
				<li>
				<a href="wishlist" >
				<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
				</a></li>
				<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i class="glyphicon glyphicon-search"> </i></a></li>
					</ul>
					<div class="cart box_1">
						<a href="checkout">
						<h3> <div class="total">
							<span class="simpleCart_total"></span></div>
							<img src="<c:url value="resources/images/cart.png" />" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
					
						<!----->

						<!---pop-up-box---->					  
			<link href="<c:url value="resources/css/css-a/popuo-box.css" />" rel="stylesheet" type="text/css" media="all"/>
			<script src="<c:url value="resources/js/js-a/jquery.magnific-popup.js" />" type="text/javascript"></script>
			<!---//pop-up-box---->
			<div id="small-dialog" class="mfp-hide">
				<div class="search-top">
					<div class="login-search">
						<input type="submit" value="">
						<input type="text" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search..';}">		
					</div>
					<p>Shopin</p>
				</div>				
			</div>
		 <script>
			$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
			type: 'inline',
			fixedContentPos: false,
			fixedBgPos: true,
			overflowY: 'auto',
			closeBtnInside: true,
			preloader: false,
			midClick: true,
			removalDelay: 300,
			mainClass: 'my-mfp-zoom-in'
			});
																						
			});
		</script>		
						<!----->
			</div>
			<div class="clearfix"></div>
		</div>	
	</div>	                      
</div>
<!--login-->
<div class="container">
		<div class="login">
		
			<form id="login-form">
			<div class="col-md-6 login-do">
				<div class="login-mail">
					<input type="text" id="login-userName" placeholder="Email" required="" pattern="^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$" title="Enter valid Email Pattern">
					<i  class="glyphicon glyphicon-envelope"></i>
				</div>
				<div class="login-mail">
					<input type="password" id="login-pw" placeholder="Password" required="">
					<i class="glyphicon glyphicon-lock"></i>
				</div>
				   <a class="news-letter " href="#">
						 <label class="checkbox1"><input type="checkbox" name="checkbox" ><i> </i>Forget Password</label>
				 </a>
                            <div class="row">
                                <div class="col-md-3">
                                    <label class="hvr-skew-backward">
					<input type="submit" value="login">
                                    </label>
                                </div>
                                <div id="loaderDiv" style="margin-left: 100px; display: none" class="loader"></div>
                            </div>
                            <div style="margin-top: 7px;"></div>
                                <div class="alert" id="danger-alert" style="display: none; color: white;background-color: #F22613;">
                                    <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span> 
                                    <strong>Sign up Faild!</strong> User Name and Password Incorrect...!
                                </div>
                                <div class="alert-success" id="success-alert" style="display: none; color: white;background-color: #26A65B;">
                                    <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span> 
                                    <strong>Log In Successfully..!</strong> 
                                </div>
				
                                
			</div>
			<div class="col-md-6 login-right">
				 <h3>Completely Free Account</h3>
				 
				 <p>Pellentesque neque leo, dictum sit amet accumsan non, dignissim ac mauris. Mauris rhoncus, lectus tincidunt tempus aliquam, odio 
				 libero tincidunt metus, sed euismod elit enim ut mi. Nulla porttitor et dolor sed condimentum. Praesent porttitor lorem dui, in pulvinar enim rhoncus vitae. Curabitur tincidunt, turpis ac lobortis hendrerit, ex elit vestibulum est, at faucibus erat ligula non neque.</p>
				<a href="register" class=" hvr-skew-backward">Register</a>

			</div>
			
			<div class="clearfix"> </div>
			</form>
		</div>

</div>

<!--//login-->

			<!--brand-->
		<div class="container">
			<div class="brand">
				<div class="col-md-3 brand-grid">
					<img src="<c:url value="resources/images/ic.png" />" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="<c:url value="resources/images/ic1.png" />" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="<c:url value="resources/images/ic2.png" />" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="<c:url value="resources/images/ic3.png" />" class="img-responsive" alt="">
				</div>
				<div class="clearfix"></div>
			</div>
			</div>
			<!--//brand-->
		
	<!--//content-->
		<!--//footer-->
                <div class="footer">
	<div class="footer-middle">
				<div class="container">
					<div class="col-md-3 footer-middle-in">
						<a href="index.jsp"><img src="<c:url value="resources/images/logo.png" />" alt=""></a>
						<p>Suspendisse sed accumsan risus. Curabitur rhoncus, elit vel tincidunt elementum, nunc urna tristique nisi, in interdum libero magna tristique ante. adipiscing varius. Vestibulum dolor lorem.</p>
					</div>
					
					<div class="col-md-3 footer-middle-in">
						<h6>Information</h6>
						<ul class=" in">
							<li><a href="404">About</a></li>
							<li><a href="contact">Contact Us</a></li>
							<li><a href="#">Returns</a></li>
							<li><a href="contact">Site Map</a></li>
						</ul>
						<ul class="in in1">
							<li><a href="#">Order History</a></li>
							<li><a href="wishlist">Wish List</a></li>
							<li><a href="login">Login</a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="col-md-3 footer-middle-in">
						<h6>Tags</h6>
						<ul class="tag-in">
							<li><a href="#">Lorem</a></li>
							<li><a href="#">Sed</a></li>
							<li><a href="#">Ipsum</a></li>
							<li><a href="#">Contrary</a></li>
							<li><a href="#">Chunk</a></li>
							<li><a href="#">Amet</a></li>
							<li><a href="#">Omnis</a></li>
						</ul>
					</div>
					<div class="col-md-3 footer-middle-in">
						<h6>Newsletter</h6>
						<span>Sign up for News Letter</span>
							<form>
								<input type="text" value="Enter your E-mail" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='Enter your E-mail';}">
								<input type="submit" value="Subscribe">	
							</form>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="footer-bottom">
				<div class="container">
					<ul class="footer-bottom-top">
						<li><a href="#"><img src="<c:url value="resources/images/f1.png" />" class="img-responsive" alt=""></a></li>
						<li><a href="#"><img src="<c:url value="resources/images/f2.png" />" class="img-responsive" alt=""></a></li>
						<li><a href="#"><img src="<c:url value="resources/images/f3.png" />" class="img-responsive" alt=""></a></li>
					</ul>
					<p class="footer-class">&copy; 2017 Shopin. All Rights Reserved | Design by  <strong><a href="https://www.linkedin.com/in/amandi-imasha-7427a6145/">Amandi Imasha</a></strong> </p>
					<div class="clearfix"> </div>
				</div>
			</div>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		</div>
		<!--//footer-->

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

	<script src="<c:url value="resources/js/js-a/jquery.magnific-popup.js" />"> </script>
	<script src="<c:url value="resources/js/jquery-2.1.3.min.js" />"> </script>
	<script src="<c:url value="resources/js/dom-login.js" />"> </script>
<!-- slide -->
<script src="<c:url value="resources/js/js-a/jquery.magnific-popup.js" />"></script>
 <script type="text/javascript">
    (function () {
        var options = {
            facebook: "wearyourownstorys/?ref=page_internal", // Facebook page ID
            company_logo_url: "//scontent.xx.fbcdn.net/v/t1.0-1/p50x50/22552778_1989154664707640_6925793142617653314_n.png?oh=4d49540b2ac89984e245f34be6063ef2&oe=5A81E171", // URL of company logo (png, jpg, gif)
            greeting_message: "Hello, how may we help you? Just send us a message now to get assistance.", // Text of greeting message
            call_to_action: "Message us", // Call to action
            position: "right", // Position may be 'right' or 'left'
        };
        var proto = document.location.protocol, host = "whatshelp.io", url = proto + "//static." + host;
        var s = document.createElement('script'); s.type = 'text/javascript'; s.async = true; s.src = url + '/widget-send-button/js/init.js';
        s.onload = function () { WhWidgetSendButton.init(host, proto, options); };
        var x = document.getElementsByTagName('script')[0]; x.parentNode.insertBefore(s, x);
    })();
</script>
</body>
</html> 
