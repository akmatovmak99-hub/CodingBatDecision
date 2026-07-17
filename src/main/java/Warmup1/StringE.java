package Warmup1;

public class StringE {
    public static void main(String[] args) {
        StringE a = new StringE();
        System.out.println(a.stringE("Hello"));
    }
    public boolean stringE(String str) {
        int eLetter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                eLetter++;
            }
        }
        if (eLetter > 0 && eLetter < 4) return true;
        return false;
    }

}
