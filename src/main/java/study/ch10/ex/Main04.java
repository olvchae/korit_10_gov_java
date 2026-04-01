package study.ch10.ex;

public class Main04 {
    public static void main(String[] args) {
        int[] nums = new int[] {44, 11, 77, 33, 55};
        int min = nums[0];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
                index = i;
            }
        }
        System.out.println("최소값: " + min + ", 위치: " + index);
    }
}
