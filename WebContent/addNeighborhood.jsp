<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Neighborhood</title>
</head>
<body>

<h1>Add Neighborhood</h1>

<form action="addNeighborhoodServlet" method="post">
	<table>		
		<tr>
			<th>Neighborhood Name*:</th>
			<td><input type="text" name="neighborhoodName"></td>
		</tr>
		
		<tr>
			<th>School District ID*:</th>
			<td><input type="text" name="schoolDistrictId"></td>
		</tr>
		
	</table>
	<input type="submit" value="Add">
</form>

<a href="index.html">Home</a>

</body>
</html>