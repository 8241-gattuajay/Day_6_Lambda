package InterfaceP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterS {
    public static void main(String[] args) {
        List<String> list= List.of("Ajay","Bot","Goat","Ahanu");

        list.stream()
                .filter(var -> var.startsWith("A")).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
