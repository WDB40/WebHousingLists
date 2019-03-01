<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Housing Unit</title>
</head>
<body>

<h1>Update Housing Unit</h1>

<form method="post" action="updateHousingUnitServlet">
	<input type="hidden" name="id" value="${housingUnit.id}">
	
	<table>
		<tr>
			<th>Street Number*:</th>
			<td><input type="text" name="streetNumber" value="${housingUnit.streetNumber}"></td>
		</tr>
		
		<tr>
			<th>Street Name*:</th>
			<td><input type="text" name="streetName" value="${housingUnit.streetName}"></td>
		</tr>
		
		<tr>
			<th>Unit Number:</th>
			<td><input type="text" name="unitNumber" value="${housingUnit.unitNumber}"></td>
		</tr>
		
		<tr>
			<th>City*:</th>
			<td><input type="text" name="city" value="${housingUnit.city}"></td>
		</tr>
		
		<tr>
			<th>Zipcode*:</th>
			<td><input type="text" name="zipcode" value="${housingUnit.zipcode}" maxlength=5></td>
		</tr>
		
		<tr>
			<th>State*:</th>
			<td><input type="text" name="state" value="${housingUnit.state}" maxlength=2></td>
		</tr>
		
		<tr>
			<th>Neighborhood*:</th>
			<td>
				<select name="neighborhood">
					<c:forEach items="${requestScope.allNeighborhoods}" var="currentNeighborhood">
						<option value="${currentNeighborhood.id}">${currentNeighborhood.neighborhoodName}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
	</table>
	<input type="submit" value="Update">
</form>
<a href="index.html">Home</a>
</body>
</html>