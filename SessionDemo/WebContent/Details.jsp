<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
<h1>Display Details about user</h1>
<%
String username=null,sessionID=null;
if(request.getSession().getAttribute("username")==null)
{
	request.getRequestDispatcher("LoginJSP.jsp").forward(request, response);
}
else{
	username=request.getSession().getAttribute("username").toString();
	sessionID=request.getSession().getId();
	
}
%>
UserName :<%=username %>
<br>
<br>
SessionId:<%=sessionID %>
<form action="<%=request.getContextPath() %>/SessionDestroy" method=get>
<input type=hidden value=destroy name=action>
<input type=submit value=logout>
</form>

</body>
</html>