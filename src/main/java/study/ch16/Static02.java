package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

class User{
    private Long id;
    private String username;
    private String password;


}

class UserRepository{
    private final User[] users;
    private Long lastCreatedId = 0l;

    public UserRepository(){
        users = new User[1000];
    }

    public void addUser(User user){
        boolean isSuccess = false;
        for(int i = 0; i < users.length; i++){
            if (users[i] == null){
                user.setId(++lastCreatedId);
                users[i] = user;
                isSuccess = true;
                break;
            }
            if (!isSuccess){
                System.out.println("사용자 추가 실패");
                return;
            }
            System.out.println("사용자 추가 성공");
            System.out.println("추가된 사용자 정보:" + user);
        }
    }
}

class UserService{

}

class UserController{

}

public class Static02 {
    public static void main(String[] args) {

    }
}
