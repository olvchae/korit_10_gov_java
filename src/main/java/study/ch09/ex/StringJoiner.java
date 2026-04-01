package study.ch09.ex;

public class StringJoiner {
    String join(String a, String b){
        return a + "+" + b;
    }

    String join(String a, String b, String c){
        return a + "+" + b + "+" + c;
    }

    String join(String[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
           sb.append(arr[i]);
           if(i < arr.length - 1) {
               sb.append("+");
           }
        }
        return sb.toString();
    }
}
