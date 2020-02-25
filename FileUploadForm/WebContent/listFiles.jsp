<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="imageupload.hibernate.entity.Files"  %>
        <%@page import="java.util.List"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gallery</title>
</head>
<body>
<h1>Art Gallery</h1>
<%
String path=(String)request.getAttribute("path");
List<Files> files=(List<Files>)request.getAttribute("files");

for(Files file:files){
	out.print("<br/><img src="+path+file.getFileName()+">");	
}

%>
</body>
</html>