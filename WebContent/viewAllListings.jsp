<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Listings</title>
</head>
<body>

<h1>All Listings</h1>

<form method="post" action="listingActionServlet">
	
	<table>
		<tr>
			<th></th>
			<th>Street Number</th>
			<th>Street Name</th>
			<th>Neighborhood</th>
			<th>Price</th>
			<th>List Date</th>
		</tr>
		
		<c:forEach items="${requestScope.allListings}" var="currentListing">
			<tr>
				<td><input type="radio" name="id" value="${currentListing.id}"></td>
				
				<td>${currentListing.housingUnit.streetNumber}</td>
				<td>${currentListing.housingUnit.streetName}</td>
				<td>${currentListing.housingUnit.neighborhood.neighborhoodName}</td>
				<td>${currentListing.price}</td>
				<td>${currentListing.listDate}</td>
			</tr>
		</c:forEach>
	</table>
	
	<input type="submit" value="Add" name="action">
	<input type="submit" value="Remove" name="action">
	
</form>
<a href="index.html">Home</a>
</body>
</html>