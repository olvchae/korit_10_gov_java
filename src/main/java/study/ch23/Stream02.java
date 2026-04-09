package study.ch23;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(10, 20, 30, 40);

        Stream<Integer> numStream2 = numStream.map(num -> num * 10); // map() 중간 연산

        Stream<Integer> numStream3 = numStream2.filter(num -> num % 3 != 0);

        System.out.println(numStream3.toList());
//        System.out.println(numStream2.toList()); // 이미 위에서 다 출력으로 썼기 때문에 몬 써요

    }
}
