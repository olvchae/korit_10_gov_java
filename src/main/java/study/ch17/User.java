package study.ch17;

import lombok.*;

@Data
@Builder  //기본적으로 @AllArgsConstructor를 포함하고 있음 빌더 구조가 그럼
//여기서 NoArgsConstructor 얘를 써버리면 all이 사라지기 때문에 no쓰고 싶으면 all 따로 작성해줘야 함
public class User {
    private Long id;
    private String username;
    private String password;
}
