package study.ch21.ex;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try{
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("오류가 발생했습니다.");
        }
        System.out.println("정상 실행");
    }
}
