<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajouterAfficher</title>
</head>
<body>

Ajouter les livres:

<form action="ajouter.do" method="post">
	<input type="text" name="article">
	<input type="text" name="quantite"><br>	
	<input type="submit" value="ajouter" name="ajouter">	
</form>

<form action="afficher.do" method="post">
<input type="submit" value="panier" name="panier">
</form>

</body>
</html>