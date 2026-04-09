package study.ch23.ex;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        Stream<Integer> num = Stream.of(5, 12, 3, 8, 20, 1);
        Stream<Integer> list = num.filter(n -> n >= 10);
        System.out.println(list.toList());
    }
}
