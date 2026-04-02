package study.ch12;

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
