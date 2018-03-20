<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First  Simple Web App</title>
</head>
<body>
	<form action="/login.do" method="post">
		Name:<input type="text" name="name" value="">
		Pass:<input type="password" name="pass">
		<input type="submit" name="submit">	 
	</form>
</body>
</html>