package study.ch11;

class Animal{
    private String name;

    public Animal(){ //기본 생성자

    }

    //전체 생성자 (AllargumentsConstructor)
    public Animal (String name){ //자식에게서 받아오기 위해
        this.name = name;
        showInfo();
    }

    public void eat() {
        System.out.println(name + "(이) 밥을 먹는다");
    }

    public String getName(){
        return name;
    }

    public void showInfo(){
        System.out.println("이름: " + name);
    }
}

class Dog extends Animal{

    private String breed;

    public Dog(String name, String breed){
        super(name); //부모로 넘겨줌
        this.breed = breed;
    }

    public void bark(){
        System.out.println(getName() + "(이)가 멍멍한다");
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("품종: " + breed);
    }


}

class Cat extends Animal{
    private String color;

    public Cat(String name, String color){
        super(name);
        this.color = color;
    }

    public void grooming(){
        System.out.println(getName() + "(이)가 그루밍을 한다");
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("색상: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("바둑이", "진돗개");
        Cat cat = new Cat("야옹이", "검은색");

        dog.eat();
        cat.eat();

        dog.bark();
        cat.grooming();

        dog.showInfo();
        cat.showInfo();

        Animal[] animals = new Animal[6];

        animals[0] = new Animal("그냥 동물");
        animals[1] = new Cat("야옹이" , "화이트");
        animals[2] = new Dog("콩이", "망티즈");
        animals[3] = new Dog("두부", "말티즈");
        animals[4] = new Cat("네모", "블랙");
        animals[5] = new Animal("무슨 동물");

        for (Animal a : animals){
            a.showInfo();
            if (a instanceof Dog){
                ((Dog) a).bark();
            } else if ( a instanceof Cat){
                ((Cat) a).grooming();
            } else {
                System.out.println("추가 기능 없음");
            }
        }

        double d = 10;
        Animal a = new Dog("a", "b"); //upcasting
    }
}
