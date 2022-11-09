<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/simple.css">
    <script href="js/pamelding_script.js"></script>
</head>
<html>
<h1>Påmelding</h1>
<form action="pamelding" method="post">
    <label>Fornavn</label><!--^[A-Z]{1}[a-z]{1-19}-->
    <input type="text" placeholder="Fyll inn fornavn" name="fornavn" required minlength="2" maxlength="20" pattern="^[A-Z\WÆØÅ]{1}[a-z-\WÆØÅæøå]{1-19}+$">
 
    <label>Etternavn</label>
    <input type="text" placeholder="Fyll inn etternavn"  name="etternavn" required minlength="2" maxlength="20" pattern="^[A-Z\WÆØÅ].*">
  
    <label>Mobil(8 siffer)</label>
    <input type="text" placeholder="Fyll inn telefonummer" name="mobnr" required pattern="[0-9]{8}">
   
    <label>Passord</label>
    <input type="text" placeholder="Velg et passord" name="password" required>
  
    <label>Passord Repetert</label>
    <input type="text" placeholder="Gjenta passord" name="passwordRepeat" required>
 
    <label>Kjonn</label><br>
    <label>Mann<input type="radio" name="kjonn" checked value="Mann"></label>
    
    <label>Kvinne<input type="radio" name="kjonn" value="Kvinne"></label>
    <br>
    
    

    <button type="submit">Meld meg paa</button>
</form>

<a href="login">Allerede registrert? Logg inn her</a>
</html>