package study.ch15;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("김은채");
        student.setAge(22);
        student.setAddress("부산진구");
        System.out.println(student);
        Student student2 = new Student("김은채", 22, "남구");
        System.out.println(student2);

        final String data = "임시 데이터";  //상수
//        data = "s"; 상수는 한 번 초기화 후 변경 할 수 없음
        System.out.println(data);

        final String data2;
        data2 = "test";
        //상수는 무조건 초기화

        Student student3 = new Student("김은채", 22);
    }
}
