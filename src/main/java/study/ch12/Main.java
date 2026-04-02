package study.ch12;

abstract class AA{

}

class BB extends AA{

}

class CC extends BB{

}

class MM {
    public static void main(String[] args) {
//        AA a = new AA();  상속 불가능
        BB b = new BB();
        AA b2 = new BB();

        //한 번만 쓸 임시로 쓸 클래스를 만들고 싶음
        AA c = new AA(){  //AA객체가 아니라 이름 없는 클래스의 객체임

        };
        AA cc = new CC();
        AA ccc = new BB(){  //BB를 상속받은 이름 없는 클래스의 객체

        };
        BB cccc = new BB(){

        };
        CC bbb = new CC(){

        };
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();  //upcasting
        Cat cat = new Cat();

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal(){ //Animal 추상클래스라서 익명 클래스를 만들고 Animal을 이 익명크래스가 상속 받음 여기에 오버라이드 하는 것
            @Override
            public void eat(){

            }
        };


    }
}
