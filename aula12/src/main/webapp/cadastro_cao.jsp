<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Cadastro de Cão</h2>

<form action="CadastroCao" method="POST">
	Nome: <input type="text" name="nomeCao"/><br/>
	Sexo: <input type="text" name="sexoCao"/><br/>
	Raça: <input type="text" name="racaCao"/><br/>
	<button>Salvar</button>
</form>

</body>
</html>