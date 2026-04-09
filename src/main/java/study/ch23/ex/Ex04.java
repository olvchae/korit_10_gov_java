package study.ch23.ex;

import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        Stream<String> strList = Stream.of("java", "python", "c++", "javascript", "go");
        Stream<String> strList2 = strList.filter(str -> str.length() >= 4).map(str -> str.toUpperCase());
        System.out.println(strList2.toList());
    }
}
