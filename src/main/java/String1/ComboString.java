package String1;

public class ComboString {
    public static void main(String[] args) {
        ComboString a = new ComboString();
        System.out.println(a.comboString("Hello", "hi"));
    }
    public String comboString(String a, String b) {
        if (a.length()>b.length()){
            return b+a+b;
        }else return a+b+a;
    }

}
