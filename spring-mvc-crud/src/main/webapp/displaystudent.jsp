<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<c:forEach var="stu" items="${list}">
			<tr>
				<td>${stu.getId()}</td>
				<td>${stu.getName()}</td>
				<td>${stu.getAge()}</td>
				<td>${stu.getPhone()}</td>
				<td>${stu.getEmail()}</td>
				<td>${stu.getPassword()}</td>
				<td> <a href="editstu?id=${stu.getId()}">edit</a></td>
				<td> <a href="deletestu?id=${stu.getId()}">delete</a></td>
				

			</tr>

		</c:forEach>

	</table>
</body>
</html>