<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath()%>/SessionDemo">
		<table border=1>
			<tr>
				<td>User Name :</td>
				<td><input type=text name=username required></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type=password name=password required></td>
			</tr>
			<tr>
				<td colspan=2 align=center><input type=submit value=Login>
				<input type=hidden value=loginSubmit name=action>
				</td></tr>
		</table>
	</form>

</body>
</html>