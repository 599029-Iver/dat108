package Oppgave2;

public class Moffler extends Thread{
    private HamburgerBrett brett;
    private String navn;

    public Moffler(HamburgerBrett brett, String navn){
        this.brett = brett;
        this.navn = navn;
    }
    
    public void run(){
        while(true){
            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                
            }
            System.out.println(navn + " spiser en burger, typisk " + navn + brett.removeBurger());
            
            
        }
        
    }
}
