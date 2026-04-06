package study.ch18.ex;

class Student {
    private String name;
    private int id;
    private static int nextId;

    Student (String name){
        this.name = name;
    }




}
public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student("김");  // id=1
        Student s2 = new Student("이");  // id=2
        Student s3 = new Student("박");  // id=3
//        System.out.println(Student.getStudentCount()); // 3
    }
}
