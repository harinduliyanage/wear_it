<%-- 
    Document   : single
    Created on : Oct 4, 2017, 8:10:35 PM
    Author     : Harindu.sul
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.ijse.wearit.model.ItemDetails"%>
<%@page import="com.ijse.wearit.model.Item"%>
<%@page import="com.ijse.wearit.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>single</title>
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
<!--//theme-style-->
<script src="<c:url value="resources/js/js-a/jquery.min.js" />"></script>
<!--- start-rate---->
<script src="<c:url value="resources/js/js-a/jstarbox.js" />"></script>
	<link rel="stylesheet" href="<c:url value="resources/css/css-a/jstarbox.css" />" type="text/css" media="screen" charset="utf-8" />
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
<link href="<c:url value="resources/css/css-a/form.css" />" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<%
    User user=(User) session.getAttribute("currentUser");
    Item item=(Item) session.getAttribute("currentItem");
    ArrayList<ItemDetails> itemDetatailList = (ArrayList<ItemDetails>)session.getAttribute("currentItemDetails");
    
%>
<!--header-->
<div class="header">
<div class="container">
		<div class="head">
			<div class=" logo">
                            <a href="index.jsp"><img src="<c:url value="resources/images/logo.png"/>" alt=""></a>	
			</div>
		</div>
	</div>
	<div class="header-top">
		<div class="container">
		<div class="col-sm-5 col-md-offset-2  header-login">
					<ul ><% 
                                            if(user!=null){
                                            %>
						<li><a id="userLog"><%=user.getUserName() %></a></li>
						<li><a id="log-out-btn">Log Out</a></li>
                                                
                                              <% }else{%>
                                                    <li><a id="userLog" href="login">Log In</a></li>
                                                    <li><a href="register">Register</a></li>
                                              <%
                                                }
                                               %>         
						
						<li><a href="checkout">Checkout</a></li>
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
						<img src="<c:url value="resources/images/me.png"/>" class="img-responsive" alt="">
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
						<img src="<c:url value="resources/images/me1.png"/>" class="img-responsive" alt="">
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
							<img src="<c:url value="resources/images/cart.png"/>" alt=""/></h3>
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
<!--banner-->
<div class="single">
 <!--Wana Dinamic-->   
<div class="container">
<div class="col-md-9">
	<div class="col-md-5 grid">		
		<div class="flexslider">
			  <ul class="slides">
			    <li data-thumb="<c:url value="<%=item.getPaths()%>"/>">
			       <div class="thumb-image"> <img src="<c:url value="<%=item.getPaths()%>"/>" data-imagezoom="true" class="img-responsive"> </div>
			    </li> 
			    <li data-thumb="<c:url value="<%=item.getPaths()%>"/>">
			         <div class="thumb-image"> <img src="<c:url value="<%=item.getPaths()%>"/>" data-imagezoom="true" class="img-responsive"> </div>
			    </li>
			    <li data-thumb="<c:url value="<%=item.getPaths()%>"/>">
			       <div class="thumb-image"> <img src="<c:url value="<%=item.getPaths()%>"/>" data-imagezoom="true" class="img-responsive"> </div>
			    </li> 
			  </ul>
		</div>
	</div>	
<div class="col-md-7 single-top-in">
	<div class="span_2_of_a1 simpleCart_shelfItem">
				<h3><%=item.getDescription() %></h3>
				<p class="in-para">Select Size</p>
			    <div class="price_single">
                                <div class="login-mail">
                                    <select id="combo-sizeName" class="form-control">
                                        <% if(itemDetatailList != null){ %>
                                            <%for(ItemDetails itemDetails : itemDetatailList){%>
                                            <option value="<%=itemDetails.getSizes().getSizes() %>"> <%=itemDetails.getSizes().getSizes() %></option>
                                            <%}%>
                                        <% }%>
                                    </select>
				</div>
                                    <div class="login-mail"><label>Available Qty</label>
                                    <input id="text-qtyOnHand" type="text" class="form-control" readonly=""/>    
                                </div>    
                                        <span class="reducedfrom item_price">Price:Rs<label id="unitPrice-txt-size"></label></span>
				 <a href="#">click for offer</a>
				 <div class="clearfix"></div>
				</div>
				<h4 class="quick">Quick Overview:</h4>
				<p id="aaaaaaaa" class="quick_desc"><%=item.getDescription() %></p>
			    <div class="wish-list">
				 	<ul>
                                            <li class="wish"><a href="#"><span class="glyphicon glyphicon-check" aria-hidden="true"></span>Add to Wishlist</a></li>
				 	    <li class="compare"><a href="#"><span class="glyphicon glyphicon-resize-horizontal" aria-hidden="true"></span>Add to Compare</a></li>
				 	</ul>
				 </div>
				 <div class="quantity"> 
								<div class="quantity-select">                           
									<div class="entry value-minus">&nbsp;</div>
									<div class="entry value"><span id="orderQty">1</span></div>
									<div class="entry value-plus active">&nbsp;</div>
								</div>
							</div>
							<!--quantity-->
	<script>
    $('.value-plus').on('click', function(){
    	var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)+1;
    	divUpd.text(newVal);
    });

    $('.value-minus').on('click', function(){
    	var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)-1;
    	if(newVal>=1) divUpd.text(newVal);
    });
	</script>
	<!--quantity-->
				 
        <button type="button" id="addToCartButton" class="add-to item_add hvr-skew-backward">Add to cart</button>
			<div class="clearfix"> </div>
			</div>
		
					</div>
			<div class="clearfix"> </div>
			<!---->
			<div class="tab-head">
			 <nav class="nav-sidebar">
		<ul class="nav tabs">
          <li class="active"><a href="#tab1" data-toggle="tab">Product Description</a></li>
          <li class=""><a href="#tab2" data-toggle="tab">Additional Information</a></li> 
          <li class=""><a href="#tab3" data-toggle="tab">Reviews</a></li>  
		</ul>
	</nav>
	<div class="tab-content one">
