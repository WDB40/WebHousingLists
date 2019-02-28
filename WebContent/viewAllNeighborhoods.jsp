<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Neighborhoods</title>
</head>
<body>

<h1>All Neighborhoods</h1>

<form method="post" action="neighborhoodActionServlet">
	<table>
		<tr>
			<th></th>
			<th>Neighborhood Name</th>			
			<th>School District ID</th>
		</tr>
			
		<c:forEach items="${requestScope.allNeighborhoods}" var="currentNeighborhood">
			<tr>
				<td><input type="radio" name="id" value="${currentNeighborhood.id}"></td>
				
				<td>${currentNeighborhood.neighborhoodName}</td>				
				<td>${currentNeighborhood.schoolDistrictId}</td>
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