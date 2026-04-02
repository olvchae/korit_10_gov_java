package study.ch10;

public class Array02 {
    public static void main(String[] args) {
        int[] iArr = {1, 2, 3, 4, 5};
        char[] cArr = {'a', 'b', 'c'};
        boolean [] bArr = {true, false, true, false};
        double[] dArr = {1.0, 3.14, 5.5};
        String[] sArr = {"김은채", "김은치", "김으채"};

        class Student{
            private String name;

            Student() {}
            Student (String name){
                this.name = name;
            }

            public void setName(String name){
                this.name = name;
            }
        }

        Student[] students = {
                new Student("김은채"),
                new Student("김은치"),
                new Student("김으채")
        };

        Student[] students2 = {new Student(), new Student(), new Student()};
        Student[] students3 = new Student[3];
        students2[0].setName("김은채");
        students2[1].setName("김은채");
        students2[2].setName("김은채");


    }
}
