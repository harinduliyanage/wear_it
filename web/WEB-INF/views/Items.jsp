<%-- 
    Document   : Items
    Created on : Oct 14, 2017, 2:54:57 AM
    Author     : Harindu.sul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        
        <link rel="shortcut icon" href="<c:url value="resources/images/titleIcon.ico" /> "/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />" media="all" />
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row">
            <div class="container">
                <h3 style="text-align: left;  color: #337ab7">Item Manage Panel</h3><div>
                <h4 style="margin-bottom: 25px; text-align: center; color: #009688">Create New Item First</h4>
                <form id="item-adding-form" method="POST" action="image" enctype="multipart/form-data" class="form-horizontal">
            <div class="form-group">
                <label class="control-label col-sm-2">Upload :</label>
                <div class="col-sm-10">
                    <input type="file" name="file" class="form-control" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">Set File Name :</label>
                <div class="col-sm-10">
                  <input type="text" name="name" class="form-control" required="" />
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">Description:</label>
                <div class="col-sm-10"> 
                    <input type="text" class="form-control" id="item-desc-txt" required=""/>
                </div>
            </div>
            <div class="form-group"> 
                <div class="col-sm-offset-2 col-sm-10">
                  <button type="submit" class="btn btn-outline-blue-grey">Submit</button>
                </div>
            </div>
        </form>
            </div>
            </div>
        </div>
        <script src="<c:url value="resources/js/bootstrap.min.js"/>" ><script>
        <script src="<c:url value="resources/js/js-a/dom-items.js"/>" ><script>
    </body>
</html>

