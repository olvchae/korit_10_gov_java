package study.ch18;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;

@Data
@Builder
public class SuccessResponse<T> {
    private int code;
    private T body;
}
