package ex3.view;

import ex2.util.Input;
import ex3.model.Account;
import ex3.router.RouterPath;
import ex3.router.Routes;

public class AccountView implements View{
    @Override
    public void render() {
        accountMenu();
        String cmd = Input.nextLine();
        if ("1".equals(cmd)){
//            System.out.print("생성자 이름 입력: ");
//            Account account = new Account(Input.nextLine());
//            System.out.println();
//            System.out.print("생성자 이름 입력: ");

        }
        if("b".equals(cmd)){
            RouterPath.current = Routes.HOME.name();
            return;
        }
    }

    public void accountMenu() {
        System.out.println("======<< ACCOUNT >>======");
        System.out.println("1. 계좌생성");
        System.out.println("b. 뒤로가기");
        System.out.println("=========================");
        System.out.println();
    }
}
