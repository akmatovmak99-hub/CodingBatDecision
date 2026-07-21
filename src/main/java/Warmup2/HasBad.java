package Warmup2;

public class HasBad {
    public static void main(String[] args) {
        HasBad a = new HasBad();
        System.out.println(a.hasBad("badxx"));
    }

    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        } else {
            return str.startsWith("bad") || str.startsWith("bad", 1);
        }
    }

}
