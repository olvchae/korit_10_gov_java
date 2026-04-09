package study.ch23.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Student {
    private int studentCode;
    private String name;
    private int score;
}

public class Ex09 {
    public static void main(String[] args) {
        List<Map<String, Object>> data = List.of(
                Map.of("studentCode", 20260001, "name", "김준일", "score", 70),
                Map.of("studentCode", 20260002, "name", "김준이", "score", 80),
                Map.of("studentCode", 20260003, "name", "김준삼", "score", 90),
                Map.of("studentCode", 20260004, "name", "김준사", "score", 60),
                Map.of("studentCode", 20260005, "name", "김준오", "score", 85)
        );

        List<Student> studentList = data.stream()
                .map(student -> new Student(
                        (Integer) student.get("studentCode"),
                        (String) student.get("name"),
                        (Integer) student.get("score")))
                .toList();

        List<String> studentList2 = studentList.stream()
                .filter(score -> score.getScore() >= 75)
                .map(name -> name.getName()).toList();

        System.out.println(studentList2);
    }
}
