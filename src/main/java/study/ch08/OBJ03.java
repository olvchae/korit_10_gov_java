package study.ch08;

public class OBJ03 {
    public static void main(String[] args) {
        class Student{
            String name;
            int age;

            Student (String name, int age) {
                System.out.println("학생 생성");
                this.name = name;
                this.age = age;
            }//지역 변수 > 전역 변수
        }


        Student s1 = new Student("김은채", 22);
        Student s2 = new Student("김은치", 23);

    }
}
