<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Loja Animais</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
  <h2>Loja Animais</h2>
  <form action="Receber.jsp">
    <div class="mb-3 mt-5">
      <label for="Espécie">Espécie:</label>
      <input type="Especie" class="form-control" id="Especie" placeholder="Digite a Espécie" name="Especie">
    </div>
    <div class="mb-3">
      <label for="Nome">Nome:</label>
      <input type="Nome" class="form-control" id="Nome" placeholder="Digite o nome" name="Nome">
    </div>
    <div class="mb-3">
      <label for="Sexo">Sexo:</label>
      <input type="Sexo" class="form-control" id="Sexo" placeholder="Digite o sexo" name="Sexo">
    </div>
    <button type="submit" class="btn btn-primary">Enviar</button>
  </form>
</div>

</body>
</html>


