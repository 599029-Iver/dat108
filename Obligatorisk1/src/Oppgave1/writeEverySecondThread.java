package Oppgave1;

public class writeEverySecondThread extends Thread{
    private String write = "Hello world";

    public void setWrite(String write){
        this.write = write;
    }

    public void run(){
        
        while(write.compareTo("quit") != 0){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                
            }
            System.out.println(write);

        }
    }
}
