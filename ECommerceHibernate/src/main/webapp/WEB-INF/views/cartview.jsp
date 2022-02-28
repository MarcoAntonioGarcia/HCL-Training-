<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html> 
<html>

<head>
<meta charset ="ISO-8859-1">
<title>Shopping Cart</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<body>

    <h1>Shopping Cart</h1>


    <div align="center">
    
    <form:form action="buyingCart" method="post" modelAttribute="cart">
    <!--input path="userId" name="userId" type="hidden" value="${userId}"-->
        <table class="table table-striped">
            <tr>
                <td>Product name </td>
                <td>Category </td>
                <td>Price </td>
                <td>Quantity </td>
            </tr>			
            <c:forEach items ="${cartProducts}" var="prod" varStatus="tagStatus">
                <tr>
                    <td>${prod.productName}</td>
                    <td>${prod.category}</td>
                    <td>${prod.price}</td>
                    <td>${prod.productQuantity} </td>
                 
                    <!--<td><input type="submit" value="add to cart"></td> -->
                </tr>
            </c:forEach>
              <!--  input path="products" name="products" type="hidden" value="${cartProducts}"-->
              <input path="userId" name="userId" type="hidden" value="${userId}">
                    
            <tr>
                <td><a href="getProducts?userId=${userId}">Products list</a></td>
                <td>
                    <input class="btn btn-primary" type="submit" value ="Buy cart">
                </td>
            </tr>
        </table>
        
    </form:form>

 

    </div>

 

</body>