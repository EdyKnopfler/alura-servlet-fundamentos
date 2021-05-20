<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List, br.com.pip.gerenciador.modelo.Empresa" %>

<!--
   Tomcat 10+:
   https://stackoverflow.com/questions/4928271/how-to-install-jstl-the-absolute-uri-http-java-sun-com-jstl-core-cannot-be-r
 --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/editaEmpresa" var="editaEmpresaUrl" />
<c:url value="/removeEmpresa" var="removeEmpresaUrl" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Empresas</title>
</head>
<body>

<c:if test="${not empty nomeEmpresa}">
	Empresa ${nomeEmpresa} criada com sucesso!
</c:if>

<c:forEach var="e" items="${listaEmpresas}">
	${e.id} -
	<b>${e.nome}:</b> 
	${e.cnpj} 
	(<fmt:formatDate value="${e.dataAbertura}" pattern="dd/MM/yyyy"/>)
	<a href="${editaEmpresaUrl}?id=${e.id}">Editar</a>
	<a href="${removeEmpresaUrl}?id=${e.id}">Remover</a>
	<br>
</c:forEach>

</body>
</html>