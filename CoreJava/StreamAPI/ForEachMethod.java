import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 56, 23, 57, 48, 20, 445);

        // Normal for loop
        // for (int i = 0; i < numbers.size(); i++)
        // System.out.println(numbers.get(i));

        // Enhanced for loop
        // for (int n : numbers)
        // System.out.println(n);

        // ForEach method for loop
        // numbers.forEach(n -> System.out.println(n));

        // Consumer<Integer> consumer = new Consumer<Integer>() {
        // public void accept(Integer num) {
        // System.out.println(num);
        // }
        // };
        // Consumer<Integer> consumer = num -> System.out.println(num);

        // numbers.forEach(consumer);

        // numbers.forEach(num -> System.out.println(num));

        // Stream<Integer> s1 = numbers.stream();
        // // s1.forEach(n -> System.out.println(n));
        // // s1.forEach(n -> System.out.println(n)); // can not use single stream more
        // // than once
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // // s2.forEach(n -> System.out.println(n));
        // Stream<Integer> s3 = s2.map(n -> n / 2);
        // // s3.forEach(n -> System.out.println(n));
        // int sum = s3.reduce(0, (c, e) -> c + e);
        // System.out.println(sum);

        int sum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num / 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println(sum);

        Comparator<Integer> valueComparator = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b > a ? 1 : -1;
            }
        };
        Stream<Integer> sortedValues = numbers.stream().sorted(valueComparator);
        sortedValues.forEach(System.out::println);
    }
}
