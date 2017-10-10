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
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link href="../../resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/bootstrap.min.css" />" media="all" />
        <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/simple-sidebar.css" />" media="all" />
        <title>admin</title>
    </head>
    <body>
       <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        Customer Maintain
                    </a>
                </li>
                <li>
                    <a href="#">Dashboard</a>
                </li>
                <li>
                    <a href="newCustomer.jsp" target="internal">Add Customer</a>
                </li>
                <li>
                    <a href="ViewAllCustomer.jsp" target="internal">View All Customers</a>
                </li>
                <li>
                    <a href="updateCustomer.jsp" target="internal">Search Edit & Delete</a>
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
                        <iframe src="front.html" style="margin-left: 4vw; height: 75vh; border: none;" class="col-md-11" name="internal">

                        </iframe>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="<c:url value="resources/js/jquery-3-2-1.js" />"></script>
    <script src="<c:url value="resources/js/jquery-ui.js" />"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<c:url value="resources/js/bootstrap.js" />"></script>
    <script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
    
    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>


    </body>
</html>
