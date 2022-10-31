package oppgave1.handleliste.util;

import java.io.Console;

import org.springframework.beans.factory.annotation.Value;

public class passwordCheck {
    
    @Value("${app.correctPass}") private String CORRECT_PASSWORD;

    public boolean isCorrectPass(String inputPass, String correct){
        if(inputPass.compareTo(correct) == 0){
       // if(inputPass.compareTo("password") == 0){
            return true;
        }
        System.out.println("falskt");
        return false;
        
    }
    
}
