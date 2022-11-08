<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Påmeldingsbekreftelse</h1>

<p>Påmeldingen er mottatt for</p>
<a>${registrering.fornavn}</a><br>
<a>${registrering.etternavn}</a><br>
<a>${registrering.mobnr}</a><br>
<a>${registrering.kjonn}</a><br><br>

<a href="deltagere">Trykk her for å gå til deltagerlisten</a>