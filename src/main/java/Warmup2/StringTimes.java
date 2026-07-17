package Warmup2;

public class StringTimes {
    public static void main(String[] args) {
        StringTimes a = new StringTimes();
        System.out.println(a.stringTimes("Hi",2));
    }

    public String stringTimes(String str, int n) {
        String text = "";
        for (int i = 0; i < n; i++) {
            text += str;
        }
        return text;
    }

}
