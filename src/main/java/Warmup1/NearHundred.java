package Warmup1;

public class NearHundred {
    public static void main(String[] args) {
        NearHundred a = new NearHundred();
        System.out.println(a.nearHundred(99));
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
}
