package oppgave1.handleliste.util;

public class gyldigTingUtil {
    
    public static boolean erGyldig(String input){
        if(input == null || input.length() < 3 || input.length() > 30){
            return false;
        }
        return true;
    }
}
