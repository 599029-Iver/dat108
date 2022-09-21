package Oppg2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Oppg2 {

    public static void main(String[] args) {

        List<Ansatt> ansatte = Arrays.asList(
            new Ansatt("Mikal", "Bo", Kjonn.MANN, "nano Ekspert", 110000),
            new Ansatt("Andreas", "Rovik", Kjonn.MANN, "Sushichef", 500000),
            new Ansatt("Frederik", "Mckibben", Kjonn.MANN, "Head Programmer", 800000),
            new Ansatt("Iver", "Sande", Kjonn.MANN, "Golfpro", 1000000)
        );

        int fastKronetillegg = 500;

        lonnsoppgjor(ansatte, a -> fastKronetillegg);

        ansatte.stream().forEach(System.out::println);

        lonnsoppgjor(ansatte, a -> Math.toIntExact(Math.round(a.getAarslonn()*0.2)));

        ansatte.stream().forEach(System.out::println);

        lonnsoppgjor(ansatte.stream().filter(a -> a.getAarslonn() > 600000).toList(), a -> fastKronetillegg);

        ansatte.stream().forEach(System.out::println);

        lonnsoppgjor(ansatte.stream().filter(a -> a.getKjonn() == Kjonn.MANN).toList(), a -> Math.toIntExact(Math.round(a.getAarslonn()*0.2)));

        ansatte.stream().forEach(System.out::println);
        
    }
    private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt , Integer> endring){
        ansatte.stream().forEach(a -> a.setAarslonn(a.getAarslonn() + endring.apply(a)));
    }
    
}
