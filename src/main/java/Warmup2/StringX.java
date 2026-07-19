package Warmup2;

public class StringX {
    public static void main(String[] args) {
        StringX a =new StringX();
        System.out.println(a.stringX("xxHxix"));
    }
    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }

}
