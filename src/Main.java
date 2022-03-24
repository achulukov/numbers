import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
       ArrayList<Integer> list =  (ArrayList<Integer>) Stream.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4).collect(Collectors.toList());
        list.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

}


