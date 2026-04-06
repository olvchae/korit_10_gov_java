package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Getter;

//내부클래스(BB)
class AA {
    @Getter
    @AllArgsConstructor
    //생성하지 않아도 접근 가능해야 하므로 static
    static class BB { //인스턴스 클래스 = inner class
        private String name;
    }

    @Getter
    @AllArgsConstructor
    class CC{
        private String text;
    }
}

public class Static04 {
    public static void main(String[] args) {
        AA a = new AA();
        AA.BB b = new AA.BB("이름");
        AA.CC c = a.new CC("문자열");
        AA.CC c2 = (new AA()).new CC("문자열");

        b.getName();
        c.getText();
    }
}
