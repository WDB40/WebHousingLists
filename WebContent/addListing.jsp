<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Listing</title>
</head>
<body>

<form action="addListingServlet" method="post">
	<table>
		<tr>
			<th>Housing Unit:</th>
			<td>
				<select name="housingUnit">
					<c:forEach items="${requestScope.allHousingUnits}" var="currentHousingUnit">
						<option value="${currentHousingUnit.id}">${currentHousingUnit.streetNumber} ${currentHousingUnit.streetName}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		
		<tr>
			<th>Price:</th>
			<td><input type="text" name="price"></td>
		</tr>
		
		<tr>
			<th>List Date:</th>
			<td><input type="text" name="listDate"></td>
			<td>(format=YYYY-MM-DD)</td>
		</tr>
	</table>
	
	<input type="submit" value="Add">
</form>
<a href="index.html">Home</a>
</body>
</html>