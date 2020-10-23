<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--  CSS help from https://www.codegrepper.com/code-examples/delphi/how+to+create+a+sidebar+using+html%27+without+javascript+and+css-->

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="sideMenu.css">
	<title>hw3_6_CartViewJSP</title>
</head>



<body>

<div class="sidenav">
  <a href="main.shop?view=books">Books</a>
  <a href="main.shop?view=music">Music</a>
  <a href="main.shop?view=computers">Computers</a>
  <div class="logout">
  	<a href="main.shop?view=logout">Sign Out</a>
  </div>
  <div class="vl"></div>

</div>

<div class="main">
  <p>My Cart
  <hr>
     <c:forEach items="${cartProducts}" var="cartProduct" >
     	<p> - ${cartProduct.name} 
	</c:forEach>
	<br><br>
</div>

</body>
</html>