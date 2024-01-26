<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ajout film</h1>
	
	<form method="post">
		<label>Nom</label>
		<input type="text" name="NOM_FILM">
		<label>Realisateur</label>
		<input type="text" name="REALISATEUR_FILM">
		<label>Année de sortie</label>
		<input type="number" name="ANNEE_SORTIE_FILM">
		<input type="submit" value="Envoyer">
	</form>
</body>
</html>