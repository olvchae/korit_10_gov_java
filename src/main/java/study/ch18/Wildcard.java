package study.ch18;

import study.ch17.User;

class Person {

}

class Student extends Person {

}

class HighStudent extends Student {

}

public class Wildcard {
    public static void print(SuccessResponse<?> sr) { //Object를 상속받은 거임
        System.out.println(sr);
    }

    public static void print2(SuccessResponse<? extends Student> sr){  //방향이 자식을 향함
        System.out.println(sr);
    }

    public static void print3(SuccessResponse<? super Student> sr){  //방향이 부모를 향함
        System.out.println(sr);
    }

    public static void main(String[] args) {
        SuccessResponse<User> sr1 = new SuccessResponse<>(200, User.builder().build());
        SuccessResponse<String> sr2 = new SuccessResponse<>(201, "그냥 문자열");

        Wildcard.print(sr1);
        Wildcard.print(sr2);

//        Wildcard.print2(new SuccessResponse<>(200, new Person()));
        Wildcard.print2(new SuccessResponse<>(200, new Student()));

        Wildcard.print3(new SuccessResponse<Student>(201, new Student()));
//        Wildcard.print3(new SuccessResponse<HighStudent>(201, new HighStudent()));  //하안 제한 걸림




    }
}
