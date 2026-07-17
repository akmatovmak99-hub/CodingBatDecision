package Warmup1;

public class PosNeg {
    public static void main(String[] args) {
        PosNeg a = new PosNeg();
        System.out.println(a.posNeg(1,-1,false));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) return (a < 0 && b < 0);
        return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }

}
