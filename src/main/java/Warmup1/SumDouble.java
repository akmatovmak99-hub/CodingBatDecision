package Warmup1;

public class SumDouble {
    public static void main(String[] args) {
        SumDouble a = new SumDouble();
        System.out.println(a.sumDouble(1,3));
    }

    public int sumDouble(int a, int b) {
        if (a == b) return (a + b) * 2;
        return a + b;
    }
}
