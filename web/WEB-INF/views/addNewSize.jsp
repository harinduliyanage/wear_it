<%-- 
    Document   : addNewSize
    Created on : Oct 12, 2017, 12:57:48 PM
    Author     : Harindu.sul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="<c:url value="resources/images/titleIcon.ico" /> "/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Size Manage</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" media="all" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />" media="all" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/css-a/lol.css" />" media="all" />
        
        
    </head>
    <body>
       
        <h3>Size Manage Panel</h3>
        <div class="container">
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
          <!-- jQuery -->
    <script src="<c:url value="/resources/js/jquery.js" />"></script>    
    <script src="<c:url value="/resources/js/jquery-2.1.3.min.js" />"></script> 

    <!-- Bootstrap Core JavaScript -->
     <script src="<c:url value="/resources/js/bootstrap.js" />"></script>    
     <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>    
     <script src="<c:url value="/resources/js/dom.js" />"></script>    
    </body>
</html>
