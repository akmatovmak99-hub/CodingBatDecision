package Warmup1;

public class Makes10 {
    public static void main(String[] args) {
        Makes10 a = new Makes10();
        System.out.println(a.makes10(5,8));
    }

    public boolean makes10(int a, int b) {
        if (a + b == 10 || a == 10 || b == 10) return true;
        return false;

    }

}
