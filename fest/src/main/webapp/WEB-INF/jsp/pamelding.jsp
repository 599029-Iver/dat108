<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/simple.css">
    <script src="js/pamelding_script.js" defer></script>
</head>
<html>
<h1>Påmelding</h1>
<form action="pamelding" method="post" id="root">
    <label>Fornavn</label><!---->
    <input type="text" placeholder="Fyll inn fornavn" name="fornavn" minlength="2" required pattern="^[A-Z/WÆØÅ]{1}[a-zA-Z/WæøåÆØÅ -]{1,19}" title="Fornavn må starte med stor forbokstav, deretter små"><!--Klarer ikke denne med norske bokstaver-->
 
    <label>Etternavn</label>
    <input type="text" placeholder="Fyll inn etternavn"  name="etternavn" minlength="2" required pattern="^[A-Z/WÆØÅ]{1}[a-zA-Z/WæøåÆØÅ-]{1,19}" title="Etternavn må starte med stor forbokstav, deretter små">
  
    <label>Mobil(8 siffer)</label>
    <input type="text" placeholder="Fyll inn telefonummer" name="mobnr" required pattern="[0-9]{8}" title="Må innoholde 8 siffer, ingen flere ingen færre">
   
    <label>Passord</label>
    <input type="text" placeholder="Velg et passord" name="password" required minlength="8" data-passInput>
  
    <label>Passord Repetert</label>
    <input type="text" placeholder="Gjenta passord" name="passwordRepeat" required minlength="8" data-passRepeat>
 
    <label>Kjonn</label><br>
    <label>Mann<input type="radio" name="kjonn" checked value="Mann"></label>
    
    <label>Kvinne<input type="radio" name="kjonn" value="Kvinne"></label>
    <br>
    
    

    <button type="submit">Meld meg paa</button>
</form>

<a href="login">Allerede registrert? Logg inn her</a>
</html>