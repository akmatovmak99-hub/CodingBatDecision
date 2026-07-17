package Warmup1;

public class Front3 {
    public static void main(String[] args) {
        Front3 a = new Front3();
        System.out.println(a.front3("Hello"));
    }

    public String front3(String str) {
        if (str.length()<=3)return str+str+str;
        String first3=str.substring(0,3);
        return first3+first3+first3;
    }

}
