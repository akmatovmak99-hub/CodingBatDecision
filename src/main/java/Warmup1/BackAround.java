package Warmup1;

public class BackAround {
    public static void main(String[] args) {
        BackAround a = new BackAround();
        System.out.println(a.backAround("Hello"));
    }

    public String backAround(String str) {
        if (str.length() < 1) return "";
        char lastLetter = str.charAt(str.length() - 1);
        return lastLetter + str + lastLetter;
    }

}
