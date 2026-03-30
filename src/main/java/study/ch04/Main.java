package study.ch04;

public class Main {
    public static void main(String[] args) {
        String name1 = "김은채";  //문자열 리터럴
        String name2 = "김은채";
        String name3 = new String("김은채"); //name3은 레퍼런스 변수라서 객체가 있는 곳의 주소를 가짐
        boolean result1 = name1 == name2;
        boolean result2 = name1.equals(name3);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(result1);
        System.out.println(result2);
    }
}
