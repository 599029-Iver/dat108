import java.util.function.Function;

public class Oppg1b {

    public static public static void main(String[] args) {
        beregn(2, 4, summerFunksjon);
        
    }
    public static int beregn(int a, int b, Function<Integer, Integer> c){
        return c();
    }
    public static int summerFunksjon(int a, int b){
        return a + b;
    }
}
