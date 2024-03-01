<%@page import="aula12.model.Cao"%>
<%@page import="aula12.model.Animal"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>SUCESSO!!</h2>
<%
ArrayList<Animal> lista = (ArrayList<Animal>)request.getAttribute("lista");
if(lista!=null){
	for(Animal cao: lista){
		out.print(cao.getNome() + "<br/>");
	}
}

%>
</body>
</html>