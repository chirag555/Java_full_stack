<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bean JSP</title>
</head>
<body>
<jsp:useBean id="bean" class="Bean.BeanDemo" scope="session"></jsp:useBean>
Name : <jsp:getProperty property="name" name="bean"/><br/>
Gender :<jsp:getProperty property="gender" name="bean"/><br/>
Country :<jsp:getProperty property="country" name="bean"/><br/>
Language :<jsp:getProperty property="language" name="bean"/><br/>
</body>
</html>
