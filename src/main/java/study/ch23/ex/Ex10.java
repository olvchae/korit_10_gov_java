package study.ch23.ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
class Order {
    private int orderId;
    private String productName;
    private int amount;
}

public class Ex10 {
    public static void main(String[] args) {
        List<Map<String, Object>> orderData = List.of(
                Map.of("orderId", 1, "productName", "mouse", "amount", 35000),
                Map.of("orderId", 2, "productName", "laptop", "amount", 1500000),
                Map.of("orderId", 3, "productName", "keyboard", "amount", 120000),
                Map.of("orderId", 4, "productName", "usb", "amount", 8000),
                Map.of("orderId", 5, "productName", "monitor", "amount", 350000)
        );

        List<Order> orders = orderData.stream()
                .map(order -> new Order(
                        (Integer) order.get("orderId"),
                        (String) order.get("productName"),
                        (Integer) order.get("amount")))
                .toList();

        List<String> orderList = orders.stream()
                .filter(amount -> amount.getAmount() >= 10000)
                .map(pn -> pn.getProductName().toUpperCase())
                .toList();

        System.out.println(orderList);
    }
}
