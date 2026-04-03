package study.ch14;

import java.util.Arrays;
import java.util.Objects;

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);  //이 두 개의 해쉬값을 더해서 새로운 해쉬 값으로 만들어줌
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class HashCode {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 10);
        Dog dog2 = new Dog("콩이", 10);
        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode());
        Dog[] dogs = {
                new Dog("콩이이", 11),
                new Dog("콩이", 12),
                new Dog("콩삼", 10),
                new Dog("콩알", 11)
        };
        int hashCode = Objects.hash("콩이", 10);
        Dog foundDog = null;
        for (Dog d : dogs){
            if(d.hashCode() == hashCode){
                foundDog = d;
                break;
            }
        }
        System.out.println(Arrays.toString(dogs));
    }
}

