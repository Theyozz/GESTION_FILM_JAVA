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
	<form method="POST">
		<label>Choississez le film</label>
		<select name="ID_FILM">
			<c:forEach items="${films}" var="film">
				<option value=${ film.id }> ${film.nom }</option>
			</c:forEach>
		</select>
		<input type="text" name="URL_IMAGE">
		<input type="submit" value="Ajouter l'image">
	</form>
</body>
</html>