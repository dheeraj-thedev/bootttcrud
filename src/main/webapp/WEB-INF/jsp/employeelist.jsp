<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="stag" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>User Name</th>
				<th>Email Id</th>
				<th>Blood Group</th>
				<th>Age</th>
				<th>Mobile Number</th>
				<th>Personal Email Id</th>
			</tr>
			<c:forEach items="${empList}" var="emp">
				<td><a href="/edit?id=${emp.id}">Edit</a></td>
				<td>
					<form action="/delete?id=${emp.id}" method="post">
						<input type="submit" value="Delete">
					</form>
				</td>
				<td>${emp.firstName}</td>
				<td>${emp.lastName}</td>
				<td>${emp.userName}</td>
				<td>${emp.emailID}</td>
				<td>${emp.bloodGroup}</td>
				<td>${emp.age}</td>
				<td>${emp.mobileNumber}</td>
				<td>${emp.personalEmail}</td>
			</c:forEach>
		</table>
	</div>

</body>
</html>