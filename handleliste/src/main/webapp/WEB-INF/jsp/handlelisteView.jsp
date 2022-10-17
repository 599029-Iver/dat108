
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>WebShop</title>
	<link rel="stylesheet" href="css/simple.css">
</head>

<body>
		<h1>Din handleliste</h1>
		<form action="login" method="post">
			<fieldset><legend>Legg til</legend>
			
				<input type="text" name="password"/><br>
				<input type="submit" value="Logg inn"/><br>
				
			</fieldset>
		</form>

		<c:forEach var="ListeItem" items="${handleliste.items}"><tr>
			<td>${ListeItem.name}</td>
			<td>${ListeItem.quantity}</td>

		</tr></c:forEach>
	</table><br>
	
	
</body>

</html>