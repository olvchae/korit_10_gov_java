package study.ch07;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int searchNumber = 6;
        int foundIndex = -1;
        for (int i = 0; i < 10; i++){
            int num = i + 1;
            if (num == searchNumber) {
                foundIndex = i;
                break;  //자원낭비방지
            }
        }

        System.out.println("검색 번호 : " + searchNumber);
        System.out.println("찾은 Index : " + foundIndex);

        //while에서는 break가 전원을 끄는 것과 동일한 역할을 함

        Scanner sc = new Scanner(System.in);

        while (true) { //양이 얼만큼인지 모를 때 무한루프 돌림
            System.out.print("프로그램을 종료하려면 close를 입력해주세요(계속 사용하시려면 아무키나 입력): ");
            if (sc.nextLine().equals("close")) {
                break;
            }
            System.out.println("프로그램 실행 중...");
        }

    }
}
