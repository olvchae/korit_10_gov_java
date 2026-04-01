package study.ch09.ex;

class Car{
    private String brand;
    private String color;
    private int speed;

    Car(String brand){
        this(brand, "검정", 0);
    }

    Car(String brand, String color){
        this(brand, color, 0);
    }

    Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    void accelerate(int amount){
        speed += amount;
    }

    void accelerate(){
        accelerate(10);
    }

    void brake(){
        speed -= 10;
        if(speed < 0){
            speed = 0;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    void printStatus(){
        System.out.println("[" + brand + "/" + color + "] 현재 속도:" + speed + " km/h");
    }
}
public class Main20 {
}
