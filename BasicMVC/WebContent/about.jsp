<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Entered</title>
</head>
<body>
	<h1>Registered User</h1>
	<table border=1>
		<tr>
			<td>Name</td>
			<td><%=request.getParameter("name")%></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><%=request.getParameter("gender")%></td>
		</tr>
		<tr>
			<td>Language</td>

			<td>
				<%
					String[] countries = request.getParameterValues("language");
					if (countries != null) {
						for (int i = 0; i < countries.length; i++) {
							out.print(countries[i] + " ");
						}
					} else {
						out.print("Nothing Selected");
					}
				%>
			</td>
		</tr>
		<tr>
			<td>Country</td>
			<td><%=request.getParameter("country")%></td>
		</tr>
	</table>
</body>
</html>