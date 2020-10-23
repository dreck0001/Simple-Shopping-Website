<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--  CSS help from https://www.codegrepper.com/code-examples/delphi/how+to+create+a+sidebar+using+html%27+without+javascript+and+css-->

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="sideMenu.css">
	<title>hw3_6_ProductsAddedJSP</title>
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
  <h4>The following items have been added to your shipping cart successfully</h4>
     <c:forEach items="${addedProducts}" var="addedProduct" >
     	<p> - ${addedProduct.name} <%-- $"${addedProduct.price}" --%>
<%--      	<p>"${theBook.name}" ${theBook.name} $${theBook.price} --%>
        <a href='main.shop?view=addToCart'></a> <br>
	</c:forEach>
	<br><br>
  <a href="viewCart.jsp">[View Cart]</a>
  <a href="main.shop?view=books">[Go to Books Page]</a>
  <a href="main.shop?view=music">[Go to Music Page]</a>
  <a href="main.shop?view=computers">[Go to Computers Page]</a>
</div>

</body>
</html>