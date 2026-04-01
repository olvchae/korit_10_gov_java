package study.ch09.ex;

public class MathUtil {

    int max(int a, int b){
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c){
        return max(max(a, b), c);
    }

    double max(double a, double b){
        return (a > b) ? a : b;
    }
}
