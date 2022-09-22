package Oppg3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Oppg3 {
    public static void main(String[] args) {
        
        List<Ansatt> ansatte = Arrays.asList(
            new Ansatt("Mikal", "Bo", Kjonn.KVINNE, "nano Ekspert", 110000),
            new Ansatt("Andreas", "Rovik", Kjonn.KVINNE, "Sushisjef", 500000),
            new Ansatt("Frederik", "Mckibben", Kjonn.MANN, "Head Programmer", 800000),
            new Ansatt("Iver", "Sande", Kjonn.MANN, "Golfpro", 1000000)
        );
        //Oppgave A og F
        List<String> etternavnListe = ansatte.stream().map(a -> a.getEtternavn()).toList();
        etternavnListe.stream().forEach(System.out::println);
        //Oppgave B
        long antallKvinner = ansatte.stream().filter(a -> a.getKjonn() == Kjonn.KVINNE).count();
        System.out.println(antallKvinner);
        //Oppgave C
        OptionalDouble gjennomsnittLonn = ansatte.stream().filter(a -> a.getKjonn() == Kjonn.KVINNE).mapToInt(a -> a.getAarslonn()).average();
        System.out.println(gjennomsnittLonn.getAsDouble());
        //Oppgave D
        ansatte.stream().filter(a -> a.getStilling().contains("sjef")).forEach(a -> a.setAarslonn(Math.toIntExact(Math.round(a.getAarslonn()*1.07))));
        ansatte.stream().forEach(System.out::println);
        //Oppgave E
        boolean tjenerOver800 = ansatte.stream().anyMatch(a -> a.getAarslonn() >  800000);
        System.out.println(tjenerOver800);
        //Oppgave G
        Optional<Ansatt> lavestLonn = ansatte.stream().min((a, b) -> a.getAarslonn() - (b.getAarslonn()));
        System.out.println(lavestLonn);
        //h) Finn ut summen av alle heltall i [1, 1000> som er delelig med 3 eller 5. 
        long h = IntStream.range(1, 1000).filter(a -> a%3 == 0 || a%5 == 0).count();
        System.out.println(h);
    }
}
