package ex3.view;

import ex2.util.Input;
import ex3.Ex3Application;
import ex3.router.RouterPath;
import ex3.router.Routes;

public class DepositView implements View{
    @Override
    public void render() {
        depositMenu();
        String cmd = Input.nextLine();
        if ("b".equals(cmd)){
            RouterPath.current = Routes.HOME.name();
            return;
        }
    }

    public void depositMenu() {
        System.out.println("======<< Deposit >>======");
        System.out.println("2. 입금");
        System.out.println("b. 뒤로가기");
        System.out.println("=========================");
        System.out.println();

    }
}
