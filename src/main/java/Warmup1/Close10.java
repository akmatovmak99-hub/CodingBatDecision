package Warmup1;

public class Close10 {
    public static void main(String[] args) {
        Close10 a = new Close10();
        System.out.println(a.close10(13,9));
    }
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);
        if (aDiff < bDiff) return a;
        else if (bDiff < aDiff) return b;
        return 0;
    }

}
