<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Temperature Conversion Results</title>
</head>
<body>
	<h1>Temperature Converter: </h1>
	<p>Your temperature of ${userTempResults.getFahrenheit()} degrees Fahrenheit <br>
	is equal to <br>
	${userTempResults.getCelcius()} degrees Celcius
	</p>
	<a href="temperature.jsp">Do another temperature calculation</a> <br>
	<a href="index.jsp">Back to Main page</a>
</body>
</html>