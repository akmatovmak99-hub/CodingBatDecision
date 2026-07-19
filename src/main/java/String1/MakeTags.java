package String1;

public class MakeTags {
    public static void main(String[] args) {
        MakeTags a =new MakeTags();
        System.out.println(a.makeTags("i", "Yay"));
    }
    public String makeTags(String tag, String word) {
        String res = "<"+tag+">";
        return res+word+"</"+tag+">";
    }

}
