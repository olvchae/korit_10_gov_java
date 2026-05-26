package study.ch28;

import java.util.Objects;

public record CustomerDto(int id, String name, String phone) {
    // allarg 만든 거나 다름없음
    // 데이터 수정 불가 - 읽기 전용 - Reader
    // 클래스는 클래스인데 ()안에 매개변수처럼 넣어줄 수 있음
    // 오버로딩 안 됨 (매개변수에 넣은 애들이 파이널 처리 됨)

    public  CustomerDto {
        // 생성자 정의
        // 오류 검사나 null값 처리나 예외처리 할 떄 레코드 생성자 사용

        if (name == null || Objects.equals(name.trim(), "")) {
            throw new IllegalArgumentException("이름은 필수입니다.");
        }
    }

    public void test() {
        System.out.println("테스트 출력");
    }
}
