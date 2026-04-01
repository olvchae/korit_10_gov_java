package study.ch09.ex;

class Member {
    String name;
    int age;

    Member(String name) {
        this(name, 0);
        this.name = name;// 오류!
    }

    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Main14 {
}
