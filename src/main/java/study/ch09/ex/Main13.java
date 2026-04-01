package study.ch09.ex;

class Product {
    String name;
    int price;
    String category;

    Product(String name) {
        this(name, 0, "기타");
    }

    Product(String name, int price) {
        this(name, price, "기타");
    }

    Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void printInfo() {
        System.out.println(name + "/" + price + "원/" + category);
    }
}

public class Main13 {
    public static void main(String[] args) {
        Product p1 = new Product("마우스");
        Product p2 = new Product("키보드", 50000);
        Product p3 = new Product("모니터", 300000, "전자기기");
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
    }
}
