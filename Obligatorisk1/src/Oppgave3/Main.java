package Oppgave3;

public class Main {
    public static void main(String[] args) {
        final String[] kokker = {"Kibben", "Rovik", "Iver"};
        final String[] moffler = {"Mikal", "Mikki"};
        final int KAPASITET = 4;

        HamburgerBrett brett = new HamburgerBrett(KAPASITET);

        for (String navn : kokker) {
            new Kokk(brett, navn).start();
        }
        for (String navn : moffler) {
            new Moffler(brett, navn).start();
        }
    }
    
}
