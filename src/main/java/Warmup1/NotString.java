package Warmup1;

public class NotString {
    public static void main(String[] args) {
        NotString a = new NotString();
        System.out.println(a.notString("candy"));
    }

    public String notString(String str) {
        if(str.startsWith("not"))return str;
        return "not "+str;
    }


}
