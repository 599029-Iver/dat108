
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>WebShop</title>
	<link rel="stylesheet" href="css/simple.css">
</head>

<body>
	
		<c:forEach var="ListeItem" items="${handleliste.items}"><tr>

		</tr></c:forEach>
	</table><br>
	
	
</body>

</html>