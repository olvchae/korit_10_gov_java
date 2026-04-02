package study.ch10.ex;

import java.util.Arrays;

public class Ex29 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3,7,1},{9,2,6},{4,8,5}};

        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("최대값: " + max + "위치: " );

    }
}
