<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Housing Unit</title>
</head>
<body>

<h1>Add Housing Unit</h1>

<form action="addHousingUnitServlet" method="post">
	<table>
		<tr>
			<th>Street Number*:</th>
			<td><input type="text" name="streetNumber"></td>
		</tr>
		
		<tr>
			<th>Street Name*:</th>
			<td><input type="text" name="streetName"></td>
		</tr>
		
		<tr>
			<th>Unit Number:</th>
			<td><input type="text" name="unitNumber"></td>
		</tr>
		
		<tr>
			<th>City*:</th>
			<td><input type="text" name="city"></td>
		</tr>
		
		<tr>
			<th>Zipcode*:</th>
			<td><input type="text" name="zipcode"></td>
		</tr>
		
		<tr>
			<th>State*:</th>
			<td><input type="text" name="state"></td>
		</tr>
		
		<tr>
			<th>Neighborhood*:</th>
			<td>
				<select name="neighborhood">
					<c:forEach items="${requestScope.allNeighborhoods}" var="currentNeighborhood">
						<option value="${currentNeighborhood.id}">${currentNeighborhood.neighborName}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
	</table>
	<input type="submit" value="Add">
</form>

<a href="index.html">Home</a>

</body>
</html>