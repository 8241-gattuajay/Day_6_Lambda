package InterfaceP;

import java.util.function.Function;

public class Radiuscircle {
    public static void main(String[] args) {
        Function<Integer,Double> area=a-> 3.14*a*a;

        System.out.println(area.apply(5));
    }
}
