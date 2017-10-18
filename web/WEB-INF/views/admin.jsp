<%-- 
    Document   : admin
    Created on : Oct 8, 2017, 11:54:13 PM
    Author     : Harindu.sul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="<c:url value="resources/images/titleIcon.ico" /> "/>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link href="../../resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" media="all" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />" media="all" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/simple-sidebar.css" />" media="all" />
       
        <title>admin</title>
    </head>
    <body>
       <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="/wear_it_1.2/admin">
                        Admin Panel
                    </a>
                </li>
                <li>
                    <a href="#">Dashboard</a>
                </li>
                <li>
                    <a href="newCustomer.jsp" target="internal">Add New Item</a>
                </li>
                <li>
                    <a id="SizeNav" href="/wear_it_1.2/size" target="internal">Sizes Manage</a>
                </li>
                <li>
                    <a href="/wear_it_1.2/" target="internal">Re-Order Level</a>
                </li>
                <li>
                    <a href="/wear_it_1.2/ajaxTest" target="internal">Add New Category</a>
                </li>
                
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Menu</a>
                        <div class="container" id="main-content">
                            <h3>Size Manage Panel</h3>
                            <div class="row">
                            <div class="col-md-2"></div>
                            <div class="col-md-5">
                                <div class="form-area">  
                                    <form role="form" id="create-new-size-form">
                                    <br style="clear:both">
                                                <h4 style="margin-bottom: 25px; text-align: center;">Create New Size</h4>
                                                            <div class="form-group">
                                                                            <input type="text" class="form-control" id="sizes-txt" name="size" placeholder="Size Name" >
                                                                    </div>
                                                                    <div class="form-group">
                                                                            <input type="text" class="form-control" id="sizeUK-txt" name="sizeUK" placeholder="UK Size" >
                                                                    </div>
                                                                    <div class="form-group">
                                                                            <input type="text" class="form-control" id="sizeUS-txt" name="sizeUS" placeholder="UK Size" >
                                                                    </div>
                                                                    <div class="form-group">
                                                                            <input type="text" class="form-control" id="sizeEU-txt" name="sizeEU" placeholder="EU Size" >
                                                                    </div>


                                    <button type="button" id="add-New-Size-btn" name="submit" class="btn btn-primary pull-left">Submit</button>
                                    </form>
                                </div>
                             </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->
    
    <!-- jQuery -->
    <script src="<c:url value="/resources/js/jquery.js" />"></script>    
    <script src="<c:url value="/resources/js/jquery-2.1.3.min.js" />"></script> 
    <script src="<c:url value="/resources/js/dom.js" />"></script> 

    <!-- Bootstrap Core JavaScript -->
     <script src="<c:url value="/resources/js/bootstrap.js" />"></script>    
     <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>    
    
     
    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
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
