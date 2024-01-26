<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>S'inscrire</h1>
	
	<form method="post">
		<label>Nom</label>
		<input type="text" name="NOM_UTILISATEUR">
		<label>Prenom</label>
		<input type="text" name="PRENOM_UTILISATEUR">
		<label>Email</label>
		<input type="text" name="EMAIL_UTILISATEUR">
		<label>Telephone</label>
		<input type="text" name="TELEPHONE_UTILISATEUR">
		<label>Mot De Passe</label>
		<input type="password" name="MDP_UTILISATEUR">
		<input type="submit" value="Envoyer">
	</form>
</body>
</html>