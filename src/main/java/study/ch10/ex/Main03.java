package study.ch10.ex;

public class Main03 {
    public static void main(String[] args) {
        int[] nums = new int[]{34, 78, 12, 56, 91, 23};
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = (nums[i] > max) ? nums[i] : max;
        }
        System.out.println("최대값: " + max);
    }
}
