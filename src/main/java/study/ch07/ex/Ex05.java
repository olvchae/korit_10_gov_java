package study.ch07.ex;

public class Ex05 {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("운전 가능");
        } else {
            System.out.println("운전 불가");
        }
        //운전 가능
    }
}
