<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion Film</title>
</head>
<body>
	<a href="ajoutUtilisateur">S'inscrire</a>
	<h1>Liste des films</h1>
	<c:forEach items="${films}" var="film">
	<ul>
		<li>${film.nom} réalisé par ${film.realisateur } sorti en ${film.anneeSortie }</li>
	</ul>	
	</c:forEach>
	
	<a href="ajoutFilm">Ajouter un film</a>
</body>
</html>