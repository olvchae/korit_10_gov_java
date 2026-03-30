package study.ch07.ex;

public class Ex35 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) break;
                System.out.println("i=" + i + ", j=" + j);
            }
        } // i=1, j=1
          // i=2, j=1
          // i=3, j=1
    }
}
