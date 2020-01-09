<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Title</th>
			<th>Genre</th>
			<th>Author</th>
			<th>ISBN</th>
		</tr>
		<c:forEach var="book" items="${bookList}">
			<tr>
				<td><c:out value="${book.title}"></c:out></td>
				<td><c:out value="${book.genre}"></c:out></td>
				<td><c:out value="${book.author}"></c:out></td>
				<td><c:out value="${book.isbn}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>