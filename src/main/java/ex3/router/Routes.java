package ex3.router;

import ex3.view.*;
import lombok.Getter;

public enum Routes {
    HOME(new HomeView()), ACCOUNT(new AccountView()), DEPOSIT(new DepositView()), WITHDRAWAL(new WithdrawalView());
    //enum은 객체의 키워드를 정할 수 있음
    //한 번 생성될 때 키워드로 지정한 애들 한 번에 생성하고, 한 번만 생성함
    //values() 배열로 순서대로 객체가 나옴 -> Arrays.toString 으로 변환해서 결과값 얻을 수 있음
    //valueof(String name) -> name = enum의 키워드
    //name()-> 문자열로 가져오고 싶으면 사용
    //키워드 중복 안 됨
    //키워드()여기서 ()생략되어 있는 거임 -> 기본 생성자

     @Getter
     private View view;

     Routes (View view){
         this.view = view;
     }

     // HOME(new HomeView())에서 new HomeView()얘를 생성자에 매개변수로 넘기고 멤버변수 view에 저장한 거임

}
