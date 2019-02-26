<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page isErrorPage="true" %>
<h1>une erreur s est servenue</h1>
<%@ page isErrorPage="true" %>
<p>
<%= exception.getMessage() %>
</body>
</html>