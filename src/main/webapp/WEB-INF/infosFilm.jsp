<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Voici la fiche info du film : ${film.nom } </h4>
	<p>Ce film a été réalisé par ${film.realisateur } et est sortie en ${film.anneeSortie }</p>
	
	<img style="width: 300px" src="${image.url }">
</body>
</html>