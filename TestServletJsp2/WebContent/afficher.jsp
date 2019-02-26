<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.luve2code.entity.Cv"  %>
<%@ page import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Afficher</title>
</head>
<body>

<jsp:useBean id="cvs" class="java.util.ArrayList" scope="session"/>
<!-- 数组没存上，只有一个人 -->
<c:forEach var="temp" items="${cvs}">
   <c:out value="${temp.name}"></c:out>  
</c:forEach>

</body>
</html>