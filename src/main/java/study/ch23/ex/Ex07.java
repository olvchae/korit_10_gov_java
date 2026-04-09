package study.ch23.ex;

import java.util.List;
import java.util.Map;

public class Ex07 {
    public static void main(String[] args) {
        List<Map<String, Object>> productMaps = List.of(
                Map.of("code", 1001, "name", "노트북", "price", 1200000),
                Map.of("code", 1002, "name", "마우스", "price", 35000),
                Map.of("code", 1003, "name", "키보드", "price", 55000)
        );

        List<Product> products = productMaps.stream()
                .filter(price -> (Integer) price.get("price") >= 50000)
                .map(pr -> new Product(
                        (Integer) pr.get("code"),
                        (String)  pr.get("name"),
                        (Integer) pr.get("price")
                )).toList();
        System.out.println(products);
    }
}
