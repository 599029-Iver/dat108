package oppgave1;

public class writeEverySecondThread extends Thread{

    private String write = "Hello world";

    public void setWrite(String write){
        this.write = write;
    }
    
    public void run(){
        
        while(write != "quit"){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
            System.out.println(write);

        }
    }
}