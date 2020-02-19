<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
</head>
<body>
<h1>Main Page</h1>


<%
//for forwarding java code
//request.getRequestDispatcher("forward.jsp").forward(request,response);
		response.sendRedirect("Redirect.jsp");
%>
</body>
</html>