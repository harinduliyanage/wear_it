<%-- 
    Document   : AjaxTest
    Created on : Oct 12, 2017, 9:53:42 PM
    Author     : Harindu.sul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" media="all" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />" media="all" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1 id="aaa">Hello Ajax!</h1>
        <div class="form-group-sm">
            <button class="btn btn-default" id="test-btn">Test</button><span class="glyphicon glyphicon-hand-down"></span>
        </div>
     <script src="<c:url value="/resources/js/bootstrap.js" />"></script>    
     <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>    
     <script src="<c:url value="/resources/js/jquery.js" />"></script>    
     <script src="<c:url value="/resources/js/jquery-2.1.3.min.js" />"></script> 
     <!-->$.get("/wear_it_1.2/A",function (data){
                 alert(data);
             });</-->
     <script type="text/javascript">
         $('#test-btn').click(function (){
             $.get("/wear_it_1.2/ajax");
         });
     </script>
    </body>
     
</html>