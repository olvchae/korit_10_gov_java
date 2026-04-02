package study.ch10;

public class Array01 {
    public static void main(String[] args) {
        int[] nums1 = new int[5];
        int[] nums2 = new int[] {10, 20, 30, 40, 50};
        int[] nums3 = {10, 20, 30, 40, 50};

        System.out.println(nums1[0]);
        System.out.println(nums2[0]);
        System.out.println(nums3[0]);
        int num1 = nums1[1];
        int num2 = nums2[1];
        int num3 = nums3[1];
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        nums1[0] = 100;
        nums1[1] = 1000;
        nums1[2] = 10000;



    }
}
