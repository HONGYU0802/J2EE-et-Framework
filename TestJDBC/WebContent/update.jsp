<%@page import="ent.Nain"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
<%
String str0=request.getParameter("id");
String str1=request.getParameter("nom");
String str2=request.getParameter("race");
String str3=request.getParameter("desc");
%>
<form action="updatePassage" method="post">

<input type="hidden" name="id" value="<%=str0%>">
<label for "nom"> Nom: </label><input type="text" name="nom" id="nom" value=<%=str1 %>><br>

<label for "race"> Race: </label>

<select name="race" id="race">
<option value="elfe" <%=str2.equals("elfe")?"selected":"" %>>elfe</option>
<option value="nain" <%=str2.equals("nain")?"selected":"" %>>nain</option>
<option value="hobbit" <%=str2.equals("hobbit")?"selected":"" %>>hobbit</option>
</select>

<label for "desc"> Description: </label><input type="text" name="desc" id="desc" value=<%=str3 %>><br>

<input type="submit" value="update">
</form>

<form action="retour" method="post">
<input type="submit" value="giveup">
</form>
</body>
</html>