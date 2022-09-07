package Oppgave3;

public class Servitor extends Thread{
    private HamburgerBrett brett;
    private String navn;

    public Servitor(HamburgerBrett brett, String navn){
        this.brett = brett;
        this.navn = navn;
    }
    
    public void run(){
        while(true){
            
            try {
                Thread.sleep((4000 + (long) (Math.random() * (6000 - 4000))));
            } catch (InterruptedException e) {
                
            }
            System.out.println(navn + "(servitor) tar en burger " + navn + brett.removeBurger(this.navn));
            
            
        }
        
    }
}
