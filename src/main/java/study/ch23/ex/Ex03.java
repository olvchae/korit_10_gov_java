package study.ch23.ex;

import java.util.logging.Filter;
import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        Stream<Integer> numList = Stream.of(3, 7, 9, 4, 11, 6);
        Stream<Integer> numList2 = numList.filter(num -> num >= 5).map(num -> num * 3);
        System.out.println(numList2.toList());
    }
}
