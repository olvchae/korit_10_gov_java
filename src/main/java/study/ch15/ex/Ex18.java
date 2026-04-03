package study.ch15.ex;

import java.util.Arrays;

interface Sortable{
    void sort();
    void printResult();
}

class NumberSorter implements Sortable{
    int[] iarr = new int[5];

    public NumberSorter(int[] iarr) {
        this.iarr = iarr;
    }

    @Override
    public void sort() {
        int num = iarr.length;
        int temp = 0;
        for (int i = 0; i < num - 1 ; i++){
            for(int j = 0; j < num - 1; j++){
                if(iarr[j] > iarr[j + 1]){
                    temp = iarr[j];
                    iarr[j] = iarr[j + 1];
                    iarr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void printResult() {
        System.out.println(Arrays.toString(iarr));
    }
}

class StringSorter implements Sortable{
    String[] sarr = new String[5];

    public StringSorter(String[] sarr) {
        this.sarr = sarr;
    }

    @Override
    public void sort() {
        int num = sarr.length;
        String temp = "";
        for (int i = 0; i < num - 1 ; i++){
            for(int j = 0; j < num - 1; j++){
                if(sarr[j].compareTo(sarr[j + 1]) > 0){
                    temp = sarr[j];
                    sarr[j] = sarr[j + 1];
                    sarr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void printResult() {
        System.out.println(Arrays.toString(sarr));
    }
}

public class Ex18 {
    public static void main(String[] args) {
        int[] iarr = new int[]{1, 10, 4, 5, 2};
        String[] sarr = new String[]{"apple", "final", "banana", "strong", "key"};

        Sortable[] list = {new NumberSorter(iarr), new StringSorter(sarr)};
        for(Sortable array : list){
            array.sort();
            array.printResult();
        }
    }
}
