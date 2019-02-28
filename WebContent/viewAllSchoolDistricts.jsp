<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All School Districts</title>
</head>
<body>

<h1>All School Districts</h1>

<form method="post" action="schoolDistrictActionServlet">
	<table>
		<tr>
			<th></th>
			<th>District Name</th>			
			<th>Rating</th>
		</tr>
			
		<c:forEach items="${requestScope.allSchoolDistricts}" var="currentSchoolDistrict">
			<tr>
				<td><input type="radio" name="id" value="${currentSchoolDistrict.id}"></td>
				
				<td>${currentSchoolDistrict.districtName}</td>				
				<td>${currentSchoolDistrict.rating}</td>
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