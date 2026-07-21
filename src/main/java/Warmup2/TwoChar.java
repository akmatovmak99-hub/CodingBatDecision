package Warmup2;

public class TwoChar {
    public static void main(String[] args) {
        TwoChar a = new TwoChar();
        System.out.println(a.twoChar("java", 3));
    }

    public String twoChar(String str, int index) {
        if (index<0||index + 2 > str.length()) {
            return str.substring(0, 2);
        } else return str.substring(index, index + 2);
    }

}
