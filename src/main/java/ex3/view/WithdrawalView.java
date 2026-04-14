package ex3.view;

import ex2.util.Input;
import ex3.router.RouterPath;
import ex3.router.Routes;

public class WithdrawalView implements View{
    @Override
    public void render() {
        withdrawalMenu();
        String cmd = Input.nextLine();
        if ("b".equals(cmd)){
            RouterPath.current = Routes.HOME.name();
            return;
        }
    }

    public void withdrawalMenu() {
        System.out.println("======<< WITHDRAWAL >>======");
        System.out.println("3. 출금");
        System.out.println("b. 뒤로가기");
        System.out.println("============================");
        System.out.println();
    }
}