<div class="tab-pane active text-style" id="tab1">
 <div class="facts">
									  <p > There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined </p>
										<ul>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Research</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Design and Development</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Porting and Optimization</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>System integration</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Verification, Validation and Testing</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Maintenance and Support</li>
										</ul>         
							        </div>

</div>
<div class="tab-pane text-style" id="tab2">
	
									<div class="facts">									
										<p > Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections </p>
										<ul >
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Multimedia Systems</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Digital media adapters</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Set top boxes for HDTV and IPTV Player  </li>
										</ul>
							        </div>	

</div>
<div class="tab-pane text-style" id="tab3">

									 <div class="facts">
									  <p > There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined </p>
										<ul>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Research</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Design and Development</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Porting and Optimization</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>System integration</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Verification, Validation and Testing</li>
											<li><span class="glyphicon glyphicon-ok" aria-hidden="true"></span>Maintenance and Support</li>
										</ul>     
							     </div>	

 </div>
  
  </div>
  <div class="clearfix"></div>
  </div>
			<!---->	
</div>
<!----->

<div class="col-md-3 product-bottom product-at">
			<!--categories-->
				<div class=" rsidebar span_1_of_left">
						<h4 class="cate">Categories</h4>
							 <ul class="menu-drop">
							<li class="item1"><a href="#">Men </a>
								<ul class="cute">
									<li class="subitem1"><a href="product">Cute Kittens </a></li>
									<li class="subitem2"><a href="product">Strange Stuff </a></li>
									<li class="subitem3"><a href="product">Automatic Fails </a></li>
								</ul>
							</li>
							<li class="item2"><a href="#">Women </a>
								<ul class="cute">
									<li class="subitem1"><a href="product">Cute Kittens </a></li>
									<li class="subitem2"><a href="product">Strange Stuff </a></li>
									<li class="subitem3"><a href="product">Automatic Fails </a></li>
								</ul>
							</li>
							<li class="item3"><a href="#">Kids</a>
								<ul class="cute">
									<li class="subitem1"><a href="product">Cute Kittens </a></li>
									<li class="subitem2"><a href="product">Strange Stuff </a></li>
									<li class="subitem3"><a href="product">Automatic Fails</a></li>
								</ul>
							</li>
							<li class="item4"><a href="#">Accessories</a>
								<ul class="cute">
									<li class="subitem1"><a href="product">Cute Kittens </a></li>
									<li class="subitem2"><a href="product">Strange Stuff </a></li>
									<li class="subitem3"><a href="product">Automatic Fails</a></li>
								</ul>
							</li>
									
							<li class="item4"><a href="#">Shoes</a>
								<ul class="cute">
									<li class="subitem1"><a href="product">Cute Kittens </a></li>
									<li class="subitem2"><a href="product">Strange Stuff </a></li>
									<li class="subitem3"><a href="product">Automatic Fails </a></li>
								</ul>
							</li>
						</ul>
					</div>
				<!--initiate accordion-->
						<script type="text/javascript">
							$(function() {
							    var menu_ul = $('.menu-drop > li > ul'),
							           menu_a  = $('.menu-drop > li > a');
							    menu_ul.hide();
							    menu_a.click(function(e) {
							        e.preventDefault();
							        if(!$(this).hasClass('active')) {
							            menu_a.removeClass('active');
							            menu_ul.filter(':visible').slideUp('normal');
							            $(this).addClass('active').next().stop(true,true).slideDown('normal');
							        } else {
							            $(this).removeClass('active');
							            $(this).next().stop(true,true).slideUp('normal');
							        }
							    });
							
							});
						</script>
