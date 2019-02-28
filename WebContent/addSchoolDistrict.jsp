<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add School District</title>
</head>
<body>

<h1>Add School District</h1>

<form action="addSchoolDistrictServlet" method="post">
	<table>		
		<tr>
			<th>District Name*:</th>
			<td><input type="text" name="districtName"></td>
		</tr>
		
		<tr>
			<th>Rating*:</th>
			<td><input type="text" name="rating"></td>
		</tr>
		
	</table>
	<input type="submit" value="Add">
</form>

<a href="index.html">Home</a>

</body>
</html>