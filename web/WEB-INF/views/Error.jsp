<%-- 
    Document   : Error
    Created on : Oct 4, 2017, 2:18:29 PM
    Author     : Harindu.sul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div><img src="<c:url value="resources\images\Item\tempFile\italianDress.jpg" />"></div>
        <form method="POST" action="image" enctype="multipart/form-data">
		File1 to upload: <input type="file" name="file">
 
		Name1: <input type="text" name="name">
		<input type="submit" value="Upload"> Press here to upload the file!
	</form>
    </body>
</html>

 <div class="form-group">
                <label class="control-label col-sm-2">Size:</label>
                <div class="col-sm-10"> 
                    <select  class="form-control"  id="item-size-combo"></select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">Category:</label>
                <div class="col-sm-10"> 
                    <select  class="form-control" id="item-category-combo"></select>
                </div>
            </div>
