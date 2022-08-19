import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("amanda", "alex", "sandy", "alina", "skye");

        myList.stream().map(String::toUpperCase).forEach(result -> System.out.println(result));

        Stream.of("amanda", "alex", "sandy", "alina", "skye").map(String::toUpperCase)
                .forEach(System.out::println);

        List<String> output =
        Stream.of("amanda", "alex", "sandy", "alina", "skye").map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(output);

        int cat = Stream.of(1,2,3,4,5,6,7)
                .reduce(0, (sum, num)->sum += num);

        System.out.println(cat);

        Stream.of(1,2,3,4,5,6,7)
                .filter((num)->num % 2 == 0)
                .forEach(System.out::println);

        Stream.of(7,5,34,2,23,324,543,25,24,524)
                .sorted()
                .limit(4)
                .forEach(System.out::println);

        double kitten = Stream.of(7,5,34,2,23,324,543,25,24,524)
                .mapToInt((n)->n)
                .average().getAsDouble();
        System.out.println(kitten);
    }
}
