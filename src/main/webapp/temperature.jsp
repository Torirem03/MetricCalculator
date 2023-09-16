<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Temperature converter</title>
</head>
<body>
	<h1>Convert Temperature from Fahrenheit to Celsius</h1>
	<form action="getTempServlet" method="post">
		Enter the temperature (in Fahrenheit) that you wish to convert to Celcius:
		<input type="text" name="userTemp" size="10">
		<input type="submit" value="Convert to Celsius">
	</form>
</body>
</html>