<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h2>Location Here</h2>
</head>
<body>
<a href="displayLocations">Click to see all locations</a>
<form action="saveLoc" method="post">
Id<input type="text" name="id"/>
Code<input type="text" name="code"/>
Name<input type="text" name="name"/>
Type
Urban:
<input type="radio" name="type" value="urban"/>
Rural:
<input type="radio" name="type" value="rural"/>
<input type="Submit" name="Save"/>

</form>
${msg}

</body>
</html>