package study.ch02;

public class Main {
    public static void main(String[] args) {
        String name = "김은채";
        System.out.println(name);
        String name2 = "김" + "은" + "채"  + 2;  //숫자 -> 문자열로 승격
        System.out.println(name2);
        System.out.print("김\t");
        System.out.print("은");
        System.out.print("채");
        //주석: 소스코드 중간중간 메모를 남길 때 사용(프로그램 실행시 영향 주지 않음)
        //string vs String
        //역슬래시 붙는 것들 = 이스케이프 문자
    }
}
