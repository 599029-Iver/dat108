
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
		<form action="handleliste" method="post">
			<fieldset><legend>Legg til</legend>
			
				<input type="text" name="nyTing"/><br>
				<input type="submit" value="Legg til"/><br>
				
			</fieldset>
		</form>
	<table>
		<tr>
			<th>Vare</th>
			<th>Antall</th>
		</tr>
		<c:forEach var="ListeItem" items="${Handleliste.getItems}">
		<tr> 
			<td>${ListeItem.name}</td>
			<td>${ListeItem.quantity}</td>

		</tr>
		</c:forEach>
	</table>
	
	
</body>

</html>