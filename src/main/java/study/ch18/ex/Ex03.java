package study.ch18.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
class Student {
    private String name;
    private int id;
    private static int nextId;

    Student (String name, int id) {
        this.name = name;
        id = nextId;
        nextId++;
    }

    public static int getStudentCount(){
        return nextId;
    }
}
public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student("김", 1);  // id=1
        Student s2 = new Student("이", 2);  // id=2
        Student s3 = new Student("박", 3);  // id=3
        System.out.println(Student.getStudentCount());
    }
}
