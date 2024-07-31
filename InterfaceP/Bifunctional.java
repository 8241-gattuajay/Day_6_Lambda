package InterfaceP;

import java.util.function.BiFunction;

public class Bifunctional {
    public static void main(String[] args) {
        BiFunction<String,String,String> str= (a, b)-> a+" "+b;
        System.out.println(str.apply("Ajay","Kishore"));
    }
}
