<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="form.LivreForm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Panier</title>
</head>
<body>
Ces sont les livres et quantites:<br>

<%
ArrayList<LivreForm> liste=(ArrayList<LivreForm>) session.getAttribute("leslivres");

for(LivreForm t: liste){
	out.println(t.getArticle()+" "+t.getQuantite()+"\n");
}
%>

<form action="encore.do" method="post">
<input type="submit" value="encore">
</form>

</body>
</html>