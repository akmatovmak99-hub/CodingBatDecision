package Warmup2;

public class ArrayFront9 {
    public static void main(String[] args) {
        ArrayFront9 a = new ArrayFront9();
        System.out.println(a.arrayFront9(new int []{2,6,4,4}));
    }
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i=0; i<end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }

}
