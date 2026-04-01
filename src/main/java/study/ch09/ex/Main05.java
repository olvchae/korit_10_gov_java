package study.ch09.ex;

class Rectangle {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }
}

public class Main05 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        System.out.println("넓이: " + r.getArea());
        System.out.println("둘레: " + r.getPerimeter());
    }
}
