package study.ch07.ex;

public class Ex36 {
    public static void main(String[] args) {
        // 코드 A: break
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.print(i + " ");
        }

        System.out.println();
        // 1 2
        //

        // 코드 B: continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.print(i + " ");
        }
    }   // 1 2 4 5
}
