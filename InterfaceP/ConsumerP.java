package InterfaceP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerP {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Ajaygattu","Botesh","Bot","Good");

        Consumer<String> upper= s->System.out.println(s.toUpperCase());

        str.forEach(upper);
    }
}
