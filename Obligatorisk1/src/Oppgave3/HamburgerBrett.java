package Oppgave3;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class HamburgerBrett{

    BlockingQueue<String> brett;
    int kap;
    int burgerteller;

    public HamburgerBrett(int kap){
        this.kap = kap;
        brett = new LinkedBlockingQueue<>(4);
    }

    public String getBurgerList(){
        String returStreng = "";
        Iterator<String> ittern = brett.iterator();
        while(ittern.hasNext()){
            returStreng += ittern.next();
        }
        return returStreng;
    }
 
    public String addBurger(String navn){
            String burgerLaget = "</" + burgerteller + "/>";
            try {
                brett.put(burgerLaget);
            } catch (InterruptedException e) {

            }
            
            burgerteller += 1;

            return burgerLaget + " Det er naa disse burgerene paa brettet : " + getBurgerList();
        
    }
    
    public String removeBurger(String navn){
        String burgerStreng = "";
        try {
            burgerStreng = brett.take();
        } catch (InterruptedException e) {

        }
        

        return burgerStreng + " Det er naa disse burgerene paa brettet : " + getBurgerList();
        
    }
}
