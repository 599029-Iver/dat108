package no.hvl.fest.util;

import no.hvl.fest.model.registrering;

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
        if(true){
             //Husk meg !!
        }

        return true;
    }
}
