package Warmup1;

public class In3050 {
    public static void main(String[] args) {
        In3050 a = new In3050();
        System.out.println(a.in3050(31,30));
    }
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) return true;
        if (b >= 40 && b <= 50 && a >= 40 && a <= 50) return true;
        return false;
    }

}
