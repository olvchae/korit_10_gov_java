package study.ch16;

import lombok.Builder;

import java.security.PublicKey;
@Builder //lombok에 이미 있음
class UserEntity2 {
    private String username;
    private String password;
}

public class BuilderMain {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity("aaa", "1234", "김은채", "aa@gmail.com");
        UserEntity userEntity2 = new UserEntity("aaa", null, null, "aa@gmail.com");
        UserEntity userEntity3 = new UserEntity();
        userEntity3.setUsername("bbb");
        UserEntity userEntity4 = UserEntity.builder()
                .username("ccc")
                .password("1111")
                .name("김은채")
                .email("aa@gmail.com")
                .build();

    }
}
