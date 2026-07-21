package String1;

public class NTwice {
    public static void main(String[] args) {
        NTwice a = new NTwice();
        System.out.println(a.nTwice("Hello", 2));
    }

    public String nTwice(String str, int n) {
        String front = str.substring(0, n);
        String end = str.substring(str.length() - n);
        return front + end;
    }

}
