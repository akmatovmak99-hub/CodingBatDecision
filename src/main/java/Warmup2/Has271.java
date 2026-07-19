package Warmup2;

public class Has271 {
    public static void main(String[] args) {
        Has271 a =new Has271();
        System.out.println(a.has271(new int[]{1, 2, 7, 1}));
    }
    public boolean has271(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];
            if (nums[i+1] == (val+5) &&
                    Math.abs(nums[i+2] - (val-1)) <= 2) {
                return true;
            }
        }
        return false;
    }

}
