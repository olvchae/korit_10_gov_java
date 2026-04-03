package study.ch14;

import java.util.Objects;

class Teacher{
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {  //다른 패키지 같은 클래스 이름인 게 들어오면 false 뜰 수도 있음
//        if (!(o instanceof Teacher)){
//            return false;
//        }
//        Teacher teacher = (Teacher) o;
//        return this.age == teacher.age && this.name.equals(teacher.name);
//    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Teacher teacher)) return false;  //맞으면 자동으로 다운캐스팅 해라
        return age == teacher.age && Objects.equals(name, teacher.name);
    }


}
public class Equals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김은채", 22);
        Teacher teacher2 = new Teacher("김은채", 22);

        System.out.println(teacher1.equals(teacher2)); //객체를 주소로 비교하지 않고 값으로 비교하겠다.
        System.out.println(teacher1 == teacher2);
    }
}
