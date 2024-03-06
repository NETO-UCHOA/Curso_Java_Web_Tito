<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Espécie</h4>
<%out.print(request.getParameter("Especie")); %>
<br><br>
<h4>Nome</h4>
<%out.print(request.getParameter("Nome")); %>
<br><br>
<h4>Sexo</h4>
<%out.print(request.getParameter("Sexo")); %>
<br><br>

</body>
</html>