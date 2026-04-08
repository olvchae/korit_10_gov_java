package study.ch21.ex;

public class Ex02 {
    public static void main(String[] args) {
        String input = "abc123";
        try{
            System.out.println(input);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다.");
        }
    }
}
