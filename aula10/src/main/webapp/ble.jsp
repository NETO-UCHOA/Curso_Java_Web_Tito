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
<h1>BLE.JSP</h1>
<form action="ble.jsp" method="GET">
	<input type="text" name="numero"/>
	<button>OK</button>
</form>

<a href="ble.jsp?remove=2">ISSO É UM LINK</a>
<br>
<%
String remove = request.getParameter("remove");
if(remove!=null){
	out.print("removendo: " + remove);
}

String numeroDigitado = request.getParameter("numero");
if(numeroDigitado!=null){
	try{
		int numero = Integer.parseInt(numeroDigitado);
		out.print("Numero: " + numero);
		out.print("<br>");
		out.print("Dobro: " + (numero*2));
	}catch(NumberFormatException e){
		response.sendRedirect("index.html");
	}
	
}
%>
</body>
</html>