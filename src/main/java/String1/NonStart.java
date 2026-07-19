package String1;

public class NonStart {
    public static void main(String[] args) {
        NonStart a =new NonStart();
        System.out.println(a.nonStart("Hello", "There"));
    }
    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }
}
