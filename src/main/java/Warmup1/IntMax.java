package Warmup1;

public class IntMax {
    public static void main(String[] args) {
        IntMax a = new IntMax();
        System.out.println(a.intMax(12,13,15));
    }

    public int intMax(int a, int b, int c) {
        int[] num = {a, b, c};
        int max = Integer.MIN_VALUE;
        for (int maxNum : num) {
            if (maxNum > max) {
                max = maxNum;
            }
        }
        return max;
    }

}