<!--//menu-->
 <section  class="sky-form">
					<h4 class="cate">Discounts</h4>
					 <div class="row row1 scroll-pane">
						 <div class="col col-4">
								<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>Upto - 10% (20)</label>
						 </div>
						 <div class="col col-4">
								<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>40% - 50% (5)</label>
								<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>30% - 20% (7)</label>
								<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>10% - 5% (2)</label>
								<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Other(50)</label>
						 </div>
					 </div>
				 </section> 				 				 
				 
					
					 <!---->
					 <section  class="sky-form">
						<h4 class="cate">Type</h4>
							<div class="row row1 scroll-pane">
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>Sofa Cum Beds (30)</label>
								</div>
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Bags  (30)</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Caps & Hats (30)</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Jackets & Coats   (30)</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Jeans  (30)</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Shirts   (30)</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Sunglasses  (30)</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Swimwear  (30)</label>
								</div>
							</div>
				   </section>
				   		<section  class="sky-form">
						<h4 class="cate">Brand</h4>
							<div class="row row1 scroll-pane">
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i></i>Roadstar</label>
								</div>
								<div class="col col-4">
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Levis</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Persol</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Nike</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Edwin</label>
									<label class="checkbox"><input type="checkbox" name="checkbox" ><i></i>New Balance</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Paul Smith</label>
									<label class="checkbox"><input type="checkbox" name="checkbox"><i></i>Ray-Ban</label>
								</div>
							</div>
				   </section>		
		</div>
		<div class="clearfix"> </div>
	</div>
	
			<!--brand-->
		<div class="container">
			<div class="brand">
				<div class="col-md-3 brand-grid">
					<img src="<c:url value="resources/images/ic.png"/>" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="<c:url value="resources/images/ic1.png"/>" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="<c:url value="resources/images/ic2.png"/>" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="<c:url value="resources/images/ic3.png"/>" class="img-responsive" alt="">
				</div>
				<div class="clearfix"></div>
			</div>
			</div>
			<!--//brand-->
		</div>	
		
	<!--//content-->
		<!--//footer-->
	<div class="footer">
	<div class="footer-middle">
				<div class="container">
					<div class="col-md-3 footer-middle-in">
						<a href="index.jsp"><img src="<c:url value="resources/images/log.png"/>" alt=""></a>
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
						<li><a href="#"><img src="<c:url value="resources/images/f1.png"/>" class="img-responsive" alt=""></a></li>
						<li><a href="#"><img src="<c:url value="resources/images/f2.png"/>" class="img-responsive" alt=""></a></li>
						<li><a href="#"><img src="<c:url value="resources/images/f3.png"/>" class="img-responsive" alt=""></a></li>
					</ul>
					<p class="footer-class">&copy; 2017 Shopin. All Rights Reserved | Design by  <strong><a href="https://www.linkedin.com/in/harindu-sulochana-5b4799119/">Harindu Sulochana Liyanage</a></strong> </p>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
		<!--//footer-->
<script src="<c:url value="resources/js/js-a/imagezoom.js" />"></script>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script defer src="<c:url value="resources/js/js-a/jquery.flexslider.js" />"></script>
<link rel="stylesheet" href="<c:url value="resources/css/css-a/flexslider.css" />" type="text/css" media="screen" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- MyLoginModel -->
<div style="display: none;"><button type="button" id="myModelLoad-btn" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button></div>
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">You Have to Log In your Account Or Sign Up First</h4>
        </div>
          <form id="model-form">
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
            <button type="submit" value="login" class="btn btn-info">LogIn</button>
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
          </form>
        <div class="modal-footer">
            <button type="button" class="btn btn-info" id="signUp-model-btn">SignUp</button>
            </label><button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>


<script>
// Can also be used with $(document).ready()
$(window).load(function() {
  $('.flexslider').flexslider({
    animation: "slide",
    controlNav: "thumbnails"
  });
});
</script>

	<script src="<c:url value="resources/js/js-a/simpleCart.min.js" />"> </script>
        <script src="<c:url value="resources/js/dom-login.js" />"> </script>
        <script src="<c:url value="resources/js/js-a/dom-single.js" />"> </script>
        
<!-- slide -->
<script src="<c:url value="resources/js/bootstrap.min.js" />"></script>

<script type="text/javascript">
    (function () {
        var options = {
            facebook: "wearyourownstorys/?ref=page_internal", 
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
