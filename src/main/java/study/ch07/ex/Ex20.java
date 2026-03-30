package study.ch07.ex;

public class Ex20 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 0; i < 5 - i; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
