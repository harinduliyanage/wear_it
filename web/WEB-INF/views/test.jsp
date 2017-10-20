<%-- 
    Document   : test
    Created on : Oct 8, 2017, 12:37:04 AM
    Author     : ABC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="col-md-4 item-grid1 simpleCart_shelfItem">
            <div class=" mid-pop">
                <div class="pro-img">
                    <img src="<c:url value="resources/images/pc.jpg" />" class="img-responsive" alt="" />
			<div class="zoom-icon ">
                            <a class="picture" href="<c:url value="resources/images/pc.jpg" />" rel="title" class="b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
                            <a href="single"><i class="glyphicon glyphicon-menu-right icon"></i></a>
			</div>
		</div>
		<div class="mid-1">
                    <div class="women">
			<div class="women-top">
			<span>Women</span>
			<h6><a href="single">Sed ut perspiciati</a></h6>
                            </div>
                        <div class="img item_add">
                            <a href="#"><img src="<c:url value="resources/images/ca.png" />" alt=""></a>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <div class="mid-2">
			<p><label>$100.00</label><em class="item_price">$70.00</em></p>
			<div class="block">
                            <div class="starbox small ghosting"> </div>
			</div>   
			<div class="clearfix"></div>
                    </div>				
		</div>
            </div>
	</div>
    </body>
</html>
