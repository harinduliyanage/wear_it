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
       
        <h3 style="text-align: left;  color: #ffff; background-color:Gray;">Size Manage Panel</h3>
        <div class="container">
            <div class="row">
                <div class="col-md-2"></div>
                
                    <div class="form-area col-md-5">  
                        <form role="form" id="create-new-size-form">
                        <br style="clear:both">
                                    <h4 style="margin-bottom: 25px; text-align: center; color: #009688">Create New Size</h4>
                                                <div class="form-group">
                                                                <input type="text" class="form-control" id="sizes-txt" name="size" placeholder="Size Name" required="" >
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" id="sizeUK-txt" name="sizeUK" placeholder="UK Size"  required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" id="sizeUS-txt" name="sizeUS" placeholder="UK Size" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" id="sizeEU-txt" name="sizeEU" placeholder="EU Size" required="">
                                                        </div>


                                    <button type="submit" id="add-New-Size-btn" name="submit" class="btn btn-primary pull-left">Submit</button>
                        </form>
                    </div>
                 </div>
            
            <!-- >Update Size </-->
            <div class="row">
                <div class="col-md-2"></div>
                
                    <div class="form-area col-md-5">  
                        <form role="form" id="update-size-form">
                        <br style="clear:both">
                                    <h4 style="margin-bottom: 25px; text-align: center; color: #009688">Update Size</h4>
                                                <div class="form-group">
                                                    <select id="update-size-combo" class="form-control inputdefault">
                                                    </select>
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" id="update-sizeUK-txt" name="sizeUK" placeholder="UK Size"  required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" id="update-sizeUS-txt" name="sizeUS" placeholder="UK Size" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" class="form-control" id="update-sizeEU-txt" name="sizeEU" placeholder="EU Size" required="">
                                                        </div>


                                    <button type="submit" name="submit" class="btn btn-primary pull-left">Update</button>
                        </form>
                    </div>
                 </div>
            </div>
            <div class="row">
                <div class="col-md-2"></div>
                
                    <div class="form-area col-md-5">  
                        <form role="form" id="update-size-form">
                        <br style="clear:both">
                            <h4 style="margin-bottom: 25px; text-align: center; color: #009688">Delete Size</h4>
                                <div class="form-group">
                                    <select id="delete-size-combo" class="form-control inputdefault">
                                    </select>
                                </div>
                            <button type="button" id="delete-size-btn"  class="btn btn-warning pull-left">Delete</button>
                        </form>
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
