package InterfaceP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lengthgr {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Ajaygattu","Botesh","Bot","Good");

        Predicate<String> length=s->s.length()>5;

        Predicate<String> sub=s2->s2.contains("Aj");

        str.stream().filter(length.and(sub)).forEach(System.out::println);
    }
}
