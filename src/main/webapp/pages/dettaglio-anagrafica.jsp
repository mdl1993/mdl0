<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>

<html>
<head><title>Anagrafica</title>

        <link href="<spring:url value='/css/font-awesome/font-awesome.min.css' />" rel="stylesheet" type="text/css">
        <link href="<spring:url value='/css/ionicons/ionicons.min.css' />" rel="stylesheet" type="text/css">
        <link href="<spring:url value='/css/bootstrap/bootstrap.min.css' />" rel="stylesheet" type="text/css">
        <link href="<spring:url value='/css/adminlte.min.css' />" rel="stylesheet" type="text/css">
        <link href="<spring:url value='/css/skins/adminlte-skins.min.css' />" rel="stylesheet" type="text/css">
        <link href="<spring:url value='/css/application.css' />" rel="stylesheet" type="text/css">

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic" rel="stylesheet" type="text/css">

        <script src="<spring:url value='/js/jquery.js' />" type="text/javascript"></script>
        <script src="<spring:url value='/js/bootstrap/bootstrap.min.js' />" type="text/javascript"></script>
        <script src="<spring:url value='/js/adminlte.min.js' />" type="text/javascript"></script>
        <script src="<spring:url value='/js/application.js' />" type="text/javascript"></script></head>

<body>
	<h1>Dettaglio Anagrafica</h1>

		<label>First name:</label>
		<b>${anagrafica.nome}</b><br> 
		
		<label>Last name:</label> 
		<b>${anagrafica.cognome}</b><br>

		<label>Fiscal Code:</label> 
		<b>${anagrafica.codiceFiscale}</b><br>
		
		<label>Provincia di nascita:</label> 
		<b>${anagrafica.provinciaNascita.descrizione}</b><br>
		
		<label>Age:</label> 
		<b>${anagrafica.eta}</b><br>

		<label>Sesso:</label> 
		<b>
		<c:if test="${anagrafica.sesso == 'M'}">Maschile</c:if>
		<c:if test="${anagrafica.sesso == 'F'}">Femminile</c:if>
		</b><br>${anagrafica.sesso}

		<label>Categoria protetta:</label>
		<input type="checkbox" <c:if test="${anagrafica.categoriaProtetta}">checked</c:if> disabled /><br>

		<label>curriculum:</label><br> 
		<textarea rows="10" cols="100" name="curriculum" readonly="readonly" >${anagrafica.curriculum}</textarea><br><br>

		<%-- <a href="openUpdate?anagrafica.id=${anagrafica.id}">Modifica</a> 
		<a href="delete?id=${anagrafica.id}">Elimina</a>
		
		<a href="list">Ritorna alla lista</a> --%>
		
		<a href="http://localhost:8080/SpringApp2/anagrafica/openUpdate/${anagrafica.id}">Modifica</a>

		
		<a href="http://localhost:8080/SpringApp2/anagrafica/delete/${anagrafica.id}">Elimina</a>
		
			<a href="http://localhost:8080/SpringApp2/anagrafica/list">Ritorna alla lista</a>
		
</body>
</html>