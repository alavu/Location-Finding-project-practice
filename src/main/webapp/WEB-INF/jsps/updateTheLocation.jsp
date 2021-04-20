<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update the Location</title>
</head>
<body>
<h2>Update Location</h2>
<form action="updateLocationData" method="post">
id<input type="text" name=id value="${id}" readonly>
code<input type="text" name=code value="${code}"/>
name<input type="text" name=name value="${name}"/>
type:Urban<input type="radio" name=type value="urban"/>
type:Rural<input type="radio" name=type value="Rural"/>
<input type="Submit" value="Update"/>

</form>
${updatedMsg}
</body>
</html>