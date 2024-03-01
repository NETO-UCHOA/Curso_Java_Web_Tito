<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ble.jsp" method="Get">
	OLÁ!<br>
	Nome: <input type="text" name="name"/><br>
	Númro: <input type="text" name="numero"/>
	<button>OK</button>
</form>
<%
String numeroDigitado = request.getParameter("numero");
String nomeDigitado = request.getParameter("name");
if(numeroDigitado!=null){
	try{
		int numero = Integer.parseInt(numeroDigitado);
		out.print("Olá, " + nomeDigitado + " você digitou: " + numero);
		out.print("<br>");
		out.print("Numero:"+ numero);
		out.print("<br>");
		out.print("Dobro:"+ (numero*2));
	}catch(NumberFormatException e){
		
	}
}
%>
</body>
</html>