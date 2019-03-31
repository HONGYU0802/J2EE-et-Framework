<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dao.DaoElfImpl"%>
<%@page import="ent.Elfe"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>
vous etez sur???
<%
String str=request.getParameter("id");
int id = Integer.parseInt(str);
String str2=request.getParameter("race");
%>

<form action="deletePassage" method="post">
<input type="hidden" name="idd" value="<%=id%>">
<input type="hidden" name="race" value="<%=str2%>">
<input type="submit" value="oui">
</form>

<form action="retour" method="post">
<input type="submit" value="non">
</form>

</body>
</html>