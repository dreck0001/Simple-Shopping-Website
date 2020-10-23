<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--  CSS help from https://www.codegrepper.com/code-examples/delphi/how+to+create+a+sidebar+using+html%27+without+javascript+and+css-->

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>hw3_6_MusicViewJSP</title>
	<link rel="stylesheet" href="sideMenu.css">
</head>

<body>
	<div class="sidenav">
  		<a href="main.shop?view=books">Books</a>
  		<a href="main.shop?view=music">Music</a>
  		<a href="main.shop?view=computers">Computers</a>
  		<div class="logout">
  			<a href="viewCart.jsp">View Cart</a>
  			<a href="main.shop?view=logout">Sign Out</a>
  		</div>
  		<div class="vl"></div>
	</div>

	<div class="main">
 		<p>Shop for Music
  		<hr>
  		<form action = "main.shop?view=addToCart" method="post" ><br>
     		<c:forEach items="${songs}" var="song" >
 				<br><input type="checkbox" name="name" value=${song.name}> ${song.name} --- $${song.price}
        		<a href='main.shop?view=addToCart'></a> <br>
			</c:forEach>
    		<br><input type="submit" value = "Add to Cart">
  		</form>
	</div>
</body>
</html>