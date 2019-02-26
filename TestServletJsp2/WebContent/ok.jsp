<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.luve2code.entity.Cv"  %>
<%@ page errorPage="uneereur.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OK</title>
</head>
<body>
Vous avez bien ajouter Monsieur 
<!-- jsp:useBean是一个JSP动作指令，表示装载一个将在JSP页面中使用的JavaBean。
	 其中id表示定义的JavaBean的唯一标识，class表示定义的JavaBean的类。
	 使用scope属性为JavaBean指定作用域，scope的值有四个：page（默认），request，session，application
	 application表示在整个项目的生命周期中都有效，服务器重启后失效。session作用域表示在当前会话周期内有效
	 request作用域表示在当前用户的请求内有效，如果超过了当前请求，则获取不到相应的JavaBean的值。 -->
<jsp:useBean id="cv" class="com.luve2code.entity.Cv" scope="request"/>
<!-- 定义了一个JavaBean就可以为其属性赋值了，可以使用jsp:setProperty动作为JavaBean的属性赋值
	 也可以使用jsp:getProperty动作来获取属性的值。 -->
<!-- 其中name就是在定义JavaBean实例时使用的id，property就是需要获取值的属性名。 -->
<jsp:getProperty property="name" name="cv"/>
<br>
<!-- JSP表达式语言（EL,Expression Language）使得访问存储在JavaBean中的数据变得非常简单, 为了使JSP写起来更加简单。 -->
<!-- jsp标签中的 ${表达式expr}用来输出或者计算一个表达式的内容，比如${3+5}，那么便会在页面上输出8
	 比如${sessionScope.username}，那么便会获取Session里面的username的值，它不能在代码块也就是<百分号 百分号>里使用。 -->
Est il vieux ? : ${cv.age > 18}  <br>
Dans 10 ans il aura : ${cv.age+10 } ans<br>
${cv.age>=18?"majeur":"mineur"} 
<form action="Affiche" method="post"><br>
<button type="submit">Afficher</button>
</form>

<form action="AjouterCv" method="post">
<button type="submit">Nouveau</button>
</form>

<!-- 用于在JSP中显示数据, value要输出的内容, 与<百分号= 百分号>作用相似，优点：可以直接通过"."操作符来访问属性。  -->
<c:out value="${param.autre}"></c:out><!-- 这句没用啊 -->

<!-- 与我们在一般程序中用的if一样, test条件，为‘真’执行 -->
<c:if test="${ !empty param.list }">
Aimerait suivre les cours : <br>
<!-- 根据指定的分隔符来分隔内容并迭代输出,想foreach语句一样。var代表当前条目的变量名称
	 items要被循环的信息，delims分隔符(输入框里用；分割每个元素) -->
<c:forTokens var="autre" items="${ param.list }" delims=";">
<c:out value="${ autre }"></c:out>
</c:forTokens>
</c:if>
<br>
<!-- value要输出的内容 -->
<c:out value="La fin"></c:out>
</body>
</html>