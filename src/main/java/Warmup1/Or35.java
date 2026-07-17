package Warmup1;

public class Or35 {
    public static void main(String[] args) {
        Or35 a = new Or35();
        System.out.println(a.or35(10));
    }

    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

}
