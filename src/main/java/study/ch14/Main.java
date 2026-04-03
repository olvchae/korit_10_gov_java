package study.ch14;

class Animal {

}

class Duck extends Animal { //원래 Object 상속받다가 Animal 받게 되는 거임

}

public class Main {
    public static void main(String[] args) {
        // 최상위 객체 (Object)
        Object a = 10;
        Object b = 3.14;
        Object c = "김은채";
        Object d = 'a';
        Object e = new Animal();

        //Wrapper Class
        Integer integer = (Integer) 10;  //일반 자료형을 클래스 자료형으로 바꿈 (박싱)
        int i = integer; // 언박싱
        //자바는 박싱 언박싱 자동 -> AutoBoxing

        int i2 = 12;
        Integer integer2 = null;

        System.out.println(((int)a) + ((double)b));


    }
}
