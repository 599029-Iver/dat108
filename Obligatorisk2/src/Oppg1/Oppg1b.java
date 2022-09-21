package Oppg1;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Oppg1b {

    public static void main(String[] args) {
        int a = beregn(2, 4, (d, e) -> d + e);

        int b = beregn(-5, 3, (d, e) -> Math.max(d, e));

        int c = beregn(54, 45, (d, e) -> Math.abs(d - e));
        
        System.out.println(a);

        System.out.println(b);

        System.out.println(c);



        
    }
    public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> c){
        return c.apply(a, b);
    }



}
