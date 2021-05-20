<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/novaEmpresa" var="novaEmpresaUrl" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar empresa</title>
</head>
<body>
	<form action="${novaEmpresaUrl}" method="POST">
		<p>
			Nome: <br>
			<input type="text" name="nome">
		</p>
		<p>
			CNPJ: <br>
			<input type="text" name="cnpj">
		</p>
		<p>
			Data de abertura: <br>
			<input type="date" name="dataAbertura">
		</p>
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>