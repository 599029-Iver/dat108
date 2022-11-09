<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/simple.css">
</head>
<body>
	<p style="color:red"></p>
	
	<form action="login" method="post">
		<fieldset><legend>Logg Inn</legend>
		
			Mobilnummer:<br> <input required pattern="[0-9]{8}" type="text" name="mobnr"/><br>
			Passord:<br> <input required type="text" name="password"/><br>
			<input type="submit" value="Logg inn"/><br>
			
		</fieldset>
	</form>
</body>
</html>