<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<p>${error}</p>
	<h1>Registration Form</h1>
	<form action="/PostRequest/register" method="post">
		<label for="email">E-mail</label> <br> <input type="email" id="email" name="email"> <br>
		
		<label for="name">Name</label> <br> <input type="text" id="name" name="name"> <br>
		
		<label for="age">Age</label> <br> <input type="number" id="age" name="age"> <br>
		
		<label for="password">Password</label> <br> <input type="password" id="password" name="password"> <br>
		
		<label for="confirmPassword">Confirm Password:</label> <br> <input type="password" id="confirmPassword" name="confirmPassword"> <br>
		
		<button type="submit">Create Account</button>
	</form>
</body>
</html>