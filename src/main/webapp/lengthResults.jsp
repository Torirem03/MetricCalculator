<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Length Conversion Results</title>
</head>
<body>
	<h1>Length Converter: </h1>
	<p>
	Your length of ${userLengthResults.getInches()} inches <br>
	is equal to <br>
	${userLengthResults.getCentimeters()} centimeters
	</p>
	<a href="length.jsp">Do another length calculation</a> <br>
	<a href="index.jsp">Back to Main page</a>
</body>
</html>