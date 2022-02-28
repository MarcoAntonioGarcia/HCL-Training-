<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div align="center">
	<h1>Register</h1>
	<form:form action="saveUser" method="post" modelAttribute="user">
		<table>
			<form:hidden path="userId"/>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" class="form-control"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password" type="password" id="inputPassword5" class="form-control" aria-describedby="passwordHelpBlock"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="emailid" type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com"/></td>
			</tr>	
			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phoneNo" class="form-control"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input class="btn btn-primary" type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</div>
</body>
</html>