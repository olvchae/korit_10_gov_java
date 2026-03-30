package study.ch07;

public class Main5 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                continue; //실행여부 여기서 판단
//                //반드시 실행해야 할 것은 continue 위, 아닌 것은 아래
//            }
//            System.out.println("i: " + i);
//
//        }

        int i = 0;
        while (i < 10) {
            int ii = i++;
            if ( ii % 2 != 0){
                continue;
            }
            System.out.println("i: " + ii);
        }

    }
}
