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

<%!String form;int fileId; %>

<h1>Gallery</h1>
<table border=1>
<tr>
<th>Preview</th>
<th>Available Information</th>
<th>Update Information</th>
<th>Available Action</th>


<%

String path=(String)request.getAttribute("path");
List<Files> files=(List<Files>)request.getAttribute("files");

for(Files file:files)
{
	
	out.print("<tr ><td><img src="+path+file.getFileName()+" height='200'></td>");
	out.print("<td ><ul>"+
			  "<li>File ID:"+file.getId()+"</li>"+
			  "<li>Name:"+file.getFileName()+"</li>"+
			  "<li>Label:"+file.getLabel()+"</li>"+
			  "<li>Caption:"+file.getCaption()+"</li>"+
			  "</ul></td>"
			  
			  
			);
//fileId=file.getId();
form="<form action='imageUpload?action=update' method='post'>"+
		"Label : <input type=text name=label required='required' ><br>"+
		"Caption:<input type=text name=caption required='required'><br>"+
		"<input type=submit value=Update>"+
		"<input type=hidden name='fileId' value='"+file.getId()+"' >"+
		"<input type=hidden name='fileName' value='"+file.getFileName()+"'>"+
		"</form>";
out.print("<td>"+form+"</td>");
	//out.print("<td><ul><li><a href='"+path+file.getFileName()+"' >View Image </a></td></tr>");
out.print("<td><ul><li><a href='"+request.getContextPath()+"/imageUpload?action=viewImage&fileId="+file.getId()+"'>View Image </a></li></ul></td></tr>");

	
}

%>

</table>
</body>
</html>