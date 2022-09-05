package Oppgave3;

public class Kokk extends Thread{
    private HamburgerBrett brett;
    private String navn;

    public Kokk(HamburgerBrett brett, String navn){
        this.brett = brett;
        this.navn = navn;
    }


    public void run(){
        
        
        
        while(true){
            try {
                Thread.sleep((4000 + (long) (Math.random() * (6000 - 4000))));
            } catch (InterruptedException e) {
                
            }
            
            System.out.println(navn + "(kokk) legger på en hamburger" + brett.addBurger(this.navn));
            
            
        }
        
    }

    

    
    
}
