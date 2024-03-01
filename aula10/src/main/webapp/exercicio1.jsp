<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
	Número: <input type="text" name="numero"/>
	<input type="submit" value="Adicionar a lista">
</form>
<h2>Números digitados:</h2>
<%@ page
import="java.util.ArrayList" %>

<%
ArrayList<String> numeros = (ArrayList<String>) session.getAttribute("numeros");
if(numeros == null){
	numeros = new ArrayList<String>();
}
	String numeroDigitado = request.getParameter("numero");
	if(numeroDigitado != null && !numeroDigitado.isEmpty()){
		numeros.add(numeroDigitado);
		session.setAttribute("numeros",numeros);
	}for(String numero: numeros){
		out.println(numero + "<br/>");
	}

%>
	
		

</body>
</html>