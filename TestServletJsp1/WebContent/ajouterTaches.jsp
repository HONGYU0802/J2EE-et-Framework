<!-- 要在html页面直接写后台代码时，别忘记基础设置和导包 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="entity.Login" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajouterTaches</title>
</head>
<body>
Ici ajouterTaches Page, Welcome:&nbsp; 
<!-- 运行、获取后台代码或值。之间可以写服务器端代码,获取后台的变量值
后台一个session["ab"]="ab";前台 session["ab"]就能取到值； -->
<%
//public Object getAttribute(String name)
//该方法返回在该 session 会话中具有指定名称的对象，如果没有指定名称的对象，则返回 null。
	Login log = (Login) session.getAttribute("titi");
	out.println(log.getNom());
%>
<br>
<!-- 直接输出字符串 -->
<%="I can print pass: "+log.getPass() %>
<br>
Listes des taches a faire:
<!-- 添加tache按钮 -->
<form action="ServletAjoute" method="post">
	tache : <input type="text" name="latache"><br>
	<input type="submit" value="ajouter une tache">
</form>
<!-- 展示tache按钮 -->
<form action="ServletAffiche" method="post">
	<input type="submit" value="afficher des taches">
</form>

</body>
</html>