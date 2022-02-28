<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<body>
    <h1>Products list</h1>
    
    <div>
        <!-- Aqui usa el Buscador -->
        <!--  -->
    	<form:form action="getProductByName" method="get">
  	    	<input path="productName" name="productName" type="text">
  	    	<input type="submit" value="search product">
  	    	<input path="userId" name="userId" type="hidden" value="${userId}">
    	</form:form>

    	
    </div>
    <div align="center">
        
        <table class="table table-striped">
            <tr>
                <td>Product Name: </td>
                <td>Product Category: </td>
                <td>Price: </td>
                <td>Available Quantity: </td>
            </tr>
            <c:forEach items="${productsList}" var="prod" >
                <tr>
                    <form:form action="addToCart" method="post" modelAttribute="product">
                    
                    <input path="productId" name="productId" type="hidden" value="${prod.productId}">
                    <input path="productName" name="productName" type="hidden" value="${prod.productName}">
                    <input path="category" name="category" type="hidden" value="${prod.category}">
                    <input path="price" name="price" type="hidden" value="${prod.price}">
                    <input path="productQuantity"  name="productQuantity" type="hidden" value="${prod.productQuantity}">
                    
                    <input path="userId" name="userId" type="hidden" value="${userId}">
                    <td>${prod.productName}</td> 
                    <td>${prod.category}</td>
                    <td>${prod.price}</td>
                    <td>${prod.productQuantity}</td>
                    <td><input class="btn btn-primary" type="submit" value="add to cart"></td>
                    </form:form>
                    
                </tr>
                <!-- limpiar output de la lista de productos -->
                
            </c:forEach>
            <tr>
                <!--td><a href="viewCart">View Cart</a> </td-->
               <td><a href="viewCart?userId=${userId}">View Cart</a> 
               		<a href="showPurchases?userId=${userId}">My purchases</a> 
               </td>
            </tr>
        </table>
    </div>

 

</body>
</html>