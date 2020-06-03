<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<form:form action="displayUserInfo" >
		
			Name :
			<form:input path="name" />
		<p>
			Gender : Male
			<form:radiobutton path="gender" value="male" />
			Female :
			<form:radiobutton path="gender" value="female" />
		</p>
		<input type=submit value="Submit">


	</form:form>

</body>
</html>