<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="stag" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="ftag" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">

<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
<title>Insert title here</title>
</head>
<body>
	<div style="margin-left: 10%; margin-right: 10%">
		<ftag:form action="/register" method="POST" modelAttribute="employee">

			<div class="form-group">

				<ftag:label for="firstName" path="${firstName}">First Name</ftag:label>
				<ftag:input class="form-control" path="firstName" />
			</div>
			<div class="form-group">
				<ftag:label path="${lastName}">Last Name</ftag:label>
				<ftag:input path="lastName" class="form-control" />
			</div>
			<div class="form-group">
				<ftag:label path="${userName}">User Name</ftag:label>
				<ftag:input path="userName" class="form-control" />
			</div>

			<div class="form-group">
				<ftag:label path="${emailID}">Email Id</ftag:label>
				<ftag:input path="emailID" class="form-control" />
			</div>
			<div class="form-group">
				<ftag:label path="${bloodGroup }">Blood Group</ftag:label>
				<ftag:input path="bloodGroup" class="form-control" />
			</div>
			<div class="form-group">
				<ftag:label path="${age}">Age</ftag:label>
				<ftag:input path="age" class="form-control" />
			</div>
			<div class="form-group">
				<ftag:label path="${personalEmail }">Personal Email</ftag:label>
				<ftag:input path="personalEmail" class="form-control" />
			</div>
			<div class="form-group">
				<ftag:label path="${emailID }">Email ID</ftag:label>
				<ftag:input path="emailID" class="form-control" />
			</div>
			<div class="form-group">
				<ftag:label path="${mobileNumber }">Mobile Number</ftag:label>
				<ftag:input path="mobileNumber" class="form-control" />
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-primary" value="Save" />
			</div>

		</ftag:form>
	</div>
</body>
</html>