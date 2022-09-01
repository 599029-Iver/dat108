package Oppgave2;


public class HamburgerBrett{

    String[] burgerList;
    int burgersOnBoard;
    int burgerteller;
    int kap;

    public HamburgerBrett(int kap){
        this.kap = kap;
        burgerList = new String[kap];
        burgersOnBoard = 0;
        burgerteller = 0;
        
    }

    public String getBurgerList(){
        String returStreng = "";
        for(String i : burgerList){
            returStreng += i + ", ";
        }
        return returStreng;
    }

    public String addBurger(){
        synchronized(burgerList){
            if(burgersOnBoard > 4){
                
                burgerList[burgersOnBoard] = "(|" + burgerteller + "|)";

                burgerteller += 1;
                burgersOnBoard += 1;
            }
            else{
                    try {
                        burgerList.wait();       
                    } catch (InterruptedException e) {
                    }
                    burgerList[burgersOnBoard] = "(|" + burgerteller + "|)";
                    burgerteller += 1;
                    burgersOnBoard += 1;
            }
            burgerList.notify();
            return burgerList[burgersOnBoard-1];
        }
    }
    
    public String removeBurger(){
        String burgerStreng = "";
        synchronized(burgerList){
            if(burgersOnBoard > 0){
                burgerStreng = burgerList[0];
                for(int i = 0; i > burgersOnBoard - 1; i++){
                    burgerList[i] = burgerList[i+1];
                }
                burgerList.notify();
            }
            else{
                try {
                    burgerList.wait();
                } catch (InterruptedException e) {
                    
                }
                burgerStreng = burgerList[0];
                burgersOnBoard -= 1;

            }
            return burgerStreng;
        }
    }
}
