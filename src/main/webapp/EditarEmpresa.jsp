<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/alteraEmpresa" var="alteraEmpresaUrl" />
<fmt:formatDate value="${empresa.dataAbertura}" pattern="yyyy-MM-dd" var="theData"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alterar empresa</title>
</head>
<body>

	<form action="${alteraEmpresaUrl}" method="POST">
		<p>
			Nome: <br>
			<input type="text" name="nome" value="${empresa.nome}">
		</p>
		<p>
			CNPJ: <br>
			<input type="text" name="cnpj" value="${empresa.cnpj}">
		</p>
		<p>
			Data de abertura: <br>
			<input type="date" name="dataAbertura" value="${theData}">
		</p>
		<input type="hidden" name="id" value="${empresa.id}">
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>