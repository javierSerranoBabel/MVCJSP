<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Lista de libros</title>
</head>
<body>
<h1>Lista de libros</h1>
<c:forEach items="${libros}" var="libro">
<div style="float:left;border:1px solid gray;margin:1rem;">
<h2>${libro.getTitulo()}</h2>
<p>${libro.getIsbdn()}</p>
<p>${libro.getAutor()}</p>
</div>
</c:forEach>
</body>
</html>