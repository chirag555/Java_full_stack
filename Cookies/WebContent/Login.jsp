<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/CookieDemo" method="post">
Enter Name<input type=text name=username required="required">
<input type=submit value=login>
</form>
</body>
</html>