package study.ch09.ex;

class Printer {
    void print(int n) {
        System.out.println("정수: " + n);
    }
    void print(String s) {
        System.out.println("문자열: " + s);
    }
    void print(int n, String s) {
        System.out.println(n + "번 " + s);
    }
}
public class Main08 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(42);
        p.print("Hello");
        p.print(3, "Java");
    }
}
