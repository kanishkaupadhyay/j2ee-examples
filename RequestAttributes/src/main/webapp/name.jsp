<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greeting for a Person</title>
</head>
<body>
	<h2>Welcome</h2>
	<p>${error}</p>
	<p>Hey ${person.firstName} ${person.lastName}, nice to meet you...</p>
	<p>You are ${person.age} years old.</p>
</body>
</html>