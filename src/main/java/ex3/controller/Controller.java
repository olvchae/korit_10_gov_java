package ex3.controller;

import ex3.dto.ResponseDto;
import ex3.router.RouterPath;
import ex3.router.Routes;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    public static ResponseDto<Map<String, Object>> homeController (String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try{
            if ("1".equals(selectedMenu)) {
                RouterPath.current = Routes.ACCOUNT.name();
            } else if ("2".equals(selectedMenu)) {
                RouterPath.current = Routes.DEPOSIT.name();
            } else if ("3".equals(selectedMenu)) {
                RouterPath.current = Routes.WITHDRAWAL.name();
            } else if ("4".equals(selectedMenu)) {

            } else if ("5".equals(selectedMenu)) {

            } else if ("6".equals(selectedMenu)) {

            } else if ("q".equals(selectedMenu)) {
                responseDto.setStatus(100);
            } else {
                throw new RuntimeException("해당 입력 값은 유효하지 않습니다. 다시 입력하세요.");
            }
        } catch (RuntimeException e){
            Map<String, Object> errorMap = Map.of(
                    "message", e.getMessage()
            );
            responseDto = new ResponseDto<>(400, errorMap);
        }
        return responseDto;
    }
}
