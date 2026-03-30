package study.ch07.ex;

public class Ex33 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 7 == 0) {
                break;
            }
            System.out.print(i + " ");
        }
    } // 1 2 3 4 5 6
}
