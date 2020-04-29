<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addRobot">
		<input type="text" name="rid"/>
		<input type="text" name="rname"/>
		<input type="submit"/>
	</form>
	
	<form action="getRobot">
		<input type="text" name="rid"/>
		<input type="submit"/>
	</form>
	
	<form action="updateRobot">
		<input type="text" name="rid"/>
		<input type="text" name="rname"/>
		<input type="submit"/>
	</form>
</body>
</html>