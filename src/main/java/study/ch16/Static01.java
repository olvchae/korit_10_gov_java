package study.ch16;

import lombok.*;
import study.ch15.Main;

@Getter
@Setter
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true)
class Student{
    @ToString.Include
    private String name;
    @ToString.Include
    private static String schoolName;

    public static void setSchoolName(String schoolName){
        Student.schoolName = schoolName;
    }

    public static String getSchoolName(){
        return schoolName;
    }

    public static Student getNewStudent(String name){
        Student student = new Student();
        student.setName(name);
        return student;
    }
}
public class Static01 {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("김은채");

        Student.setSchoolName("동의대학교");
        System.out.println(Student.getSchoolName());

        Student student = new Student();
        student.setName("김은채");
        System.out.println(student);

        Student student2 = Student.getNewStudent("김은채");

    }
}