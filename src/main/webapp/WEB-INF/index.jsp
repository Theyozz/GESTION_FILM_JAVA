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
		<li> <a href="infosFilm?id=${film.id }">${film.nom}</a> réalisé par ${film.realisateur } sorti en ${film.anneeSortie }</li>
	</ul>	
	</c:forEach>
	
	<a href="ajoutFilm">Ajouter un film</a>
	<br/>
	<br/>
	<a href="ajoutImage">Ajouter une image à un film</a>
	
	<h1>Liste des utilisateurs</h1>
	<c:forEach items="${utilisateurs}" var="utilisateur">
			<li>${utilisateur.nom } ${utilisateur.prenom } | <a href="supprimerUtilisateur?id=${utilisateur.id }">Supprimer</a> | <a href="modifierUtilisateur?id=${utilisateur.id }">Modifer</a></li>
	</c:forEach>
</body>
</html>