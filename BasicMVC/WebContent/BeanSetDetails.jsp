<%@page import="javafx.scene.control.Alert"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bean Set Property</title>
</head>
<body>
<jsp:useBean id="bean" class="Bean.BeanDemo" scope="session"></jsp:useBean>
<jsp:setProperty property="name" name="bean" value="Aksh"/>
<jsp:setProperty property="gender" name="bean" value="Male"/>
<jsp:setProperty property="country" name="bean" value="Nepal"/>
<jsp:setProperty property="language" name="bean" value="Krench"/>
<h1>Values Set Successfully</h1>
<%
response.sendRedirect("BeanGetDetails.jsp"); %>
</body>
</html>