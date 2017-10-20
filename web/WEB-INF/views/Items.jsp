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
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css" />" media="all" />
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.min.css" />" media="all" />
        <title>Item Manage</title>
    </head>
    <body>
        <div class="row">
            <div class="container">
                <h3 style="text-align: left;  color: #ffff; background-color:Gray;">Item Manage Panel</h3><div>
                <h4 style="margin-bottom: 25px; text-align: center; color: #009688">Create New Item First</h4>
                <form action="addNewItem" id="item-adding-form" method="POST" enctype="multipart/form-data" class="form-horizontal">
            <div class="form-group">
                <label class="control-label col-sm-2">Upload :</label>
                <div class="col-sm-10">
                    <input type="file" name="file" class="form-control" required="">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">Set File Name :</label>
                <div class="col-sm-10">
                  <input type="text" name="fileName" class="form-control" required="" />
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">All Category:</label>
                <div class="col-sm-10">
                    <select name="category" id="category-combo" class="form-control" ></select>
                </div>
            </div>       
            <div class="form-group">
                <label class="control-label col-sm-2">Description:</label>
                <div class="col-sm-10"> 
                    <input type="text" class="form-control" name="description" id="item-desc-txt" required=""/>
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
        <div class="row">
            <div class="container">
                <h4 style="margin-bottom: 25px; text-align: center; color: #009688">Add Item Details To Item</h4>
                <form id="itemDetails-adding-form">
            <div class="form-group">
                <label class="control-label col-sm-2">Item :</label>
                <div class="col-sm-10">
                    <select class="form-control" id="item-desc-combo"></select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">Size:</label>
                <div class="col-sm-10">
                    <select class="form-control" id="size-name-combo-itemDetails" ></select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">Unit Price</label>
                <div class="col-sm-10"> 
                    <input type="text" class="form-control"  id="unitPrice-txt" pattern="[0-9]+(\.[0-9][0-9]?)?" title="Input tow decimel point number please"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">QtyOnHand</label>
                <div class="col-sm-10"> 
                    <input type="text" class="form-control"  id="qtyOnHand-txt" pattern="^0*(?:[1-9][0-9]?|100)$" title="Enter valid range number (0-100)"/>
                </div>
            </div>        
            <div class="form-group"> 
                <div class="col-sm-offset-2 col-sm-10">
                    <button id="add-itemDetails-btn" type="submit" class="btn warning">Put Item Details Table</button>
                </div>
            </div>
        </form>
            </div>
            </div>
        <!--Item details putting Table -->
        <div class="row">
            <div class="container">
                <div class="table-responsive">
                    <table class="table" id="putTable">
                    <thead>
                      <tr>
                        <th>select</th>
                        <th class="itemdescCell">Item Description</th>
                        <th>Size Name</th>
                        <th>Unit Price</th>
                        <th>Qty On Hand </th>
                      </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
                    <div>
                        <button id="btn-delete" class="btn btn-danger">Remove Selected Item</button>
                        <button id="btn-addItemDetails" class="btn btn-success">Add Item Details</button>
                        <input id="numOfItem" type="text" readonly="" disabled="" class="form-control" style="width: 50px;" />
                    </div>    
            </div>  
            </div>
        </div>
        <!-- Item Delete by description -->
        <div class="row">
                <div class="col-md-2"></div>
                    <div class="form-area col-md-5">  
                        <form role="form">
                        <br style="clear:both">
                            <h4 style="margin-bottom: 25px; text-align: center; color: #009688">Delete Item</h4>
                                <div class="form-group">
                                    <select id="delete-item-combo" class="form-control inputdefault">
                                    </select>
                                </div>
                            <button type="button" id="delete-item-btn"  class="btn btn-warning pull-left">Delete</button>
                        </form>
                    </div>
            </div>
        <script src="<c:url value="/resources/js/jquery.js" />"></script>    
    <script src="<c:url value="/resources/js/jquery-2.1.3.min.js" />"></script> 

    <!-- Bootstrap Core JavaScript -->
     <script src="<c:url value="/resources/js/bootstrap.js" />"></script>    
     <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>    
     <script src="<c:url value="/resources/js/js-a/ItemDetailsDTO.js" />"></script>  
     <script src="<c:url value="/resources/js/js-a/dom-items.js" />"></script>  
    </body> 
</html>

