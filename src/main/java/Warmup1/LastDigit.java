package Warmup1;

public class LastDigit {
    public static void main(String[] args) {
        LastDigit a = new LastDigit();
        System.out.println(a.lastDigit(7,17));
    }

    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

}
