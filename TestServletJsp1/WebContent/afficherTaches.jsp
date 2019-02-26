<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="ServletAffiche" method="get">
<%
//那服务器端session如何建的呢？ 普通htm不会创建，jsp默认是创建的，只要你访问一个任何一个jsp就会创建（不过只创建一次）
//你关闭浏览器从新访问又会创建一个，这些创建的 session由服务器自己控制销毁，你也可以在服务器端代码中销毁。
//JSP文件在编译成Servlet时将会自动加上这样一条语句HttpSession session = HttpServletRequest.getSession(true);
ArrayList<String> poubelle = (ArrayList<String>) session.getAttribute("listeTache");

for(String tache : poubelle )
	out.println(tache);
%>

</form>
</body>
</html>