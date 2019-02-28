<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Housing Units</title>
</head>
<body>

<h1>All Housing Units</h1>

<form method="post" action="housingUnitActionServlet">
	<table>
		<tr>
			<th>Street Number</th>
			<th>Street Name</th>
			<th>Unit Number</th>
			<th>City</th>
			<th>Zipcode</th>
			<th>State</th>
			<th>Neighborhood</th>
		</tr>
			
		<c:forEach items="${requestScope.allHousingUnits}" var="currentHousingUnit">
			<tr>
				<td><input type="radio" name="id" value="${currentHousingUnit.id}"></td>
				
				<td>${currentHousingUnit.streetNumber}</td>
				<td>${currentHousingUnit.streetName}</td>
				<td>${currentHousingUnit.unitNumber}</td>
				<td>${currentHousingUnit.city}</td>
				<td>${currentHousingUnit.zipcode}</td>
				<td>${currentHousingUnit.state}</td>
				<td>${currentHousingUnit.neighborhood.neighborName}</td>
			</tr>
		</c:forEach>
	</table>
	
	<input type="submit" value="Add" name="action">
	<input type="submit" value="Remove" name="action">
	<input type="submit" value="Update" name="action">
	
</form>
<a href="index.html">Home</a>
</body>
</html>