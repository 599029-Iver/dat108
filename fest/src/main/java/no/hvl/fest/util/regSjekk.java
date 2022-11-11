package no.hvl.fest.util;

import no.hvl.fest.model.registrering;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regSjekk {
    
    public regSjekk(){

    }

    public boolean gyldig(registrering nyRegistrering, registreringService regServ){
        //sjekker at mobilnummeret er riktig lengde
        if(nyRegistrering.getMobnr().length() != 8){
            return false;
        }
        //sjekk om mobil finnes i database
        if(regServ.finnMedNr(nyRegistrering.getMobnr()) != null){
            return false;
        }        
        //sjekk om regexp
        if(!Pattern.matches("^[A-Z/WÆØÅ]{1}[a-zA-Z/WæøåÆØÅ -]{1,19}", nyRegistrering.getFornavn()) 
           || !Pattern.matches("^[A-Z/WÆØÅ]{1}[a-zA-Z/WæøåÆØÅ-]{1,19}", nyRegistrering.getEtternavn())){
            System.out.println("kom hit jajamen");
             return false;
        }

        return true;
    }
}
