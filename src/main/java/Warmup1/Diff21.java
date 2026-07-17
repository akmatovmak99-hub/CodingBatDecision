package Warmup1;

public class Diff21 {
    public static void main(String[] args) {
        Diff21 a = new Diff21();
        System.out.println(a.diff21(19));
    }

    public int diff21(int n) {
        if (n > 21) return (n - 21) * 2;
        return 21 - n;
    }
}
