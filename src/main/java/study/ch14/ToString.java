package study.ch14;

import java.util.Arrays;

class Student extends Object{
    private String name;
    private int score;

    public Student (String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "이름: " + name + "점수: " + score;
    }
}


public class ToString {
    public static void main(String[] args) {
        Student student = new Student("김은채", 90);
        System.out.println(student.toString());
        System.out.println(student);
        String a = student.toString();
        System.out.println(a);
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nums));
    }
}
