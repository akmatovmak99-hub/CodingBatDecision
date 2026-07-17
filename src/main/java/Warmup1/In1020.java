package Warmup1;

public class In1020 {
    public static void main(String[] args) {
        In1020 a = new In1020();
        System.out.println(a.in1020(12,99));
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
}
