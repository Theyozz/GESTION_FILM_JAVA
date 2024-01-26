<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		<label>Nom</label>
		<input value="${utilisateur.nom }" type="text" name="NOM_UTILISATEUR">
		<label>Prenom</label>
		<input value="${utilisateur.prenom }" type="text" name="PRENOM_UTILISATEUR">
		<label>Email</label>
		<input value="${utilisateur.email }" type="text" name="EMAIL_UTILISATEUR">
		<label>Telephone</label>
		<input value="${utilisateur.telephone }" type="text" name="TELEPHONE_UTILISATEUR">
		<label>Mot De Passe</label>
		<input value="${utilisateur.motDePasse }" type="password" name="MDP_UTILISATEUR">
		<input type="submit" value="Envoyer">
	</form>
</body>
</html>