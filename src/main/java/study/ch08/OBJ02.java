package study.ch08;

public class OBJ02 {
    public static void main(String[] args) {
        class Addition{
            int defaultNumber = 10;

            // 1. 중복 코드 제거
            // 2. 기능별로 코드를 나눌 때

            int add(int a, int b){
                System.out.println("변수a: " + a); //100
                System.out.println("변수b: " + b); //200
                System.out.println("기본값: " + defaultNumber); //10
                return a + b + defaultNumber; //310
            }
        }

        Addition add1 = new Addition(); //객체 생성 후 add1이 객체 주소 참조
        int num = 1000;
        int num2 = add1.add(100, 200);  //add 객체 접근 후 함수 호출 -> 인자 전달 -> num2에 310 대입됨
        System.out.println(num + num2); //1310 출력
    }
}

