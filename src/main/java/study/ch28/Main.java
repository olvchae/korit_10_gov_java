package study.ch28;

public class Main {
    public static void main(String[] args) {
        MenuDto menuDto = new MenuDto(1, "김치볶음밥", 8000);
        System.out.println(menuDto);
        CustomerDto customerDto = new CustomerDto(1, "김은채", "010-7474-5201");
        System.out.println(customerDto);
        System.out.println(menuDto.getId());
        System.out.println(menuDto.getName());
        System.out.println(menuDto.getPrice());
        System.out.println(customerDto.id());  //setter가 없음 = 생성될 떄 상수로 만들어져서 바꿀 수가 없음 (꺼내다 쓰기만 하는 경우 record 사용)
        System.out.println(customerDto.name());
        System.out.println(customerDto.phone());

        //Dto는 스프링부트에서 record로 만들 것임 (record 자바 17버전부터 지원하는 기능)
    }
}
