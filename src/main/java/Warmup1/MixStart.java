package Warmup1;

public class MixStart {
    public static void main(String[] args) {
        MixStart a =new MixStart();
        System.out.println(a.mixStart("mixShake"));
    }
    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String ix9 = str.substring(1, 3);
        if (ix9.contains("ix")) return true;
        return false;
    }

}
