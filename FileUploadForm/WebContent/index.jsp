<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload File Home Page</title>
</head>
<body>
<form action="imageUpload?action=filesUpload" method="post" enctype="multipart/form-data">
Select Images<input type=file name=files multiple>
			<input type=submit value=upload>
			<br/><a href="<%=request.getContextPath() %>/imageUpload?action=listingImages">View Gallery</a>

</form>


</body>
</html>