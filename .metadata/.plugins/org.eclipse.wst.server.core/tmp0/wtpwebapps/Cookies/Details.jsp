<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
	<%
		String username =null, sessionID =null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("username")) {
					username = cookie.getValue();
				}
				if (cookie.getName().equals("JSESSIONID")) {
					sessionID = cookie.getValue();
				}
			}
		}
		if (sessionID == null || username == null) {
			response.sendRedirect("Login.jsp");
		}
	%>
	<%=username%>
	<br>
	<%=sessionID%>
<form action="<%=request.getContextPath()%>/ProfileController" method=get>
<input type=hidden name="action" value=destroy>
<input type=submit value=logout>

</form>
</body>
</html>