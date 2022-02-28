<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<!-- En el model atribute va el  identificativo credential del model.AddAtribite-->
<!-- De esta forma, sabe de donde mandará llamar los geters y seters-->
<div align="center">
	<h1>Login</h1>
<form:form action="Login" method="post" modelAttribute="credential">
	<table>		
		<tr>
			<td>Name:</td>
			<td><form:input path="name" /></td>			
		</tr>
		<tr>
			<td>Password:</td>
			<td><form:input path="password" /></td>			
		</tr>		
		<tr><td colspan="2" align="center"><input class="btn btn-primary" type="submit" value="Login"></td>
		</tr>
	</table>
</div>
</form:form>
</body>
</html>