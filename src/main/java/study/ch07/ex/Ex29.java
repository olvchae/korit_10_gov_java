package study.ch07.ex;

public class Ex29 {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }//5
}
