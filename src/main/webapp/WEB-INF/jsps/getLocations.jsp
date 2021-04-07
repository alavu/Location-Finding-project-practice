<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>get Locations</title>
</head>
<body>
<a href="showLocation">Add New Locations</a>
<h2>All Locations list</h2>
<table border="1">
<tr>
	<th>Id</th>
	<th>Code</th>
	<th>Name</th>
	<th>Type</th>
</tr>
<c:forEach items="${locations}" var="location">
<tr>
	<th>${location.id }</th>
	<th>${location.code }</th>
	<th>${location.name }</th>
	<th>${location.type }</th>
</tr>
</c:forEach>
</table>
</body>
</html>