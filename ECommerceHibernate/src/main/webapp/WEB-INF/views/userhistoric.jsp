ç<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User historic</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>



<c:forEach items ="${purchases}" var="purchase">
<div>
<!-- p>${purchase.userId}</p-->
<p><center>Total: ${purchase.total}</center></p>
<p><center>Date of purchase: ${purchase.date}</center></p>
</div>

<table class="table table-striped">
<tr>
<td><center>Product name: </center></td>
<td><center>Category: </center></td>
<td><center>Price: </center></td>
<td><center>Quantity: </center></td>
</tr>
<c:forEach items ="${purchase.products}" var="prod">
<tr>
<td>${prod.productName}</td>
<td>${prod.category}</td>
<td>${prod.price}</td>
<td>${prod.productQuantity} </td>
</tr>
</c:forEach>

</table>



</br>
</hr>
</c:forEach>
</br>
</hr>
<td><a href="getProducts?userId=${userId}">Products list</a></td>
<td><a href="http://localhost:8080/ECommerceF/">Exit</a> </td>


</body>
</html>