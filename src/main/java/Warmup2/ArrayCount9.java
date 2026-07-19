package Warmup2;

public class ArrayCount9 {
    public static void main(String[] args) {
        System.out.println(arrayCount9(new int[]{2,9,6}));
    }
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }
}
