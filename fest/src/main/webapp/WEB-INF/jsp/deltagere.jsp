<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<p>
    <a>Innlogget som : </a>
    <a>${registrering.mobnr} / </a>
    <a>${registrering.fornavn}</a>
    <a>${registrering.etternavn}</a>
</p>

<table>
    <th>Kjønn</th>
    <th>Navn</th>
    <th>Mobilnummer</th>
    <c:forEach items="${registrerte}" var="person">
        <tr>
            <td><c:out value="${person.kjonn}"/></td>
            <td><c:out value="${person.fornavn} "/><c:out value="${person.etternavn}"/></td>
            <td><c:out value="${person.mobnr}"/></td>
        </tr>

    </c:forEach>
</table>