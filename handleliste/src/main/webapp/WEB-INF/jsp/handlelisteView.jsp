
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
	<title>Handleliste</title>
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
		<br>
		
		<ul>
		<c:forEach items="${Handleliste}" var="item" >

				<li>${item.name} <button action="handleliste" method="post" type="submit" value="Fjern fra">Slett</button></li>

		</c:forEach>
		</ul>
	
	
</body>

</html>