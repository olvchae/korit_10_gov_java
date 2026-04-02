package study.ch10.ex;

public class Ex27 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{10,20,30},{40,50,60},{70,80,90}};


        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr.length; j++){
                sum += arr[i][j];
            }
            System.out.println(i + "행 합계: " + sum);
        }
    }
}
