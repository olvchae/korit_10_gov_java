package study.ch09.ex;

class Test {
    void show(int a) {
        System.out.println("int: " + a);
    }
    void show(double a) {
        System.out.println("double: " + a);
    }
}

public class Main10 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10);
        t.show(10.5);
        t.show('A');
    }
}
