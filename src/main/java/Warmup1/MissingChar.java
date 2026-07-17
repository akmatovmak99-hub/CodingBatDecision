package Warmup1;

public class MissingChar {
    public static void main(String[] args) {
        MissingChar a = new MissingChar();
        System.out.println(a.missingChar("hello",3));
    }

    public String missingChar(String str, int n) {
        String start = str.substring(0, n);
        String end = str.substring(n + 1, str.length());
        return start + end;
    }

}
