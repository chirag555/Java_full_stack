<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>
<h1>Hello JSP</h1>
<%!public int x=100; %>
<%= x %>
<%= x>4 %>

<%!
String msg(){
	return "MY Name";
}

%>
<%=msg() %>
<%-- not prited --%>
<%-- <% response.sendRedirect("google.com");%> --%>
<!-- not going to print -->
<-- <% response.sendRedirect("http://www.google.com");%> -->

</body>
</html>