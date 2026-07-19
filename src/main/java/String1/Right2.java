package String1;

public class Right2 {
    public static void main(String[] args) {
        Right2 a = new Right2();
        System.out.println(a.right2("Hello"));
    }

    public String right2(String str) {
        if (str.length() <= 2) {
            return str;
        } else {
            String last = str.substring(0, str.length() - 2);
            return str.substring(str.length() - 2) + last;
        }
    }
}
