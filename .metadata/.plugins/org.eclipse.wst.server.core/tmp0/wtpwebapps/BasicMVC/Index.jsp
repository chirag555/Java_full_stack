<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>HomePage</h1>
	<a href="<%=request.getContextPath()%>/Controller?page=login">Login</a>
	<a href="<%=request.getContextPath()%>/Controller?page=SignUp">Sign
		Up</a>
	<a href="<%=request.getContextPath()%>/Controller?page=about">About
		Us</a>

	<form method=post
		action="<%=request.getContextPath()%>/DetailsProcessing">
		<table border="10px">
			<tr>
				<td>Name</td>
				<td><input type=text name=name required></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type=radio name=gender value=male checked="checked">Male
					<input type=radio name=gender value=female>Female</td>
			</tr>
			<tr>
				<td>Language</td>
				<td><input type=checkbox name=language value=english>English
					<input type=checkbox name=language value=hindi>Hindi <input
					type=checkbox name=language value=gujarati>Gujarati <input
					type=checkbox name=language value=punjabi>Punjabi</td>
			<tr>
				<td>Country</td>
				<td><select name=country>
						<option value=india>India</option>
						<option value=usa>USA</option>
						<option value=nepal>Nepal</option>
						<option value=uganda>Uganda</option>
				</select></td>
			</tr>
			<tr>
				<td colspan=2 align=center><input type=submit value="Submit">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>