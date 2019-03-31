<%@page import="contro.deletePassage"%>
<%@page import="ent.Elfe"%>
<%@page import="ent.Hobbit"%>
<%@page import="ent.Nain"%>
<%@page import="dao.DaoElfImpl"%>
<%@page import="dao.DaoHobbitImpl"%>
<%@page import="dao.DaoNainImpl"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Afficher</title>
</head>
<body>
<%
	
DaoElfImpl impl=(DaoElfImpl) session.getAttribute("elfImpl");
List<Elfe> list=impl.findAll();
out.println("Table Elfe:<br>");
for(Elfe e: list){
	out.println(e.getId()+"  "+e.getNom()+"  "+e.getRace()+"  "+e.getDesc()+"<a href=\"delete.jsp?id="+e.getId()+"&race="+e.getRace()+" \"> delete </a>"+"<a href=\"update.jsp?id="+e.getId()+"&nom="+e.getNom()+"&race="+e.getRace()+"&desc="+e.getDesc()+" \"> update </a>"+"<br>");
}
out.println("<br><br>");

DaoHobbitImpl impl2=(DaoHobbitImpl) session.getAttribute("hobbitImpl");
List<Hobbit> list2=impl2.findAll();
out.println("Table Hobbit:<br>");
for(Hobbit e: list2){
	out.println(e.getId()+"  "+e.getNom()+"  "+e.getRace()+"  "+e.getDesc()+"<a href=\"delete.jsp?id="+e.getId()+"&race="+e.getRace()+" \"> delete </a>"+"<a href=\"update.jsp?id="+e.getId()+"&nom="+e.getNom()+"&race="+e.getRace()+"&desc="+e.getDesc()+" \"> update </a>"+"<br>");
}
out.println("<br><br>");

DaoNainImpl impl3=(DaoNainImpl) session.getAttribute("nainImpl");
List<Nain> list3=impl3.findAll();
out.println("Table Nain:<br>");
for(Nain e: list3){
	out.println(e.getId()+"  "+e.getNom()+"  "+e.getRace()+"  "+e.getDesc()+"<a href=\"delete.jsp?id="+e.getId()+"&race="+e.getRace()+" \"> delete </a>"+"<a href=\"update.jsp?id="+e.getId()+"&nom="+e.getNom()+"&race="+e.getRace()+"&desc="+e.getDesc()+" \"> update </a>"+"<br>");
}

%>

<form name="delete" action="deletePassage" method="post">
</form>
<form name="update" action="updatePassage" method="post">
</form>

<form action="retour2" method="post">
<input type="submit" value="retour">
</form>

</body>
</html>