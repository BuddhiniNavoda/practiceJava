
//queastion 9

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {
        Integer[] numbers = { 5, 3, 8, 6, 2, 1, 9, 4 };
        Stream<Integer> num = Arrays.stream(numbers);
        num.forEach(System.out::println);
        System.out.println("Squares of the numbers:");
        Stream<Integer> squareNum = Arrays.stream(numbers)
                .map(n -> n * n);

        squareNum.forEach(System.out::println);
        List<Integer> list = squareNum.collect(Collectors.toList());
        System.out.println(list);

    }
}
