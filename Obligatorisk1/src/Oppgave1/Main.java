package Oppgave1;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        writeEverySecondThread nyTraad = new writeEverySecondThread();
        nyTraad.start();
        
        while(true){
            String write = javax.swing.JOptionPane.showInputDialog("Skriv inn en melding, quit for aa slutte");
            nyTraad.setWrite(write);
            if(write.compareTo("quit") == 0){
                break;
            }

        }    
    
    }
}
