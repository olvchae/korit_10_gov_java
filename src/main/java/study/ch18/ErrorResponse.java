package study.ch18;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private int code;
    private Object body;  //여러 타입이 다 가능한 object를 타입으로 선택

    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <T, R> R print2(T data, R returnData) {
        System.out.println(data);
        return returnData;
    }

}
