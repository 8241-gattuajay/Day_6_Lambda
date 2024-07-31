package InterfaceP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sumofsquares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<Integer> filtered=list.stream().filter(li-> li%2==0).map(n->n*n).collect(Collectors.toList());
         int result=filtered.stream()
                .reduce(0,Integer::sum);

        System.out.println(result);
    }
}
