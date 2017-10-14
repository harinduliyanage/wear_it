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
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/items.css" />" media="all" />
        <title>JSP Page</title>
    </head>
    <body>
        <div class="row">
            <div class="column">
              <div class="card">
                <img src="<c:url value="/resources/images/Item/3953Australia Cocktail Party Dress Print Plus Sizes Dresses A-line Scoop Short Knee-length Cotton-800x800.jpg" />" alt="Jane" style="width:100%">
                <div class="container">
                  <h2>Party Dress Print</h2>
                  <p class="title">new Arrival</p>
                  <p>Price ...</p>
                  <p>Availebe 6 more...</p>
                  <p></p>
                  <p><button class="button">Add to Cart & check out</button></p>
                </div>
              </div>
            </div>

        <div class="column">
          <div class="card">
            <img src="img2.jpg" alt="Mike" style="width:100%">
            <div class="container">
              <h2>Mike Ross</h2>
              <p class="title">Art Director</p>
              <p>Some text that describes me lorem ipsum ipsum lorem.</p>
              <p>example@example.com</p>
              <p><button class="button">Contact</button></p>
            </div>
          </div>
        </div>
      </div>
        <div class="row">
            <div class="column">
              <div class="card">
                <img src="img1.jpg" alt="Jane" style="width:100%">
                <div class="container">
                  <h2>Jane Doe</h2>
                  <p class="title">CEO &amp; Founder</p>
                  <p>Some text that describes me lorem ipsum ipsum lorem.</p>
                  <p>example@example.com</p>
                  <p><button class="button">Contact</button></p>
                </div>
              </div>
            </div>

        <div class="column">
          <div class="card">
            <img src="img2.jpg" alt="Mike" style="width:100%">
            <div class="container">
              <h2>Mike Ross</h2>
              <p class="title">Art Director</p>
              <p>Some text that describes me lorem ipsum ipsum lorem.</p>
              <p>example@example.com</p>
              <p><button class="button">Contact</button></p>
            </div>
          </div>
        </div>
      </div>
    </body>
</html>
