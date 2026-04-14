package ex3.view;

import ex2.util.Input;
import ex3.Ex3Application;
import ex3.controller.Controller;
import ex3.dto.ResponseDto;

import java.util.Map;
import java.util.Objects;

public class HomeView implements View{
    public void render() {
        homeMenu();
        String cmd = Input.nextLine();  //입력 받은 값을 cmd에 저장
        ResponseDto<Map<String, Object>> response = Controller.homeController(cmd);  //홈컨트롤러에 사용자 입력값 전달 (호출) -> 컨트롤러에서 입력값에 따른  if문 수행
        if (response.getStatus() == 100){  //response가 100이면 메인의 static으로 정한 running을 false로 바꿔서 반복문 중단
            Ex3Application.running = false;
            return;
        }
        if (response.getStatus() != 200) {  //response가 200이 아니면 homError에
            homeError(response.getData().get("message").toString());
            return;
        }
    }

    public void homeMenu() {
        System.out.println("======< HOME >======");
        System.out.println("1. 계좌생성");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 계좌조회");
        System.out.println("5. 전체목록");
        System.out.println("6. 거래내역");
        System.out.println("q. 종료");
        System.out.println("====================");
        System.out.println();
    }

    public void homeError(String message) {
        System.out.println("======< HOME >======");
        System.out.println("오류[ " + message + "]");
        System.out.println("====================");
        System.out.println();
    }
}
