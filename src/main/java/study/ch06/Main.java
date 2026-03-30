package study.ch06;

public class Main {
    public static void main(String[] args) {
        char c = 'a';

        switch (c){
            case 'a':
                System.out.println("a를 선언하셨습니다.");
            case 'b':
                System.out.println("b를 선언하셨습니다.");
                break;
            case 'c':
                System.out.println("c를 선언하셨습니다.");
            case 'd':
                System.out.println("d를 선언하셨습니다.");

        }
        //if문으로 하면 너무 많은 경우의 수가 생겨버림
        if (c == 'a'){
            System.out.println("a를 선언하셨습니다.");
            System.out.println("b를 선언하셨습니다.");
        } else if (c == 'b') {
            System.out.println("b를 선언하셨습니다.");
        }


    }
}
