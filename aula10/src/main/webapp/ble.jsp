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
	OL�!<br>
	Nome: <input type="text" name="name"/><br>
	N�mro: <input type="text" name="numero"/>
	<button>OK</button>
</form>
<%
String numeroDigitado = request.getParameter("numero");
String nomeDigitado = request.getParameter("name");
if(numeroDigitado!=null){
	try{
		int numero = Integer.parseInt(numeroDigitado);
		out.print("Ol�, " + nomeDigitado + " voc� digitou: " + numero);
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