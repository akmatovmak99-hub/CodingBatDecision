package Warmup1;

public class Front22 {
    public static void main(String[] args) {
        Front22 a = new Front22();
        System.out.println(a.front22("kitten"));
    }
    public String front22(String str) {
        if (str.length() < 2) return str + str + str;
        String first2 = str.substring(0, 2);
        return first2 + str + first2;
    }

}
