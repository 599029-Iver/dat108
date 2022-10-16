package oppgave1.handleliste.util;

import java.io.Console;

import org.springframework.beans.factory.annotation.Value;

public class passwordCheck {
    
    @Value("${app.correctPass}") private static String CORRECT_PASSWORD;

    public static boolean isCorrectPass(String inputPass){
       // if(inputPass.compareTo(CORRECT_PASSWORD) == 0){
        if(inputPass.compareTo("password") == 0){
            return true;
        }
        System.out.println("falskt");
        return false;
        
    }
    
}
