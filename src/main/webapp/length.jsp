<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inches to CM converter</title>
</head>
<body>
	<h1>Convert Length from Inches to Centimeters</h1>
	<form action="getLengthServlet" method="post">
		Enter the length (in inches) that you wish to convert to centimeters:
		<input type="text" name="userLength" size="10">
		<input type="submit" value="Convert to Centimeters">
	</form>
</body>
</html>