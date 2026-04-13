package ex1;

import ex1.util.InputUtil;
import ex1.view.MainView;
import study.ch14.Equals;
import study.ch14.Main;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Ex1Application {
    public static void main(String[] args) throws IOException {
        Map<String, List<Long>> resultMap =  new HashMap<>();
        resultMap.put("scanner", new ArrayList<>());
        resultMap.put("custom", new ArrayList<>());
        resultMap.put("draw", new ArrayList<>());

        for(int i = 0; i < 100; i++){
            Scanner sc = new Scanner(new StringReader("100000000"));  //Scanner 자료형의 레퍼런스 변수 scanner에 Scanner 클래스의 객체를 생성하고 주소를 참조
            long t1 = System.nanoTime();
            if (sc.hasNextInt()) sc.nextInt();
            long t2 = System.nanoTime();

            long t3 = System.nanoTime();
            InputUtil.nextInt(new StringReader("100000000"));
            long t4 = System.nanoTime();

            long sTime = t2 - t1;
            long cTime = t4 - t3;

            if(sTime < cTime){
                resultMap.get("scanner").add(sTime);
            } else if (sTime > cTime){
                resultMap.get("custom").add(cTime);
            } else {
                resultMap.get("draw").add(cTime);
            }
        }
        System.out.println(resultMap);
        System.out.println(resultMap.get("custom").stream().mapToLong(t -> t).sum() / resultMap.get("custom").size());
        System.out.println(resultMap.get("scanner").stream().mapToLong(t -> t).sum() / resultMap.get("scanner").size());

//        System.out.println(b);
//        int sum = b.stream().mapToInt(e -> e.intValue()).sum();
//        System.out.println(sum);
//        System.out.println("scanner: " + b.stream().filter(bb -> bb).count());
//        System.out.println("custom: " + b.stream().filter(bb -> !bb).count());



//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("[ 학생관리 프로그램 실행 ]");
        boolean flag = true;

//        while (flag) {  //while문으로 무한루프를 돌림
//           MainView.getInstance().run();  // MainView 클래스의 getInstance 메서드를 호출하여 객체를 생성하고 run 메서드 호출
//           System.out.print("입력: ");
//           List<Integer> ints = InputUtil.nextInts();
//           int s = InputUtil.nextInt();
//
//           if(s == 1) { //1이 입력받은 값과 같다면 실행
//
//           } else if (s == 2){  //2가 입력받은 값과 같다면 실행
//
//           } else if (s == 3){ //3이 입력받은 값과 같다면 실행
//
//           } else if (s == 4){ //4가 입력받은 값과 같다면 실행
//
//           } else if (s == 5){ //5가 입력받은 값과 같다면 실행
//
//           } else if (s == 6){ //6이 입력받은 값과 같다면 break -> 반복문 빠져나감
//               break;
//           } else {
//               System.out.println("다시 입력하세요.");  //위 경우 모두 아니라면 해당 문자열 출력
//           }
//
//        }

        System.out.println("[ 학생관리 프로그램 종료 ]");
    }
}
