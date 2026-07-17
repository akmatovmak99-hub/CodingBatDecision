package Warmup1;

public class EveryNth {
    public static void main(String[] args) {
        EveryNth a = new EveryNth();
        System.out.println(a.everyNth("Miracle",3));
    }
    public String everyNth(String str, int n) {
        String result = "";
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
